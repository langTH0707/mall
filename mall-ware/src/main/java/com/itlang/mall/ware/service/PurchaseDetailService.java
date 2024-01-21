package com.itlang.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itlang.common.utils.PageUtils;
import com.itlang.mall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author langth
 * @email 1152053489@qq.com
 * @date 2024-01-21 16:03:25
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

