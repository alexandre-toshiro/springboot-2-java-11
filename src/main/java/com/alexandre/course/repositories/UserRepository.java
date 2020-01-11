package com.alexandre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandre.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	// Não é necessário implementação aqui, pois o Spring wjpa já possui uma implementação padrão.
	// Portanto só com essa definção essa interface ja está pronta.
}
