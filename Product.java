package com.mastek.eshop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;
@Controller
@Entity
@Table(name="product")
public class Product {
	@Id
	private int proid;
	private String proname;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int proid, String proname, double price) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.price = price;
	}
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + proid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (proid != other.proid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [proid=" + proid + ", proname=" + proname + ", price=" + price + "]";
	}
	
	
}
