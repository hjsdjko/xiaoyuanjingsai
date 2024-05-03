package com.dao;

import com.entity.JingsaiYuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JingsaiYuyueView;

/**
 * 竞赛报名 Dao 接口
 *
 * @author 
 */
public interface JingsaiYuyueDao extends BaseMapper<JingsaiYuyueEntity> {

   List<JingsaiYuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
