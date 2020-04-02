package com.kyo.mall.member.dao;

import com.kyo.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kyo
 * @email sunlightcs@gmail.com
 * @date 2020-04-02 10:31:51
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
