package com.project.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.jpa.dto.OrderRequest;
import com.project.jpa.dto.OrderResponse;
import com.project.jpa.entity.Customer;
import com.project.jpa.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		return orderService.placeOrder(request.getCustomer());
	}

	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders() {
		return orderService.findAllOrders();
	}

	@GetMapping("/getInfo")
	public List<OrderResponse> getJoinInformation() {
		return orderService.getJoinInformation();
	}

	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody OrderRequest request) {
		return orderService.updateCustomer(request.getCustomer());
	}

	@DeleteMapping("/deleteId/{id}")
	public void deleteCustomerById(@PathVariable("id") String id) {
		orderService.deleteCustomerById(id);
	}
}
