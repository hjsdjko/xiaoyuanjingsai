package com.entity.model;

import com.entity.JingsaiJingfeishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 竞赛经费申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JingsaiJingfeishenqingModel implements Serializable {
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
     * 竞赛经费申请编号
     */
    private String jingsaiJingfeishenqingUuidNumber;


    /**
     * 竞赛经费申请名称
     */
    private String jingsaiJingfeishenqingName;


    /**
     * 经费类型
     */
    private Integer jingsaiJingfeishenqingTypes;


    /**
     * 申请金额(万)
     */
    private Double shangpinShouyinTruePrice;


    /**
     * 申请缘由
     */
    private String jingsaiJingfeishenqingContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 申请状态
     */
    private Integer jingsaiJingfeishenqingYesnoTypes;


    /**
     * 审核回复
     */
    private String jingsaiJingfeishenqingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jingsaiJingfeishenqingShenheTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：竞赛经费申请编号
	 */
    public String getJingsaiJingfeishenqingUuidNumber() {
        return jingsaiJingfeishenqingUuidNumber;
    }


    /**
	 * 设置：竞赛经费申请编号
	 */
    public void setJingsaiJingfeishenqingUuidNumber(String jingsaiJingfeishenqingUuidNumber) {
        this.jingsaiJingfeishenqingUuidNumber = jingsaiJingfeishenqingUuidNumber;
    }
    /**
	 * 获取：竞赛经费申请名称
	 */
    public String getJingsaiJingfeishenqingName() {
        return jingsaiJingfeishenqingName;
    }


    /**
	 * 设置：竞赛经费申请名称
	 */
    public void setJingsaiJingfeishenqingName(String jingsaiJingfeishenqingName) {
        this.jingsaiJingfeishenqingName = jingsaiJingfeishenqingName;
    }
    /**
	 * 获取：经费类型
	 */
    public Integer getJingsaiJingfeishenqingTypes() {
        return jingsaiJingfeishenqingTypes;
    }


    /**
	 * 设置：经费类型
	 */
    public void setJingsaiJingfeishenqingTypes(Integer jingsaiJingfeishenqingTypes) {
        this.jingsaiJingfeishenqingTypes = jingsaiJingfeishenqingTypes;
    }
    /**
	 * 获取：申请金额(万)
	 */
    public Double getShangpinShouyinTruePrice() {
        return shangpinShouyinTruePrice;
    }


    /**
	 * 设置：申请金额(万)
	 */
    public void setShangpinShouyinTruePrice(Double shangpinShouyinTruePrice) {
        this.shangpinShouyinTruePrice = shangpinShouyinTruePrice;
    }
    /**
	 * 获取：申请缘由
	 */
    public String getJingsaiJingfeishenqingContent() {
        return jingsaiJingfeishenqingContent;
    }


    /**
	 * 设置：申请缘由
	 */
    public void setJingsaiJingfeishenqingContent(String jingsaiJingfeishenqingContent) {
        this.jingsaiJingfeishenqingContent = jingsaiJingfeishenqingContent;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getJingsaiJingfeishenqingYesnoTypes() {
        return jingsaiJingfeishenqingYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setJingsaiJingfeishenqingYesnoTypes(Integer jingsaiJingfeishenqingYesnoTypes) {
        this.jingsaiJingfeishenqingYesnoTypes = jingsaiJingfeishenqingYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getJingsaiJingfeishenqingYesnoText() {
        return jingsaiJingfeishenqingYesnoText;
    }


    /**
	 * 设置：审核回复
	 */
    public void setJingsaiJingfeishenqingYesnoText(String jingsaiJingfeishenqingYesnoText) {
        this.jingsaiJingfeishenqingYesnoText = jingsaiJingfeishenqingYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getJingsaiJingfeishenqingShenheTime() {
        return jingsaiJingfeishenqingShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setJingsaiJingfeishenqingShenheTime(Date jingsaiJingfeishenqingShenheTime) {
        this.jingsaiJingfeishenqingShenheTime = jingsaiJingfeishenqingShenheTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
