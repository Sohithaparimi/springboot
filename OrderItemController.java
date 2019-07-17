package com.mastek.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastek.eshop.model.OrderItem;
import com.mastek.eshop.service.OrderItemService;

@RestController
public class OrderItemController {
	
	@Autowired(required=true)
	OrderItemService service;
	
	@GetMapping("/items")
	public List<OrderItem> findAll() {
		return service.findAll();
	}
	@GetMapping("/item/{itemid}")
	public OrderItem findById(@PathVariable int itemid) {
		return service.findById(itemid);
	}
	@PostMapping("/item/save")
	public  String save(@RequestBody OrderItem orderItem) {
		return service.save(orderItem);
	}
	@PutMapping("/item/update/{itemid}/{quantity}")
	public  String update(@PathVariable int itemid, @PathVariable int quantity) {
		return service.update(itemid, quantity);
	}
	@DeleteMapping("/item/delete/{itemid}")
	public String deleteById(@PathVariable int itemid) {
		return service.deleteById(itemid);
	}


}
