package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yu
 * @email 528952805@qq.com
 * @date 2022-11-10 22:23:14
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
