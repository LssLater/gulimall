package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yu
 * @email 528952805@qq.com
 * @date 2022-11-10 23:44:38
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
