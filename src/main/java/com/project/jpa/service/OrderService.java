package com.project.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.jpa.dto.OrderResponse;
import com.project.jpa.entity.Customer;
import com.project.jpa.repository.CustomerRepository;

@Service
public class OrderService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer placeOrder(Customer customer) {
		return customerRepository.save(customer);
	}

	public List<Customer> findAllOrders() {
		return customerRepository.findAll();
	}

	public List<OrderResponse> getJoinInformation() {
		return customerRepository.getJoinInformation();
	}

	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public void deleteCustomerById(String id) {
		customerRepository.deleteById(Integer.parseInt(id));
	}

}
