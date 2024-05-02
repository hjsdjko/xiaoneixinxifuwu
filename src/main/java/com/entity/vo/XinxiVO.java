package com.entity.vo;

import com.entity.XinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xinxi")
public class XinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
