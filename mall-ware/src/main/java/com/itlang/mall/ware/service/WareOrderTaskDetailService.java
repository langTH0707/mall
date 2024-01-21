package com.itlang.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itlang.common.utils.PageUtils;
import com.itlang.mall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author langth
 * @email 1152053489@qq.com
 * @date 2024-01-21 16:03:25
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

