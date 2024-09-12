package com.dao;

import com.entity.ShenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingView;

/**
 * 摊位审核 Dao 接口
 *
 * @author 
 * @since 2021-05-06
 */
public interface ShenqingDao extends BaseMapper<ShenqingEntity> {

   List<ShenqingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
