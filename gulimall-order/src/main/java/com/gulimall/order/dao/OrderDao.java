package com.gulimall.order.dao;

import com.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author meng
 * @email 2171290799@qq.com
 * @date 2024-06-28 00:25:03
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
