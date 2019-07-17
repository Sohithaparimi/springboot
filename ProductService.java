package com.mastek.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastek.eshop.model.Product;
import com.mastek.eshop.repository.IProductRepository;


@Service
public class ProductService {
	
	@Autowired(required=true)
	private IProductRepository repository;
	
	public List<Product> findAll(){
		return (List<Product>) repository.findAll();
		
	}
	public Product findById(int id) {
		return repository.findById(id).get();
	}
	public String deleteById(int id) {
		repository.deleteById(id);
		return "Deleted";
	}
	public String save(Product entity) {
		Product newPro=repository.save(entity);
		return "Saved"+newPro;
	}
	public String update(int id,double price) {
		Product pro=findById(id);
		pro.setPrice(price);
		repository.save(pro);
		return "Updated "+pro;
	}
	
	

}
