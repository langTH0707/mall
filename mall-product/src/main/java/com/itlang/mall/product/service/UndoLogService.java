package com.itlang.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itlang.common.utils.PageUtils;
import com.itlang.mall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author langth
 * @email 1152053489@qq.com
 * @date 2024-01-17 15:25:32
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

