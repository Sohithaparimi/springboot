package com.mastek.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastek.eshop.model.Customer;
import com.mastek.eshop.model.Product;
import com.mastek.eshop.repository.ICustomerRepository;

@Service
public class CustomerService {
	
	@Autowired(required=true)
	private ICustomerRepository repository;
	
	public List<Customer> findAll(){
		return (List<Customer>) repository.findAll();
		
	}
	public Customer findById(int id) {
		return repository.findById(id).get();
	}
	public String deleteById(int id) {
		repository.deleteById(id);
		return "Deleted";
	}
	public String save(Customer entity) {
		Customer newCust=repository.save(entity);
		return "Saved"+newCust;
	}
	public String update(int id,String address) {
		Customer cust=findById(id);
		cust.setAddress(address);
		repository.save(cust);
		return "Updated "+cust;
	}
	
	

}
