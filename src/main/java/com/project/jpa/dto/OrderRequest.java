package com.project.jpa.dto;

import com.project.jpa.entity.Customer;

public class OrderRequest {

    @Override
	public String toString() {
		return "OrderRequest [customer=" + customer + "]";
	}

	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
