package com.entity.vo;

import com.entity.XuexizhidaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学习指导
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xuexizhidao")
public class XuexizhidaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学习指导名称
     */

    @TableField(value = "xuexizhidao_name")
    private String xuexizhidaoName;


    /**
     * 学习指导图片
     */

    @TableField(value = "xuexizhidao_photo")
    private String xuexizhidaoPhoto;


    /**
     * 学习指导类型
     */

    @TableField(value = "xuexizhidao_types")
    private Integer xuexizhidaoTypes;


    /**
     * 学习指导发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 学习指导详情
     */

    @TableField(value = "xuexizhidao_content")
    private String xuexizhidaoContent;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 设置：学习指导名称
	 */
    public String getXuexizhidaoName() {
        return xuexizhidaoName;
    }


    /**
	 * 获取：学习指导名称
	 */

    public void setXuexizhidaoName(String xuexizhidaoName) {
        this.xuexizhidaoName = xuexizhidaoName;
    }
    /**
	 * 设置：学习指导图片
	 */
    public String getXuexizhidaoPhoto() {
        return xuexizhidaoPhoto;
    }


    /**
	 * 获取：学习指导图片
	 */

    public void setXuexizhidaoPhoto(String xuexizhidaoPhoto) {
        this.xuexizhidaoPhoto = xuexizhidaoPhoto;
    }
    /**
	 * 设置：学习指导类型
	 */
    public Integer getXuexizhidaoTypes() {
        return xuexizhidaoTypes;
    }


    /**
	 * 获取：学习指导类型
	 */

    public void setXuexizhidaoTypes(Integer xuexizhidaoTypes) {
        this.xuexizhidaoTypes = xuexizhidaoTypes;
    }
    /**
	 * 设置：学习指导发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：学习指导发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：学习指导详情
	 */
    public String getXuexizhidaoContent() {
        return xuexizhidaoContent;
    }


    /**
	 * 获取：学习指导详情
	 */

    public void setXuexizhidaoContent(String xuexizhidaoContent) {
        this.xuexizhidaoContent = xuexizhidaoContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
