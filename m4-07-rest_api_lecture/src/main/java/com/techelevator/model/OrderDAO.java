package com.techelevator.model;

import java.util.List;

public interface OrderDAO {
  List<Order> getAllOrder();
  Order getOrderById(String id);
  String submitOrder(Order order);
}
