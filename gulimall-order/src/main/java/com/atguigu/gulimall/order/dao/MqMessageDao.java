package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author yu
 * @email 528952805@qq.com
 * @date 2022-11-10 23:34:03
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
