package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Bean.Clients;

public interface ClientRepo extends JpaRepository<Clients, Integer> {

	
	
}
