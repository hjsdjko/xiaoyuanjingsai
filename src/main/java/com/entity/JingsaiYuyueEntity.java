package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 竞赛报名
 *
 * @author 
 * @email
 */
@TableName("jingsai_yuyue")
public class JingsaiYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JingsaiYuyueEntity() {

	}

	public JingsaiYuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 报名编号
     */
    @ColumnInfo(comment="报名编号",type="varchar(200)")
    @TableField(value = "jingsai_yuyue_uuid_number")

    private String jingsaiYuyueUuidNumber;


    /**
     * 竞赛
     */
    @ColumnInfo(comment="竞赛",type="int(11)")
    @TableField(value = "jingsai_id")

    private Integer jingsaiId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 报名理由
     */
    @ColumnInfo(comment="报名理由",type="longtext")
    @TableField(value = "jingsai_yuyue_text")

    private String jingsaiYuyueText;


    /**
     * 报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="报名时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 报名状态
     */
    @ColumnInfo(comment="报名状态",type="int(11)")
    @TableField(value = "jingsai_yuyue_yesno_types")

    private Integer jingsaiYuyueYesnoTypes;


    /**
     * 审核回复
     */
    @ColumnInfo(comment="审核回复",type="longtext")
    @TableField(value = "jingsai_yuyue_yesno_text")

    private String jingsaiYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "jingsai_yuyue_shenhe_time")

    private Date jingsaiYuyueShenheTime;


    /**
     * 竞赛作品
     */
    @ColumnInfo(comment="竞赛作品",type="varchar(200)")
    @TableField(value = "jingsai_yuyue_file")

    private String jingsaiYuyueFile;


    /**
     * 打分
     */
    @ColumnInfo(comment="打分",type="decimal(10,2)")
    @TableField(value = "jingsai_yuyue_dafen")

    private Double jingsaiYuyueDafen;


    /**
     * 评语
     */
    @ColumnInfo(comment="评语",type="longtext")
    @TableField(value = "jingsai_yuyue_content")

    private String jingsaiYuyueContent;


    /**
     * 创建时间  listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：报名编号
	 */
    public String getJingsaiYuyueUuidNumber() {
        return jingsaiYuyueUuidNumber;
    }
    /**
	 * 设置：报名编号
	 */

    public void setJingsaiYuyueUuidNumber(String jingsaiYuyueUuidNumber) {
        this.jingsaiYuyueUuidNumber = jingsaiYuyueUuidNumber;
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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：报名理由
	 */
    public String getJingsaiYuyueText() {
        return jingsaiYuyueText;
    }
    /**
	 * 设置：报名理由
	 */

    public void setJingsaiYuyueText(String jingsaiYuyueText) {
        this.jingsaiYuyueText = jingsaiYuyueText;
    }
    /**
	 * 获取：报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：报名时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：报名状态
	 */
    public Integer getJingsaiYuyueYesnoTypes() {
        return jingsaiYuyueYesnoTypes;
    }
    /**
	 * 设置：报名状态
	 */

    public void setJingsaiYuyueYesnoTypes(Integer jingsaiYuyueYesnoTypes) {
        this.jingsaiYuyueYesnoTypes = jingsaiYuyueYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getJingsaiYuyueYesnoText() {
        return jingsaiYuyueYesnoText;
    }
    /**
	 * 设置：审核回复
	 */

    public void setJingsaiYuyueYesnoText(String jingsaiYuyueYesnoText) {
        this.jingsaiYuyueYesnoText = jingsaiYuyueYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getJingsaiYuyueShenheTime() {
        return jingsaiYuyueShenheTime;
    }
    /**
	 * 设置：审核时间
	 */

    public void setJingsaiYuyueShenheTime(Date jingsaiYuyueShenheTime) {
        this.jingsaiYuyueShenheTime = jingsaiYuyueShenheTime;
    }
    /**
	 * 获取：竞赛作品
	 */
    public String getJingsaiYuyueFile() {
        return jingsaiYuyueFile;
    }
    /**
	 * 设置：竞赛作品
	 */

    public void setJingsaiYuyueFile(String jingsaiYuyueFile) {
        this.jingsaiYuyueFile = jingsaiYuyueFile;
    }
    /**
	 * 获取：打分
	 */
    public Double getJingsaiYuyueDafen() {
        return jingsaiYuyueDafen;
    }
    /**
	 * 设置：打分
	 */

    public void setJingsaiYuyueDafen(Double jingsaiYuyueDafen) {
        this.jingsaiYuyueDafen = jingsaiYuyueDafen;
    }
    /**
	 * 获取：评语
	 */
    public String getJingsaiYuyueContent() {
        return jingsaiYuyueContent;
    }
    /**
	 * 设置：评语
	 */

    public void setJingsaiYuyueContent(String jingsaiYuyueContent) {
        this.jingsaiYuyueContent = jingsaiYuyueContent;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "JingsaiYuyue{" +
            ", id=" + id +
            ", jingsaiYuyueUuidNumber=" + jingsaiYuyueUuidNumber +
            ", jingsaiId=" + jingsaiId +
            ", yonghuId=" + yonghuId +
            ", jingsaiYuyueText=" + jingsaiYuyueText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", jingsaiYuyueYesnoTypes=" + jingsaiYuyueYesnoTypes +
            ", jingsaiYuyueYesnoText=" + jingsaiYuyueYesnoText +
            ", jingsaiYuyueShenheTime=" + DateUtil.convertString(jingsaiYuyueShenheTime,"yyyy-MM-dd") +
            ", jingsaiYuyueFile=" + jingsaiYuyueFile +
            ", jingsaiYuyueDafen=" + jingsaiYuyueDafen +
            ", jingsaiYuyueContent=" + jingsaiYuyueContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
