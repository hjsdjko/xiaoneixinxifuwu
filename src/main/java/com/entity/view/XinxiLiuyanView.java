package com.entity.view;

import com.entity.XinxiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 信息留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xinxi_liuyan")
public class XinxiLiuyanView extends XinxiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 xinxi
			/**
			* 信息名称
			*/
			private String xinxiName;
			/**
			* 信息照片
			*/
			private String xinxiPhoto;
			/**
			* 视频
			*/
			private String xinxiVideo;
			/**
			* 信息类型
			*/
			private Integer xinxiTypes;
				/**
				* 信息类型的值
				*/
				private String xinxiValue;
			/**
			* 赞数量
			*/
			private Integer zanNumber;
			/**
			* 踩数量
			*/
			private Integer caiNumber;
			/**
			* 点击次数
			*/
			private Integer xinxiClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 信息详情
			*/
			private String xinxiContent;

		//级联表 yonghu
			/**
			* 学号
			*/
			private String yonghuUuidNumber;
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 学校
			*/
			private String school;
			/**
			* 是否使用
			*/
			private Integer shiyongTypes;
				/**
				* 是否使用的值
				*/
				private String shiyongValue;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public XinxiLiuyanView() {

	}

	public XinxiLiuyanView(XinxiLiuyanEntity xinxiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, xinxiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set xinxi

					/**
					* 获取： 信息名称
					*/
					public String getXinxiName() {
						return xinxiName;
					}
					/**
					* 设置： 信息名称
					*/
					public void setXinxiName(String xinxiName) {
						this.xinxiName = xinxiName;
					}

					/**
					* 获取： 信息照片
					*/
					public String getXinxiPhoto() {
						return xinxiPhoto;
					}
					/**
					* 设置： 信息照片
					*/
					public void setXinxiPhoto(String xinxiPhoto) {
						this.xinxiPhoto = xinxiPhoto;
					}

					/**
					* 获取： 视频
					*/
					public String getXinxiVideo() {
						return xinxiVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setXinxiVideo(String xinxiVideo) {
						this.xinxiVideo = xinxiVideo;
					}

					/**
					* 获取： 信息类型
					*/
					public Integer getXinxiTypes() {
						return xinxiTypes;
					}
					/**
					* 设置： 信息类型
					*/
					public void setXinxiTypes(Integer xinxiTypes) {
						this.xinxiTypes = xinxiTypes;
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
					* 获取： 赞数量
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞数量
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩数量
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩数量
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 点击次数
					*/
					public Integer getXinxiClicknum() {
						return xinxiClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setXinxiClicknum(Integer xinxiClicknum) {
						this.xinxiClicknum = xinxiClicknum;
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
					* 获取： 信息详情
					*/
					public String getXinxiContent() {
						return xinxiContent;
					}
					/**
					* 设置： 信息详情
					*/
					public void setXinxiContent(String xinxiContent) {
						this.xinxiContent = xinxiContent;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 学号
					*/
					public String getYonghuUuidNumber() {
						return yonghuUuidNumber;
					}
					/**
					* 设置： 学号
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
					* 获取： 学校
					*/
					public String getSchool() {
						return school;
					}
					/**
					* 设置： 学校
					*/
					public void setSchool(String school) {
						this.school = school;
					}

					/**
					* 获取： 是否使用
					*/
					public Integer getShiyongTypes() {
						return shiyongTypes;
					}
					/**
					* 设置： 是否使用
					*/
					public void setShiyongTypes(Integer shiyongTypes) {
						this.shiyongTypes = shiyongTypes;
					}


						/**
						* 获取： 是否使用的值
						*/
						public String getShiyongValue() {
							return shiyongValue;
						}
						/**
						* 设置： 是否使用的值
						*/
						public void setShiyongValue(String shiyongValue) {
							this.shiyongValue = shiyongValue;
						}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
