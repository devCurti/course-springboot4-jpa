package com.devCurti.course.entities;

import java.io.Serializable;
import java.util.Objects;

import com.devCurti.course.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_OrderItem")
public class OrderItem implements Serializable{
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	private Integer quantity;
	private double price;
	
	public OrderItem() {
		
	}
	
	

	public OrderItem(Order order, Product product, Integer quantity, double price) {
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}

	
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		id.setProduct(product);
	}

	public OrderItemPK getId() {
		return id;
	}

	public void setId(OrderItemPK id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, price, quantity);
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
		return Objects.equals(id, other.id) && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(quantity, other.quantity);
	}
	
	public Double getSubTotal() {
		return price * quantity;
	}
	
	
}
