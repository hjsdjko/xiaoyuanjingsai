package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.JingsaiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 竞赛留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("jingsai_liuyan")
public class JingsaiLiuyanView extends JingsaiLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 竞赛
					 
		/**
		* 竞赛 的 老师
		*/
		@ColumnInfo(comment="老师",type="int(11)")
		private Integer jingsaiLaoshiId;
		/**
		* 竞赛名称
		*/

		@ColumnInfo(comment="竞赛名称",type="varchar(200)")
		private String jingsaiName;
		/**
		* 竞赛编号
		*/

		@ColumnInfo(comment="竞赛编号",type="varchar(200)")
		private String jingsaiUuidNumber;
		/**
		* 竞赛照片
		*/

		@ColumnInfo(comment="竞赛照片",type="varchar(200)")
		private String jingsaiPhoto;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 竞赛类型
		*/
		@ColumnInfo(comment="竞赛类型",type="int(11)")
		private Integer jingsaiTypes;
			/**
			* 竞赛类型的值
			*/
			@ColumnInfo(comment="竞赛类型的字典表值",type="varchar(200)")
			private String jingsaiValue;
		/**
		* 竞赛热度
		*/

		@ColumnInfo(comment="竞赛热度",type="int(11)")
		private Integer jingsaiClicknum;
		/**
		* 报名截止时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="报名截止时间",type="timestamp")
		private Date jingsaiJiezhiTime;
		/**
		* 竞赛介绍
		*/

		@ColumnInfo(comment="竞赛介绍",type="longtext")
		private String jingsaiContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer jingsaiDelete;
	//级联表 用户
		/**
		* 用户编号
		*/

		@ColumnInfo(comment="用户编号",type="varchar(200)")
		private String yonghuUuidNumber;
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public JingsaiLiuyanView() {

	}

	public JingsaiLiuyanView(JingsaiLiuyanEntity jingsaiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, jingsaiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 竞赛
		/**
		* 获取：竞赛 的 老师
		*/
		public Integer getJingsaiLaoshiId() {
			return jingsaiLaoshiId;
		}
		/**
		* 设置：竞赛 的 老师
		*/
		public void setJingsaiLaoshiId(Integer jingsaiLaoshiId) {
			this.jingsaiLaoshiId = jingsaiLaoshiId;
		}

		/**
		* 获取： 竞赛名称
		*/
		public String getJingsaiName() {
			return jingsaiName;
		}
		/**
		* 设置： 竞赛名称
		*/
		public void setJingsaiName(String jingsaiName) {
			this.jingsaiName = jingsaiName;
		}

		/**
		* 获取： 竞赛编号
		*/
		public String getJingsaiUuidNumber() {
			return jingsaiUuidNumber;
		}
		/**
		* 设置： 竞赛编号
		*/
		public void setJingsaiUuidNumber(String jingsaiUuidNumber) {
			this.jingsaiUuidNumber = jingsaiUuidNumber;
		}

		/**
		* 获取： 竞赛照片
		*/
		public String getJingsaiPhoto() {
			return jingsaiPhoto;
		}
		/**
		* 设置： 竞赛照片
		*/
		public void setJingsaiPhoto(String jingsaiPhoto) {
			this.jingsaiPhoto = jingsaiPhoto;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}
		/**
		* 获取： 竞赛类型
		*/
		public Integer getJingsaiTypes() {
			return jingsaiTypes;
		}
		/**
		* 设置： 竞赛类型
		*/
		public void setJingsaiTypes(Integer jingsaiTypes) {
			this.jingsaiTypes = jingsaiTypes;
		}


			/**
			* 获取： 竞赛类型的值
			*/
			public String getJingsaiValue() {
				return jingsaiValue;
			}
			/**
			* 设置： 竞赛类型的值
			*/
			public void setJingsaiValue(String jingsaiValue) {
				this.jingsaiValue = jingsaiValue;
			}

		/**
		* 获取： 竞赛热度
		*/
		public Integer getJingsaiClicknum() {
			return jingsaiClicknum;
		}
		/**
		* 设置： 竞赛热度
		*/
		public void setJingsaiClicknum(Integer jingsaiClicknum) {
			this.jingsaiClicknum = jingsaiClicknum;
		}

		/**
		* 获取： 报名截止时间
		*/
		public Date getJingsaiJiezhiTime() {
			return jingsaiJiezhiTime;
		}
		/**
		* 设置： 报名截止时间
		*/
		public void setJingsaiJiezhiTime(Date jingsaiJiezhiTime) {
			this.jingsaiJiezhiTime = jingsaiJiezhiTime;
		}

		/**
		* 获取： 竞赛介绍
		*/
		public String getJingsaiContent() {
			return jingsaiContent;
		}
		/**
		* 设置： 竞赛介绍
		*/
		public void setJingsaiContent(String jingsaiContent) {
			this.jingsaiContent = jingsaiContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getJingsaiDelete() {
			return jingsaiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setJingsaiDelete(Integer jingsaiDelete) {
			this.jingsaiDelete = jingsaiDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户编号
		*/
		public String getYonghuUuidNumber() {
			return yonghuUuidNumber;
		}
		/**
		* 设置： 用户编号
		*/
		public void setYonghuUuidNumber(String yonghuUuidNumber) {
			this.yonghuUuidNumber = yonghuUuidNumber;
		}

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "JingsaiLiuyanView{" +
			", jingsaiName=" + jingsaiName +
			", jingsaiUuidNumber=" + jingsaiUuidNumber +
			", jingsaiPhoto=" + jingsaiPhoto +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", jingsaiClicknum=" + jingsaiClicknum +
			", jingsaiJiezhiTime=" + DateUtil.convertString(jingsaiJiezhiTime,"yyyy-MM-dd") +
			", jingsaiContent=" + jingsaiContent +
			", jingsaiDelete=" + jingsaiDelete +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
