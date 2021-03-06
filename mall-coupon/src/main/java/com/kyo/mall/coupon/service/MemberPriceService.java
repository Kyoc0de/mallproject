package com.kyo.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kyo.common.utils.PageUtils;
import com.kyo.mall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author kyo
 * @email sunlightcs@gmail.com
 * @date 2020-04-02 09:43:59
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

