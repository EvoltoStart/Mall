package com.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.gulimall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author meng
 * @email 2171290799@qq.com
 * @date 2024-07-15 12:38:19
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

