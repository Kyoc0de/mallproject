package com.kyo.mall.ware.dao;

import com.kyo.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author kyo
 * @email sunlightcs@gmail.com
 * @date 2020-04-02 12:54:15
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
