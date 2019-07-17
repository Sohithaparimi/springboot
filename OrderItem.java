package com.mastek.eshop.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="orderitem")
public class OrderItem {
	@Id
	private int itemid;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Product product;
	private int quantity;
	private transient double totalprice;
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItem(int itemid, Product product, int quantity, double totalprice) {
		super();
		this.itemid = itemid;
		this.product = product;
		this.quantity = quantity;
		
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalprice() {
		totalprice=this.quantity*product.getPrice();
		return this.totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemid;
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
		OrderItem other = (OrderItem) obj;
		if (itemid != other.itemid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderItem [itemid=" + itemid + ", product=" + product + ", quantity=" + quantity + ", totalprice="
				+ totalprice + "]";
	}
	
}
