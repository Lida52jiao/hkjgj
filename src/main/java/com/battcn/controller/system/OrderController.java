package com.battcn.controller.system;

import com.battcn.service.system.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
}
