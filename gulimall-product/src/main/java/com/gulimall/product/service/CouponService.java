package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.gulimall.product.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author meng
 * @email 2171290799@qq.com
 * @date 2024-04-30 16:07:30
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

