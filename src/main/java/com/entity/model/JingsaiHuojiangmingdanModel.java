package com.entity.model;

import com.entity.JingsaiHuojiangmingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 获奖名单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JingsaiHuojiangmingdanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 竞赛
     */
    private Integer jingsaiId;


    /**
     * 获奖名单编号
     */
    private String jingsaiHuojiangmingdanUuidNumber;


    /**
     * 名单详情
     */
    private String jingsaiHuojiangmingdanContent;


    /**
     * 法布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：竞赛
	 */
    public Integer getJingsaiId() {
        return jingsaiId;
    }


    /**
	 * 设置：竞赛
	 */
    public void setJingsaiId(Integer jingsaiId) {
        this.jingsaiId = jingsaiId;
    }
    /**
	 * 获取：获奖名单编号
	 */
    public String getJingsaiHuojiangmingdanUuidNumber() {
        return jingsaiHuojiangmingdanUuidNumber;
    }


    /**
	 * 设置：获奖名单编号
	 */
    public void setJingsaiHuojiangmingdanUuidNumber(String jingsaiHuojiangmingdanUuidNumber) {
        this.jingsaiHuojiangmingdanUuidNumber = jingsaiHuojiangmingdanUuidNumber;
    }
    /**
	 * 获取：名单详情
	 */
    public String getJingsaiHuojiangmingdanContent() {
        return jingsaiHuojiangmingdanContent;
    }


    /**
	 * 设置：名单详情
	 */
    public void setJingsaiHuojiangmingdanContent(String jingsaiHuojiangmingdanContent) {
        this.jingsaiHuojiangmingdanContent = jingsaiHuojiangmingdanContent;
    }
    /**
	 * 获取：法布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：法布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
