package com.entity.model;

import com.entity.XinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 信息详情
     */
    private String xinxiContent;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：信息名称
	 */
    public String getXinxiName() {
        return xinxiName;
    }


    /**
	 * 设置：信息名称
	 */
    public void setXinxiName(String xinxiName) {
        this.xinxiName = xinxiName;
    }
    /**
	 * 获取：信息照片
	 */
    public String getXinxiPhoto() {
        return xinxiPhoto;
    }


    /**
	 * 设置：信息照片
	 */
    public void setXinxiPhoto(String xinxiPhoto) {
        this.xinxiPhoto = xinxiPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getXinxiVideo() {
        return xinxiVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setXinxiVideo(String xinxiVideo) {
        this.xinxiVideo = xinxiVideo;
    }
    /**
	 * 获取：信息类型
	 */
    public Integer getXinxiTypes() {
        return xinxiTypes;
    }


    /**
	 * 设置：信息类型
	 */
    public void setXinxiTypes(Integer xinxiTypes) {
        this.xinxiTypes = xinxiTypes;
    }
    /**
	 * 获取：赞数量
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞数量
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩数量
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩数量
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getXinxiClicknum() {
        return xinxiClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setXinxiClicknum(Integer xinxiClicknum) {
        this.xinxiClicknum = xinxiClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：信息详情
	 */
    public String getXinxiContent() {
        return xinxiContent;
    }


    /**
	 * 设置：信息详情
	 */
    public void setXinxiContent(String xinxiContent) {
        this.xinxiContent = xinxiContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
