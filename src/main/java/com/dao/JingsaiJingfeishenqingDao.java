package com.dao;

import com.entity.JingsaiJingfeishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JingsaiJingfeishenqingView;

/**
 * 竞赛经费申请 Dao 接口
 *
 * @author 
 */
public interface JingsaiJingfeishenqingDao extends BaseMapper<JingsaiJingfeishenqingEntity> {

   List<JingsaiJingfeishenqingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
