package com.entity.vo;

import com.entity.JingsaiJingfeishenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 竞赛经费申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jingsai_jingfeishenqing")
public class JingsaiJingfeishenqingVO implements Serializable {
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
     * 竞赛经费申请编号
     */

    @TableField(value = "jingsai_jingfeishenqing_uuid_number")
    private String jingsaiJingfeishenqingUuidNumber;


    /**
     * 竞赛经费申请名称
     */

    @TableField(value = "jingsai_jingfeishenqing_name")
    private String jingsaiJingfeishenqingName;


    /**
     * 经费类型
     */

    @TableField(value = "jingsai_jingfeishenqing_types")
    private Integer jingsaiJingfeishenqingTypes;


    /**
     * 申请金额(万)
     */

    @TableField(value = "shangpin_shouyin_true_price")
    private Double shangpinShouyinTruePrice;


    /**
     * 申请缘由
     */

    @TableField(value = "jingsai_jingfeishenqing_content")
    private String jingsaiJingfeishenqingContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 申请状态
     */

    @TableField(value = "jingsai_jingfeishenqing_yesno_types")
    private Integer jingsaiJingfeishenqingYesnoTypes;


    /**
     * 审核回复
     */

    @TableField(value = "jingsai_jingfeishenqing_yesno_text")
    private String jingsaiJingfeishenqingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jingsai_jingfeishenqing_shenhe_time")
    private Date jingsaiJingfeishenqingShenheTime;


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
	 * 设置：竞赛经费申请编号
	 */
    public String getJingsaiJingfeishenqingUuidNumber() {
        return jingsaiJingfeishenqingUuidNumber;
    }


    /**
	 * 获取：竞赛经费申请编号
	 */

    public void setJingsaiJingfeishenqingUuidNumber(String jingsaiJingfeishenqingUuidNumber) {
        this.jingsaiJingfeishenqingUuidNumber = jingsaiJingfeishenqingUuidNumber;
    }
    /**
	 * 设置：竞赛经费申请名称
	 */
    public String getJingsaiJingfeishenqingName() {
        return jingsaiJingfeishenqingName;
    }


    /**
	 * 获取：竞赛经费申请名称
	 */

    public void setJingsaiJingfeishenqingName(String jingsaiJingfeishenqingName) {
        this.jingsaiJingfeishenqingName = jingsaiJingfeishenqingName;
    }
    /**
	 * 设置：经费类型
	 */
    public Integer getJingsaiJingfeishenqingTypes() {
        return jingsaiJingfeishenqingTypes;
    }


    /**
	 * 获取：经费类型
	 */

    public void setJingsaiJingfeishenqingTypes(Integer jingsaiJingfeishenqingTypes) {
        this.jingsaiJingfeishenqingTypes = jingsaiJingfeishenqingTypes;
    }
    /**
	 * 设置：申请金额(万)
	 */
    public Double getShangpinShouyinTruePrice() {
        return shangpinShouyinTruePrice;
    }


    /**
	 * 获取：申请金额(万)
	 */

    public void setShangpinShouyinTruePrice(Double shangpinShouyinTruePrice) {
        this.shangpinShouyinTruePrice = shangpinShouyinTruePrice;
    }
    /**
	 * 设置：申请缘由
	 */
    public String getJingsaiJingfeishenqingContent() {
        return jingsaiJingfeishenqingContent;
    }


    /**
	 * 获取：申请缘由
	 */

    public void setJingsaiJingfeishenqingContent(String jingsaiJingfeishenqingContent) {
        this.jingsaiJingfeishenqingContent = jingsaiJingfeishenqingContent;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getJingsaiJingfeishenqingYesnoTypes() {
        return jingsaiJingfeishenqingYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setJingsaiJingfeishenqingYesnoTypes(Integer jingsaiJingfeishenqingYesnoTypes) {
        this.jingsaiJingfeishenqingYesnoTypes = jingsaiJingfeishenqingYesnoTypes;
    }
    /**
	 * 设置：审核回复
	 */
    public String getJingsaiJingfeishenqingYesnoText() {
        return jingsaiJingfeishenqingYesnoText;
    }


    /**
	 * 获取：审核回复
	 */

    public void setJingsaiJingfeishenqingYesnoText(String jingsaiJingfeishenqingYesnoText) {
        this.jingsaiJingfeishenqingYesnoText = jingsaiJingfeishenqingYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getJingsaiJingfeishenqingShenheTime() {
        return jingsaiJingfeishenqingShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setJingsaiJingfeishenqingShenheTime(Date jingsaiJingfeishenqingShenheTime) {
        this.jingsaiJingfeishenqingShenheTime = jingsaiJingfeishenqingShenheTime;
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
