package com.entity.view;

import com.entity.XinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xinxi")
public class XinxiView extends XinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 信息类型的值
		*/
		private String xinxiValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public XinxiView() {

	}

	public XinxiView(XinxiEntity xinxiEntity) {
		try {
			BeanUtils.copyProperties(this, xinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 信息类型的值
			*/
			public String getXinxiValue() {
				return xinxiValue;
			}
			/**
			* 设置： 信息类型的值
			*/
			public void setXinxiValue(String xinxiValue) {
				this.xinxiValue = xinxiValue;
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









}
