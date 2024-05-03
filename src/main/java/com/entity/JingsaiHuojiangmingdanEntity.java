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
 * 获奖名单
 *
 * @author 
 * @email
 */
@TableName("jingsai_huojiangmingdan")
public class JingsaiHuojiangmingdanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JingsaiHuojiangmingdanEntity() {

	}

	public JingsaiHuojiangmingdanEntity(T t) {
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
     * 获奖名单编号
     */
    @ColumnInfo(comment="获奖名单编号",type="varchar(200)")
    @TableField(value = "jingsai_huojiangmingdan_uuid_number")

    private String jingsaiHuojiangmingdanUuidNumber;


    /**
     * 名单详情
     */
    @ColumnInfo(comment="名单详情",type="longtext")
    @TableField(value = "jingsai_huojiangmingdan_content")

    private String jingsaiHuojiangmingdanContent;


    /**
     * 法布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="法布时间",type="timestamp")
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
	 * 获取：获奖名单编号
	 */
    public String getJingsaiHuojiangmingdanUuidNumber() {
        return jingsaiHuojiangmingdanUuidNumber;
    }
    /**
	 * 设置：获奖名单编号
	 */

    public void setJingsaiHuojiangmingdanUuidNumber(String jingsaiHuojiangmingdanUuidNumber) {
        this.jingsaiHuojiangmingdanUuidNumber = jingsaiHuojiangmingdanUuidNumber;
    }
    /**
	 * 获取：名单详情
	 */
    public String getJingsaiHuojiangmingdanContent() {
        return jingsaiHuojiangmingdanContent;
    }
    /**
	 * 设置：名单详情
	 */

    public void setJingsaiHuojiangmingdanContent(String jingsaiHuojiangmingdanContent) {
        this.jingsaiHuojiangmingdanContent = jingsaiHuojiangmingdanContent;
    }
    /**
	 * 获取：法布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：法布时间
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
        return "JingsaiHuojiangmingdan{" +
            ", id=" + id +
            ", jingsaiId=" + jingsaiId +
            ", jingsaiHuojiangmingdanUuidNumber=" + jingsaiHuojiangmingdanUuidNumber +
            ", jingsaiHuojiangmingdanContent=" + jingsaiHuojiangmingdanContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
