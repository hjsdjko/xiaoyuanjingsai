package com.entity.vo;

import com.entity.JingsaiYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 竞赛报名
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jingsai_yuyue")
public class JingsaiYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 报名编号
     */

    @TableField(value = "jingsai_yuyue_uuid_number")
    private String jingsaiYuyueUuidNumber;


    /**
     * 竞赛
     */

    @TableField(value = "jingsai_id")
    private Integer jingsaiId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 报名理由
     */

    @TableField(value = "jingsai_yuyue_text")
    private String jingsaiYuyueText;


    /**
     * 报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 报名状态
     */

    @TableField(value = "jingsai_yuyue_yesno_types")
    private Integer jingsaiYuyueYesnoTypes;


    /**
     * 审核回复
     */

    @TableField(value = "jingsai_yuyue_yesno_text")
    private String jingsaiYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jingsai_yuyue_shenhe_time")
    private Date jingsaiYuyueShenheTime;


    /**
     * 竞赛作品
     */

    @TableField(value = "jingsai_yuyue_file")
    private String jingsaiYuyueFile;


    /**
     * 打分
     */

    @TableField(value = "jingsai_yuyue_dafen")
    private Double jingsaiYuyueDafen;


    /**
     * 评语
     */

    @TableField(value = "jingsai_yuyue_content")
    private String jingsaiYuyueContent;


    /**
     * 创建时间 show3 listShow
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
	 * 设置：报名编号
	 */
    public String getJingsaiYuyueUuidNumber() {
        return jingsaiYuyueUuidNumber;
    }


    /**
	 * 获取：报名编号
	 */

    public void setJingsaiYuyueUuidNumber(String jingsaiYuyueUuidNumber) {
        this.jingsaiYuyueUuidNumber = jingsaiYuyueUuidNumber;
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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：报名理由
	 */
    public String getJingsaiYuyueText() {
        return jingsaiYuyueText;
    }


    /**
	 * 获取：报名理由
	 */

    public void setJingsaiYuyueText(String jingsaiYuyueText) {
        this.jingsaiYuyueText = jingsaiYuyueText;
    }
    /**
	 * 设置：报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：报名时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：报名状态
	 */
    public Integer getJingsaiYuyueYesnoTypes() {
        return jingsaiYuyueYesnoTypes;
    }


    /**
	 * 获取：报名状态
	 */

    public void setJingsaiYuyueYesnoTypes(Integer jingsaiYuyueYesnoTypes) {
        this.jingsaiYuyueYesnoTypes = jingsaiYuyueYesnoTypes;
    }
    /**
	 * 设置：审核回复
	 */
    public String getJingsaiYuyueYesnoText() {
        return jingsaiYuyueYesnoText;
    }


    /**
	 * 获取：审核回复
	 */

    public void setJingsaiYuyueYesnoText(String jingsaiYuyueYesnoText) {
        this.jingsaiYuyueYesnoText = jingsaiYuyueYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getJingsaiYuyueShenheTime() {
        return jingsaiYuyueShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setJingsaiYuyueShenheTime(Date jingsaiYuyueShenheTime) {
        this.jingsaiYuyueShenheTime = jingsaiYuyueShenheTime;
    }
    /**
	 * 设置：竞赛作品
	 */
    public String getJingsaiYuyueFile() {
        return jingsaiYuyueFile;
    }


    /**
	 * 获取：竞赛作品
	 */

    public void setJingsaiYuyueFile(String jingsaiYuyueFile) {
        this.jingsaiYuyueFile = jingsaiYuyueFile;
    }
    /**
	 * 设置：打分
	 */
    public Double getJingsaiYuyueDafen() {
        return jingsaiYuyueDafen;
    }


    /**
	 * 获取：打分
	 */

    public void setJingsaiYuyueDafen(Double jingsaiYuyueDafen) {
        this.jingsaiYuyueDafen = jingsaiYuyueDafen;
    }
    /**
	 * 设置：评语
	 */
    public String getJingsaiYuyueContent() {
        return jingsaiYuyueContent;
    }


    /**
	 * 获取：评语
	 */

    public void setJingsaiYuyueContent(String jingsaiYuyueContent) {
        this.jingsaiYuyueContent = jingsaiYuyueContent;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
