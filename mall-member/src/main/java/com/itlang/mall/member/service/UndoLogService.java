package com.itlang.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itlang.common.utils.PageUtils;
import com.itlang.mall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author langth
 * @email 1152053489@qq.com
 * @date 2024-01-21 15:52:30
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

