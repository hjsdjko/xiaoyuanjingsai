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
 * 竞赛经费申请
 *
 * @author 
 * @email
 */
@TableName("jingsai_jingfeishenqing")
public class JingsaiJingfeishenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JingsaiJingfeishenqingEntity() {

	}

	public JingsaiJingfeishenqingEntity(T t) {
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
     * 竞赛
     */
    @ColumnInfo(comment="竞赛",type="int(11)")
    @TableField(value = "jingsai_id")

    private Integer jingsaiId;


    /**
     * 竞赛经费申请编号
     */
    @ColumnInfo(comment="竞赛经费申请编号",type="varchar(200)")
    @TableField(value = "jingsai_jingfeishenqing_uuid_number")

    private String jingsaiJingfeishenqingUuidNumber;


    /**
     * 竞赛经费申请名称
     */
    @ColumnInfo(comment="竞赛经费申请名称",type="varchar(200)")
    @TableField(value = "jingsai_jingfeishenqing_name")

    private String jingsaiJingfeishenqingName;


    /**
     * 经费类型
     */
    @ColumnInfo(comment="经费类型",type="int(11)")
    @TableField(value = "jingsai_jingfeishenqing_types")

    private Integer jingsaiJingfeishenqingTypes;


    /**
     * 申请金额(万)
     */
    @ColumnInfo(comment="申请金额(万)",type="decimal(10,2)")
    @TableField(value = "shangpin_shouyin_true_price")

    private Double shangpinShouyinTruePrice;


    /**
     * 申请缘由
     */
    @ColumnInfo(comment="申请缘由",type="longtext")
    @TableField(value = "jingsai_jingfeishenqing_content")

    private String jingsaiJingfeishenqingContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "jingsai_jingfeishenqing_yesno_types")

    private Integer jingsaiJingfeishenqingYesnoTypes;


    /**
     * 审核回复
     */
    @ColumnInfo(comment="审核回复",type="longtext")
    @TableField(value = "jingsai_jingfeishenqing_yesno_text")

    private String jingsaiJingfeishenqingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "jingsai_jingfeishenqing_shenhe_time")

    private Date jingsaiJingfeishenqingShenheTime;


    /**
     * 创建时间
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
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "JingsaiJingfeishenqing{" +
            ", id=" + id +
            ", jingsaiId=" + jingsaiId +
            ", jingsaiJingfeishenqingUuidNumber=" + jingsaiJingfeishenqingUuidNumber +
            ", jingsaiJingfeishenqingName=" + jingsaiJingfeishenqingName +
            ", jingsaiJingfeishenqingTypes=" + jingsaiJingfeishenqingTypes +
            ", shangpinShouyinTruePrice=" + shangpinShouyinTruePrice +
            ", jingsaiJingfeishenqingContent=" + jingsaiJingfeishenqingContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", jingsaiJingfeishenqingYesnoTypes=" + jingsaiJingfeishenqingYesnoTypes +
            ", jingsaiJingfeishenqingYesnoText=" + jingsaiJingfeishenqingYesnoText +
            ", jingsaiJingfeishenqingShenheTime=" + DateUtil.convertString(jingsaiJingfeishenqingShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
