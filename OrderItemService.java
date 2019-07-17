package com.mastek.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastek.eshop.model.OrderItem;
import com.mastek.eshop.repository.IOrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired(required=true)
	private IOrderItemRepository repository;
	
	public List<OrderItem> findAll(){
		return (List<OrderItem>) repository.findAll();
		
	}
	public OrderItem findById(int id) {
		return repository.findById(id).get();
	}
	public String deleteById(int id) {
		repository.deleteById(id);
		return "Deleted";
	}
	public String save(OrderItem entity) {
		OrderItem newItem=repository.save(entity);
		return "Saved"+newItem;
	}
	public String update(int id,int quantity) {
		OrderItem item=findById(id);
		item.setQuantity(quantity);
		repository.save(item);
		return "Updated "+item;
	}
	

}
