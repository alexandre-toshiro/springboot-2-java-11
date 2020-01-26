package com.alexandre.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandre.course.entities.User;
import com.alexandre.course.repositories.UserRepository;

@Service // registra que é um serviço
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User>obj = repository.findById(id);
		return obj.get();
	}
}
