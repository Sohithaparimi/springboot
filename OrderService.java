package com.mastek.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mastek.eshop.model.Orders;
import com.mastek.eshop.repository.IOrderRepository;

@Service
public class OrderService {
	
	@Autowired(required=true)
	private IOrderRepository repository;
	
	public List<Orders> findAll(){
		return (List<Orders>) repository.findAll();
		
	}
	public Orders findById(int id) {
		return repository.findById(id).get();
	}
	public String deleteById(int id) {
		repository.deleteById(id);
		return "Deleted";
	}
	public String save(Orders entity) {
		Orders newOrders=repository.save(entity);
		return "Saved"+newOrders;
	}
	

}
