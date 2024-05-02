package com.dao;

import com.entity.XinxiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XinxiLiuyanView;

/**
 * 信息留言 Dao 接口
 *
 * @author 
 */
public interface XinxiLiuyanDao extends BaseMapper<XinxiLiuyanEntity> {

   List<XinxiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
