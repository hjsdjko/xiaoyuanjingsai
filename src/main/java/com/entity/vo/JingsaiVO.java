package com.entity.vo;

import com.entity.JingsaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 竞赛
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jingsai")
public class JingsaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 老师
     */

    @TableField(value = "laoshi_id")
    private Integer laoshiId;


    /**
     * 竞赛名称
     */

    @TableField(value = "jingsai_name")
    private String jingsaiName;


    /**
     * 竞赛编号
     */

    @TableField(value = "jingsai_uuid_number")
    private String jingsaiUuidNumber;


    /**
     * 竞赛照片
     */

    @TableField(value = "jingsai_photo")
    private String jingsaiPhoto;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 竞赛类型
     */

    @TableField(value = "jingsai_types")
    private Integer jingsaiTypes;


    /**
     * 竞赛热度
     */

    @TableField(value = "jingsai_clicknum")
    private Integer jingsaiClicknum;


    /**
     * 报名截止时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jingsai_jiezhi_time")
    private Date jingsaiJiezhiTime;


    /**
     * 竞赛介绍
     */

    @TableField(value = "jingsai_content")
    private String jingsaiContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "jingsai_delete")
    private Integer jingsaiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：老师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：竞赛名称
	 */
    public String getJingsaiName() {
        return jingsaiName;
    }


    /**
	 * 获取：竞赛名称
	 */

    public void setJingsaiName(String jingsaiName) {
        this.jingsaiName = jingsaiName;
    }
    /**
	 * 设置：竞赛编号
	 */
    public String getJingsaiUuidNumber() {
        return jingsaiUuidNumber;
    }


    /**
	 * 获取：竞赛编号
	 */

    public void setJingsaiUuidNumber(String jingsaiUuidNumber) {
        this.jingsaiUuidNumber = jingsaiUuidNumber;
    }
    /**
	 * 设置：竞赛照片
	 */
    public String getJingsaiPhoto() {
        return jingsaiPhoto;
    }


    /**
	 * 获取：竞赛照片
	 */

    public void setJingsaiPhoto(String jingsaiPhoto) {
        this.jingsaiPhoto = jingsaiPhoto;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：竞赛类型
	 */
    public Integer getJingsaiTypes() {
        return jingsaiTypes;
    }


    /**
	 * 获取：竞赛类型
	 */

    public void setJingsaiTypes(Integer jingsaiTypes) {
        this.jingsaiTypes = jingsaiTypes;
    }
    /**
	 * 设置：竞赛热度
	 */
    public Integer getJingsaiClicknum() {
        return jingsaiClicknum;
    }


    /**
	 * 获取：竞赛热度
	 */

    public void setJingsaiClicknum(Integer jingsaiClicknum) {
        this.jingsaiClicknum = jingsaiClicknum;
    }
    /**
	 * 设置：报名截止时间
	 */
    public Date getJingsaiJiezhiTime() {
        return jingsaiJiezhiTime;
    }


    /**
	 * 获取：报名截止时间
	 */

    public void setJingsaiJiezhiTime(Date jingsaiJiezhiTime) {
        this.jingsaiJiezhiTime = jingsaiJiezhiTime;
    }
    /**
	 * 设置：竞赛介绍
	 */
    public String getJingsaiContent() {
        return jingsaiContent;
    }


    /**
	 * 获取：竞赛介绍
	 */

    public void setJingsaiContent(String jingsaiContent) {
        this.jingsaiContent = jingsaiContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getJingsaiDelete() {
        return jingsaiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setJingsaiDelete(Integer jingsaiDelete) {
        this.jingsaiDelete = jingsaiDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
