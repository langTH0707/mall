package com.itlang.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itlang.common.utils.PageUtils;
import com.itlang.mall.coupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author langth
 * @email 1152053489@qq.com
 * @date 2024-01-21 15:44:11
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

