package com.akb.mapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="OP1_ORDERS")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	private String customerName;
	
//	@OneToOne
//	private Products products;
	
	@OneToMany(mappedBy = "orders")
	private List<Products> prodList;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<Products> getList() {
		return prodList;
	}
	public void setList(List<Products> list) {
		this.prodList = list;
	}
	
	
}
