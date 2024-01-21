package com.itlang.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itlang.common.utils.PageUtils;
import com.itlang.mall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author langth
 * @email 1152053489@qq.com
 * @date 2024-01-21 16:01:09
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

