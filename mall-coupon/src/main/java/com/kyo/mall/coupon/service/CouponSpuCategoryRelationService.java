package com.kyo.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kyo.common.utils.PageUtils;
import com.kyo.mall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author kyo
 * @email sunlightcs@gmail.com
 * @date 2020-04-02 09:43:59
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

