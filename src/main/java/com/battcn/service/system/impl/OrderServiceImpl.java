package com.battcn.service.system.impl;

import com.battcn.entity.Orders;
import com.battcn.mapper.OrderMapper;
import com.battcn.service.BaseServiceImpl;
import com.battcn.service.system.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Orders> implements OrderService {
	
	@Autowired
	private OrderMapper orderMapper;
}
