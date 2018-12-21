package com.techelevator.model.jdbc;

import java.util.List;

import org.springframework.stereotype.Component;

import com.techelevator.model.Order;
import com.techelevator.model.OrderDAO;

@Component
public class JDBCOrderDAO implements OrderDAO{

	@Override
	public List<Order> getAllOrder() {
		return null;
	}

	@Override
	public Order getOrderById(String id) {
		return new Order(id, "this is my order");
	}

	@Override
	public String submitOrder(Order order) {
		return null;
	}

}
