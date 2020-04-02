package com.kyo.mall.coupon.dao;

import com.kyo.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author kyo
 * @email sunlightcs@gmail.com
 * @date 2020-04-02 09:43:59
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
