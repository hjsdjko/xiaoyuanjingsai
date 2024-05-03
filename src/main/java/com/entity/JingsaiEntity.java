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
 * 竞赛
 *
 * @author 
 * @email
 */
@TableName("jingsai")
public class JingsaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JingsaiEntity() {

	}

	public JingsaiEntity(T t) {
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
     * 老师
     */
    @ColumnInfo(comment="老师",type="int(11)")
    @TableField(value = "laoshi_id")

    private Integer laoshiId;


    /**
     * 竞赛名称
     */
    @ColumnInfo(comment="竞赛名称",type="varchar(200)")
    @TableField(value = "jingsai_name")

    private String jingsaiName;


    /**
     * 竞赛编号
     */
    @ColumnInfo(comment="竞赛编号",type="varchar(200)")
    @TableField(value = "jingsai_uuid_number")

    private String jingsaiUuidNumber;


    /**
     * 竞赛照片
     */
    @ColumnInfo(comment="竞赛照片",type="varchar(200)")
    @TableField(value = "jingsai_photo")

    private String jingsaiPhoto;


    /**
     * 赞
     */
    @ColumnInfo(comment="赞",type="int(11)")
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @ColumnInfo(comment="踩",type="int(11)")
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 竞赛类型
     */
    @ColumnInfo(comment="竞赛类型",type="int(11)")
    @TableField(value = "jingsai_types")

    private Integer jingsaiTypes;


    /**
     * 竞赛热度
     */
    @ColumnInfo(comment="竞赛热度",type="int(11)")
    @TableField(value = "jingsai_clicknum")

    private Integer jingsaiClicknum;


    /**
     * 报名截止时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="报名截止时间",type="timestamp")
    @TableField(value = "jingsai_jiezhi_time")

    private Date jingsaiJiezhiTime;


    /**
     * 竞赛介绍
     */
    @ColumnInfo(comment="竞赛介绍",type="longtext")
    @TableField(value = "jingsai_content")

    private String jingsaiContent;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "jingsai_delete")

    private Integer jingsaiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 获取：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }
    /**
	 * 设置：老师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 获取：竞赛名称
	 */
    public String getJingsaiName() {
        return jingsaiName;
    }
    /**
	 * 设置：竞赛名称
	 */

    public void setJingsaiName(String jingsaiName) {
        this.jingsaiName = jingsaiName;
    }
    /**
	 * 获取：竞赛编号
	 */
    public String getJingsaiUuidNumber() {
        return jingsaiUuidNumber;
    }
    /**
	 * 设置：竞赛编号
	 */

    public void setJingsaiUuidNumber(String jingsaiUuidNumber) {
        this.jingsaiUuidNumber = jingsaiUuidNumber;
    }
    /**
	 * 获取：竞赛照片
	 */
    public String getJingsaiPhoto() {
        return jingsaiPhoto;
    }
    /**
	 * 设置：竞赛照片
	 */

    public void setJingsaiPhoto(String jingsaiPhoto) {
        this.jingsaiPhoto = jingsaiPhoto;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 设置：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 设置：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：竞赛类型
	 */
    public Integer getJingsaiTypes() {
        return jingsaiTypes;
    }
    /**
	 * 设置：竞赛类型
	 */

    public void setJingsaiTypes(Integer jingsaiTypes) {
        this.jingsaiTypes = jingsaiTypes;
    }
    /**
	 * 获取：竞赛热度
	 */
    public Integer getJingsaiClicknum() {
        return jingsaiClicknum;
    }
    /**
	 * 设置：竞赛热度
	 */

    public void setJingsaiClicknum(Integer jingsaiClicknum) {
        this.jingsaiClicknum = jingsaiClicknum;
    }
    /**
	 * 获取：报名截止时间
	 */
    public Date getJingsaiJiezhiTime() {
        return jingsaiJiezhiTime;
    }
    /**
	 * 设置：报名截止时间
	 */

    public void setJingsaiJiezhiTime(Date jingsaiJiezhiTime) {
        this.jingsaiJiezhiTime = jingsaiJiezhiTime;
    }
    /**
	 * 获取：竞赛介绍
	 */
    public String getJingsaiContent() {
        return jingsaiContent;
    }
    /**
	 * 设置：竞赛介绍
	 */

    public void setJingsaiContent(String jingsaiContent) {
        this.jingsaiContent = jingsaiContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getJingsaiDelete() {
        return jingsaiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setJingsaiDelete(Integer jingsaiDelete) {
        this.jingsaiDelete = jingsaiDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Jingsai{" +
            ", id=" + id +
            ", laoshiId=" + laoshiId +
            ", jingsaiName=" + jingsaiName +
            ", jingsaiUuidNumber=" + jingsaiUuidNumber +
            ", jingsaiPhoto=" + jingsaiPhoto +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", jingsaiTypes=" + jingsaiTypes +
            ", jingsaiClicknum=" + jingsaiClicknum +
            ", jingsaiJiezhiTime=" + DateUtil.convertString(jingsaiJiezhiTime,"yyyy-MM-dd") +
            ", jingsaiContent=" + jingsaiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", jingsaiDelete=" + jingsaiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
