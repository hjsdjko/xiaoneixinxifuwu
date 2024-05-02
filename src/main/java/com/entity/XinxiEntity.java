package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 信息
 *
 * @author 
 * @email
 */
@TableName("xinxi")
public class XinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinxiEntity() {

	}

	public XinxiEntity(T t) {
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
    @TableField(value = "id")

    private Integer id;


    /**
     * 信息名称
     */
    @TableField(value = "xinxi_name")

    private String xinxiName;


    /**
     * 信息照片
     */
    @TableField(value = "xinxi_photo")

    private String xinxiPhoto;


    /**
     * 视频
     */
    @TableField(value = "xinxi_video")

    private String xinxiVideo;


    /**
     * 信息类型
     */
    @TableField(value = "xinxi_types")

    private Integer xinxiTypes;


    /**
     * 赞数量
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩数量
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 点击次数
     */
    @TableField(value = "xinxi_clicknum")

    private Integer xinxiClicknum;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 信息详情
     */
    @TableField(value = "xinxi_content")

    private String xinxiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：信息名称
	 */
    public String getXinxiName() {
        return xinxiName;
    }
    /**
	 * 获取：信息名称
	 */

    public void setXinxiName(String xinxiName) {
        this.xinxiName = xinxiName;
    }
    /**
	 * 设置：信息照片
	 */
    public String getXinxiPhoto() {
        return xinxiPhoto;
    }
    /**
	 * 获取：信息照片
	 */

    public void setXinxiPhoto(String xinxiPhoto) {
        this.xinxiPhoto = xinxiPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getXinxiVideo() {
        return xinxiVideo;
    }
    /**
	 * 获取：视频
	 */

    public void setXinxiVideo(String xinxiVideo) {
        this.xinxiVideo = xinxiVideo;
    }
    /**
	 * 设置：信息类型
	 */
    public Integer getXinxiTypes() {
        return xinxiTypes;
    }
    /**
	 * 获取：信息类型
	 */

    public void setXinxiTypes(Integer xinxiTypes) {
        this.xinxiTypes = xinxiTypes;
    }
    /**
	 * 设置：赞数量
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 获取：赞数量
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩数量
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 获取：踩数量
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getXinxiClicknum() {
        return xinxiClicknum;
    }
    /**
	 * 获取：点击次数
	 */

    public void setXinxiClicknum(Integer xinxiClicknum) {
        this.xinxiClicknum = xinxiClicknum;
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
	 * 设置：信息详情
	 */
    public String getXinxiContent() {
        return xinxiContent;
    }
    /**
	 * 获取：信息详情
	 */

    public void setXinxiContent(String xinxiContent) {
        this.xinxiContent = xinxiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xinxi{" +
            "id=" + id +
            ", xinxiName=" + xinxiName +
            ", xinxiPhoto=" + xinxiPhoto +
            ", xinxiVideo=" + xinxiVideo +
            ", xinxiTypes=" + xinxiTypes +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", xinxiClicknum=" + xinxiClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", xinxiContent=" + xinxiContent +
            ", createTime=" + createTime +
        "}";
    }
}
