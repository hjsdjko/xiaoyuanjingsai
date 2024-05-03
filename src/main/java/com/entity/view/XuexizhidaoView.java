package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XuexizhidaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 学习指导
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xuexizhidao")
public class XuexizhidaoView extends XuexizhidaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 学习指导类型的值
	*/
	@ColumnInfo(comment="学习指导类型的字典表值",type="varchar(200)")
	private String xuexizhidaoValue;




	public XuexizhidaoView() {

	}

	public XuexizhidaoView(XuexizhidaoEntity xuexizhidaoEntity) {
		try {
			BeanUtils.copyProperties(this, xuexizhidaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 学习指导类型的值
	*/
	public String getXuexizhidaoValue() {
		return xuexizhidaoValue;
	}
	/**
	* 设置： 学习指导类型的值
	*/
	public void setXuexizhidaoValue(String xuexizhidaoValue) {
		this.xuexizhidaoValue = xuexizhidaoValue;
	}




	@Override
	public String toString() {
		return "XuexizhidaoView{" +
			", xuexizhidaoValue=" + xuexizhidaoValue +
			"} " + super.toString();
	}
}
