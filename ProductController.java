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

import com.mastek.eshop.model.Product;
import com.mastek.eshop.service.ProductService;


@RestController
public class ProductController {
	
	@Autowired(required=true)
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> findAll() {
		return service.findAll();
	}
	@GetMapping("/product/{proId}")
	public Product findById(@PathVariable int proId) {
		return service.findById(proId);
	}
	@PostMapping("/product/save")
	public  String save(@RequestBody Product product) {
		return service.save(product);
	}
	@PutMapping("/product/update/{empId}/{salary}")
	public  String update(@PathVariable int proId, @PathVariable double proPrice) {
		return service.update(proId, proPrice);
	}
	@DeleteMapping("/product/delete/{proId}")
	public String deleteById(@PathVariable int proId) {
		return service.deleteById(proId);
	}

}
