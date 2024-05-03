
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 竞赛经费申请
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jingsaiJingfeishenqing")
public class JingsaiJingfeishenqingController {
    private static final Logger logger = LoggerFactory.getLogger(JingsaiJingfeishenqingController.class);

    private static final String TABLE_NAME = "jingsaiJingfeishenqing";

    @Autowired
    private JingsaiJingfeishenqingService jingsaiJingfeishenqingService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private ForumService forumService;//论坛
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private JingsaiService jingsaiService;//竞赛
    @Autowired
    private JingsaiCollectionService jingsaiCollectionService;//竞赛收藏
    @Autowired
    private JingsaiHuojiangmingdanService jingsaiHuojiangmingdanService;//获奖名单
    @Autowired
    private JingsaiLiuyanService jingsaiLiuyanService;//竞赛留言
    @Autowired
    private JingsaiYuyueService jingsaiYuyueService;//竞赛报名
    @Autowired
    private LaoshiService laoshiService;//老师
    @Autowired
    private NewsService newsService;//新闻信息
    @Autowired
    private XuexizhidaoService xuexizhidaoService;//学习指导
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("老师".equals(role))
            params.put("laoshiId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = jingsaiJingfeishenqingService.queryPage(params);

        //字典表数据转换
        List<JingsaiJingfeishenqingView> list =(List<JingsaiJingfeishenqingView>)page.getList();
        for(JingsaiJingfeishenqingView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JingsaiJingfeishenqingEntity jingsaiJingfeishenqing = jingsaiJingfeishenqingService.selectById(id);
        if(jingsaiJingfeishenqing !=null){
            //entity转view
            JingsaiJingfeishenqingView view = new JingsaiJingfeishenqingView();
            BeanUtils.copyProperties( jingsaiJingfeishenqing , view );//把实体数据重构到view中
            //级联表 竞赛
            //级联表
            JingsaiEntity jingsai = jingsaiService.selectById(jingsaiJingfeishenqing.getJingsaiId());
            if(jingsai != null){
            BeanUtils.copyProperties( jingsai , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setJingsaiId(jingsai.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JingsaiJingfeishenqingEntity jingsaiJingfeishenqing, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jingsaiJingfeishenqing:{}",this.getClass().getName(),jingsaiJingfeishenqing.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<JingsaiJingfeishenqingEntity> queryWrapper = new EntityWrapper<JingsaiJingfeishenqingEntity>()
            .eq("jingsai_id", jingsaiJingfeishenqing.getJingsaiId())
            .eq("jingsai_jingfeishenqing_name", jingsaiJingfeishenqing.getJingsaiJingfeishenqingName())
            .eq("jingsai_jingfeishenqing_types", jingsaiJingfeishenqing.getJingsaiJingfeishenqingTypes())
            .in("jingsai_jingfeishenqing_yesno_types", new Integer[]{1,2})
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JingsaiJingfeishenqingEntity jingsaiJingfeishenqingEntity = jingsaiJingfeishenqingService.selectOne(queryWrapper);
        if(jingsaiJingfeishenqingEntity==null){
            jingsaiJingfeishenqing.setInsertTime(new Date());
            jingsaiJingfeishenqing.setJingsaiJingfeishenqingYesnoTypes(1);
            jingsaiJingfeishenqing.setCreateTime(new Date());
            jingsaiJingfeishenqingService.insert(jingsaiJingfeishenqing);
            return R.ok();
        }else {
            if(jingsaiJingfeishenqingEntity.getJingsaiJingfeishenqingYesnoTypes()==1)
                return R.error(511,"有相同的待审核的数据");
            else if(jingsaiJingfeishenqingEntity.getJingsaiJingfeishenqingYesnoTypes()==2)
                return R.error(511,"有相同的审核通过的数据");
            else
                return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JingsaiJingfeishenqingEntity jingsaiJingfeishenqing, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,jingsaiJingfeishenqing:{}",this.getClass().getName(),jingsaiJingfeishenqing.toString());
        JingsaiJingfeishenqingEntity oldJingsaiJingfeishenqingEntity = jingsaiJingfeishenqingService.selectById(jingsaiJingfeishenqing.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");

            jingsaiJingfeishenqingService.updateById(jingsaiJingfeishenqing);//根据id更新
            return R.ok();
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody JingsaiJingfeishenqingEntity jingsaiJingfeishenqingEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,jingsaiJingfeishenqingEntity:{}",this.getClass().getName(),jingsaiJingfeishenqingEntity.toString());

        JingsaiJingfeishenqingEntity oldJingsaiJingfeishenqing = jingsaiJingfeishenqingService.selectById(jingsaiJingfeishenqingEntity.getId());//查询原先数据

//        if(jingsaiJingfeishenqingEntity.getJingsaiJingfeishenqingYesnoTypes() == 2){//通过
//            jingsaiJingfeishenqingEntity.setJingsaiJingfeishenqingTypes();
//        }else if(jingsaiJingfeishenqingEntity.getJingsaiJingfeishenqingYesnoTypes() == 3){//拒绝
//            jingsaiJingfeishenqingEntity.setJingsaiJingfeishenqingTypes();
//        }
        jingsaiJingfeishenqingEntity.setJingsaiJingfeishenqingShenheTime(new Date());//审核时间
        jingsaiJingfeishenqingService.updateById(jingsaiJingfeishenqingEntity);//审核

        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<JingsaiJingfeishenqingEntity> oldJingsaiJingfeishenqingList =jingsaiJingfeishenqingService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        jingsaiJingfeishenqingService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<JingsaiJingfeishenqingEntity> jingsaiJingfeishenqingList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            JingsaiJingfeishenqingEntity jingsaiJingfeishenqingEntity = new JingsaiJingfeishenqingEntity();
//                            jingsaiJingfeishenqingEntity.setJingsaiId(Integer.valueOf(data.get(0)));   //竞赛 要改的
//                            jingsaiJingfeishenqingEntity.setJingsaiJingfeishenqingUuidNumber(data.get(0));                    //竞赛经费申请编号 要改的
//                            jingsaiJingfeishenqingEntity.setJingsaiJingfeishenqingName(data.get(0));                    //竞赛经费申请名称 要改的
//                            jingsaiJingfeishenqingEntity.setJingsaiJingfeishenqingTypes(Integer.valueOf(data.get(0)));   //经费类型 要改的
//                            jingsaiJingfeishenqingEntity.setShangpinShouyinTruePrice(data.get(0));                    //申请金额(万) 要改的
//                            jingsaiJingfeishenqingEntity.setJingsaiJingfeishenqingContent("");//详情和图片
//                            jingsaiJingfeishenqingEntity.setInsertTime(date);//时间
//                            jingsaiJingfeishenqingEntity.setJingsaiJingfeishenqingYesnoTypes(Integer.valueOf(data.get(0)));   //申请状态 要改的
//                            jingsaiJingfeishenqingEntity.setJingsaiJingfeishenqingYesnoText(data.get(0));                    //审核回复 要改的
//                            jingsaiJingfeishenqingEntity.setJingsaiJingfeishenqingShenheTime(sdf.parse(data.get(0)));          //审核时间 要改的
//                            jingsaiJingfeishenqingEntity.setCreateTime(date);//时间
                            jingsaiJingfeishenqingList.add(jingsaiJingfeishenqingEntity);


                            //把要查询是否重复的字段放入map中
                                //竞赛经费申请编号
                                if(seachFields.containsKey("jingsaiJingfeishenqingUuidNumber")){
                                    List<String> jingsaiJingfeishenqingUuidNumber = seachFields.get("jingsaiJingfeishenqingUuidNumber");
                                    jingsaiJingfeishenqingUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> jingsaiJingfeishenqingUuidNumber = new ArrayList<>();
                                    jingsaiJingfeishenqingUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("jingsaiJingfeishenqingUuidNumber",jingsaiJingfeishenqingUuidNumber);
                                }
                        }

                        //查询是否重复
                         //竞赛经费申请编号
                        List<JingsaiJingfeishenqingEntity> jingsaiJingfeishenqingEntities_jingsaiJingfeishenqingUuidNumber = jingsaiJingfeishenqingService.selectList(new EntityWrapper<JingsaiJingfeishenqingEntity>().in("jingsai_jingfeishenqing_uuid_number", seachFields.get("jingsaiJingfeishenqingUuidNumber")));
                        if(jingsaiJingfeishenqingEntities_jingsaiJingfeishenqingUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(JingsaiJingfeishenqingEntity s:jingsaiJingfeishenqingEntities_jingsaiJingfeishenqingUuidNumber){
                                repeatFields.add(s.getJingsaiJingfeishenqingUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [竞赛经费申请编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        jingsaiJingfeishenqingService.insertBatch(jingsaiJingfeishenqingList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = jingsaiJingfeishenqingService.queryPage(params);

        //字典表数据转换
        List<JingsaiJingfeishenqingView> list =(List<JingsaiJingfeishenqingView>)page.getList();
        for(JingsaiJingfeishenqingView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JingsaiJingfeishenqingEntity jingsaiJingfeishenqing = jingsaiJingfeishenqingService.selectById(id);
            if(jingsaiJingfeishenqing !=null){


                //entity转view
                JingsaiJingfeishenqingView view = new JingsaiJingfeishenqingView();
                BeanUtils.copyProperties( jingsaiJingfeishenqing , view );//把实体数据重构到view中

                //级联表
                    JingsaiEntity jingsai = jingsaiService.selectById(jingsaiJingfeishenqing.getJingsaiId());
                if(jingsai != null){
                    BeanUtils.copyProperties( jingsai , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setJingsaiId(jingsai.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody JingsaiJingfeishenqingEntity jingsaiJingfeishenqing, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,jingsaiJingfeishenqing:{}",this.getClass().getName(),jingsaiJingfeishenqing.toString());
        Wrapper<JingsaiJingfeishenqingEntity> queryWrapper = new EntityWrapper<JingsaiJingfeishenqingEntity>()
            .eq("jingsai_id", jingsaiJingfeishenqing.getJingsaiId())
            .eq("jingsai_jingfeishenqing_uuid_number", jingsaiJingfeishenqing.getJingsaiJingfeishenqingUuidNumber())
            .eq("jingsai_jingfeishenqing_name", jingsaiJingfeishenqing.getJingsaiJingfeishenqingName())
            .eq("jingsai_jingfeishenqing_types", jingsaiJingfeishenqing.getJingsaiJingfeishenqingTypes())
            .in("jingsai_jingfeishenqing_yesno_types", new Integer[]{1,2})
            .eq("jingsai_jingfeishenqing_yesno_text", jingsaiJingfeishenqing.getJingsaiJingfeishenqingYesnoText())
//            .notIn("jingsai_jingfeishenqing_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JingsaiJingfeishenqingEntity jingsaiJingfeishenqingEntity = jingsaiJingfeishenqingService.selectOne(queryWrapper);
        if(jingsaiJingfeishenqingEntity==null){
            jingsaiJingfeishenqing.setInsertTime(new Date());
            jingsaiJingfeishenqing.setJingsaiJingfeishenqingYesnoTypes(1);
            jingsaiJingfeishenqing.setCreateTime(new Date());
        jingsaiJingfeishenqingService.insert(jingsaiJingfeishenqing);

            return R.ok();
        }else {
            if(jingsaiJingfeishenqingEntity.getJingsaiJingfeishenqingYesnoTypes()==1)
                return R.error(511,"有相同的待审核的数据");
            else if(jingsaiJingfeishenqingEntity.getJingsaiJingfeishenqingYesnoTypes()==2)
                return R.error(511,"有相同的审核通过的数据");
            else
                return R.error(511,"表中有相同数据");
        }
    }

}

