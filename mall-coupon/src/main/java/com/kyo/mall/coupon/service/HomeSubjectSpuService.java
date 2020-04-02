package com.kyo.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kyo.common.utils.PageUtils;
import com.kyo.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author kyo
 * @email sunlightcs@gmail.com
 * @date 2020-04-02 09:43:59
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

