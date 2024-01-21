package com.itlang.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itlang.common.utils.PageUtils;
import com.itlang.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author langth
 * @email 1152053489@qq.com
 * @date 2024-01-17 15:25:32
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

