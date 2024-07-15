package com.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.gulimall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author meng
 * @email 2171290799@qq.com
 * @date 2024-06-28 00:25:03
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

