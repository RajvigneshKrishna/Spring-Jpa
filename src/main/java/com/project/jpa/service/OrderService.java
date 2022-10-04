package com.project.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.jpa.dto.OrderResponse;
import com.project.jpa.entity.Customer;
import com.project.jpa.repository.CustomerRepository;

@Service
public class OrderService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(Customer customer) {
		return customerRepository.save(customer);
	}

	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders() {
		return customerRepository.findAll();
	}

	@GetMapping("/getInfo")
	public List<OrderResponse> getJoinInformation() {
		return customerRepository.getJoinInformation();
	}

}
