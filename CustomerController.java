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

import com.mastek.eshop.model.Customer;
import com.mastek.eshop.model.Product;
import com.mastek.eshop.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired(required=true)
	CustomerService service;
	
	@GetMapping("/customers")
	public List<Customer> findAll() {
		return service.findAll();
	}
	@GetMapping("/customer/{custid}")
	public Customer findById(@PathVariable int custid) {
		return service.findById(custid);
	}
	@PostMapping("/customer/save")
	public  String save(@RequestBody Customer customer) {
		return service.save(customer);
	}
	@PutMapping("/customer/update/{custId}/{address}")
	public  String update(@PathVariable int custid, @PathVariable String address) {
		return service.update(custid, address);
	}
	@DeleteMapping("/customer/delete/{custid}")
	public String deleteById(@PathVariable int custid) {
		return service.deleteById(custid);
	}


}
