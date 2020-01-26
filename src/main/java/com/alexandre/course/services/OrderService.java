package com.alexandre.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandre.course.entities.Order;
import com.alexandre.course.repositories.OrderRepository;

@Service // registra que é um serviço
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order>obj = repository.findById(id);
		return obj.get();
	}
}
