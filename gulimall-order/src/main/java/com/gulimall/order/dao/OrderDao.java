package com.gulimall.order.dao;

import com.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Shen
 * @email zhangshen2201@hotmail.com
 * @date 2021-01-22 16:53:55
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
