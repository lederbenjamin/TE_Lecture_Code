package com.techelevator.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.model.Order;
import com.techelevator.model.OrderDAO;


@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderDAO orderDao;
	
	@RequestMapping(path="/getOrderById", method=RequestMethod.GET)
	public Order getOrderById(HttpServletRequest request, @RequestParam String id) {
		return orderDao.getOrderById(id);
	}
}