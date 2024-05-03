package com.entity.model;

import com.entity.XuexizhidaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学习指导
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XuexizhidaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学习指导名称
     */
    private String xuexizhidaoName;


    /**
     * 学习指导图片
     */
    private String xuexizhidaoPhoto;


    /**
     * 学习指导类型
     */
    private Integer xuexizhidaoTypes;


    /**
     * 学习指导发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 学习指导详情
     */
    private String xuexizhidaoContent;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
