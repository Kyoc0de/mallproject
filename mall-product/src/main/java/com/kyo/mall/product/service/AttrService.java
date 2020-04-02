package com.kyo.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kyo.common.utils.PageUtils;
import com.kyo.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author kyo
 * @email sunlightcs@gmail.com
 * @date 2020-04-02 08:24:05
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

