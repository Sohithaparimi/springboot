package com.mastek.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastek.eshop.model.Orders;
import com.mastek.eshop.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired(required=true)
	OrderService service;
	
	@GetMapping("/orders")
	public List<Orders> findAll() {
		return service.findAll();
	}
	@GetMapping("/order/{orderid}")
	public Orders findById(@PathVariable int orderid) {
		return service.findById(orderid);
	}
	@PostMapping("/order/save")
	public  String save(@RequestBody Orders orders) {
		return service.save(orders);
	}
	
	@DeleteMapping("/order/delete/{orderid}")
	public String deleteById(@PathVariable int orderid) {
		return service.deleteById(orderid);
	}

}
