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
 * 学习指导
 *
 * @author 
 * @email
 */
@TableName("xuexizhidao")
public class XuexizhidaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XuexizhidaoEntity() {

	}

	public XuexizhidaoEntity(T t) {
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
     * 学习指导名称
     */
    @ColumnInfo(comment="学习指导名称",type="varchar(200)")
    @TableField(value = "xuexizhidao_name")

    private String xuexizhidaoName;


    /**
     * 学习指导图片
     */
    @ColumnInfo(comment="学习指导图片",type="varchar(200)")
    @TableField(value = "xuexizhidao_photo")

    private String xuexizhidaoPhoto;


    /**
     * 学习指导类型
     */
    @ColumnInfo(comment="学习指导类型",type="int(11)")
    @TableField(value = "xuexizhidao_types")

    private Integer xuexizhidaoTypes;


    /**
     * 学习指导发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="学习指导发布时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 学习指导详情
     */
    @ColumnInfo(comment="学习指导详情",type="longtext")
    @TableField(value = "xuexizhidao_content")

    private String xuexizhidaoContent;


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
	 * 获取：学习指导名称
	 */
    public String getXuexizhidaoName() {
        return xuexizhidaoName;
    }
    /**
	 * 设置：学习指导名称
	 */

    public void setXuexizhidaoName(String xuexizhidaoName) {
        this.xuexizhidaoName = xuexizhidaoName;
    }
    /**
	 * 获取：学习指导图片
	 */
    public String getXuexizhidaoPhoto() {
        return xuexizhidaoPhoto;
    }
    /**
	 * 设置：学习指导图片
	 */

    public void setXuexizhidaoPhoto(String xuexizhidaoPhoto) {
        this.xuexizhidaoPhoto = xuexizhidaoPhoto;
    }
    /**
	 * 获取：学习指导类型
	 */
    public Integer getXuexizhidaoTypes() {
        return xuexizhidaoTypes;
    }
    /**
	 * 设置：学习指导类型
	 */

    public void setXuexizhidaoTypes(Integer xuexizhidaoTypes) {
        this.xuexizhidaoTypes = xuexizhidaoTypes;
    }
    /**
	 * 获取：学习指导发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：学习指导发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：学习指导详情
	 */
    public String getXuexizhidaoContent() {
        return xuexizhidaoContent;
    }
    /**
	 * 设置：学习指导详情
	 */

    public void setXuexizhidaoContent(String xuexizhidaoContent) {
        this.xuexizhidaoContent = xuexizhidaoContent;
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
        return "Xuexizhidao{" +
            ", id=" + id +
            ", xuexizhidaoName=" + xuexizhidaoName +
            ", xuexizhidaoPhoto=" + xuexizhidaoPhoto +
            ", xuexizhidaoTypes=" + xuexizhidaoTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", xuexizhidaoContent=" + xuexizhidaoContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
