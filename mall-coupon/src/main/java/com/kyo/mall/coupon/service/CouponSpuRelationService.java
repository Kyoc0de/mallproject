package com.kyo.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kyo.common.utils.PageUtils;
import com.kyo.mall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author kyo
 * @email sunlightcs@gmail.com
 * @date 2020-04-02 09:43:59
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

