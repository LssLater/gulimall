package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yu
 * @email 528952805@qq.com
 * @date 2022-11-10 23:06:10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
