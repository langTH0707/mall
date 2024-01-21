package com.itlang.mall.product.dao;

import com.itlang.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author langth
 * @email 1152053489@qq.com
 * @date 2024-01-17 15:25:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
