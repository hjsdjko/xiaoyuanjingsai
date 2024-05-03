package com.dao;

import com.entity.XuexizhidaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexizhidaoView;

/**
 * 学习指导 Dao 接口
 *
 * @author 
 */
public interface XuexizhidaoDao extends BaseMapper<XuexizhidaoEntity> {

   List<XuexizhidaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
