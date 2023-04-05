package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Bean.Clients;
import com.masai.Bean.Insurance;

public interface InsuranceRepo extends JpaRepository<Insurance, Integer>{

}
