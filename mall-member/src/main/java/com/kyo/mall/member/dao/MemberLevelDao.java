package com.kyo.mall.member.dao;

import com.kyo.mall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author kyo
 * @email sunlightcs@gmail.com
 * @date 2020-04-02 10:31:51
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
