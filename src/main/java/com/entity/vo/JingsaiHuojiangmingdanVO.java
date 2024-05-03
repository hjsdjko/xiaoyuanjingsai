package com.entity.vo;

import com.entity.JingsaiHuojiangmingdanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 获奖名单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jingsai_huojiangmingdan")
public class JingsaiHuojiangmingdanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 竞赛
     */

    @TableField(value = "jingsai_id")
    private Integer jingsaiId;


    /**
     * 获奖名单编号
     */

    @TableField(value = "jingsai_huojiangmingdan_uuid_number")
    private String jingsaiHuojiangmingdanUuidNumber;


    /**
     * 名单详情
     */

    @TableField(value = "jingsai_huojiangmingdan_content")
    private String jingsaiHuojiangmingdanContent;


    /**
     * 法布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：竞赛
	 */
    public Integer getJingsaiId() {
        return jingsaiId;
    }


    /**
	 * 获取：竞赛
	 */

    public void setJingsaiId(Integer jingsaiId) {
        this.jingsaiId = jingsaiId;
    }
    /**
	 * 设置：获奖名单编号
	 */
    public String getJingsaiHuojiangmingdanUuidNumber() {
        return jingsaiHuojiangmingdanUuidNumber;
    }


    /**
	 * 获取：获奖名单编号
	 */

    public void setJingsaiHuojiangmingdanUuidNumber(String jingsaiHuojiangmingdanUuidNumber) {
        this.jingsaiHuojiangmingdanUuidNumber = jingsaiHuojiangmingdanUuidNumber;
    }
    /**
	 * 设置：名单详情
	 */
    public String getJingsaiHuojiangmingdanContent() {
        return jingsaiHuojiangmingdanContent;
    }


    /**
	 * 获取：名单详情
	 */

    public void setJingsaiHuojiangmingdanContent(String jingsaiHuojiangmingdanContent) {
        this.jingsaiHuojiangmingdanContent = jingsaiHuojiangmingdanContent;
    }
    /**
	 * 设置：法布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：法布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
