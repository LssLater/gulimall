package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yu
 * @email 528952805@qq.com
 * @date 2022-11-09 21:01:17
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
