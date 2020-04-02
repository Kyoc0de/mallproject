package com.kyo.mall.product.dao;

import com.kyo.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kyo
 * @email sunlightcs@gmail.com
 * @date 2020-04-02 08:24:05
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
