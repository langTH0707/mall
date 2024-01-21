package com.itlang.mall.member.dao;

import com.itlang.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author langth
 * @email 1152053489@qq.com
 * @date 2024-01-21 15:52:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
