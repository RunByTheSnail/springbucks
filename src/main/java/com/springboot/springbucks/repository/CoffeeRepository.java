package com.springboot.springbucks.repository;

import com.springboot.springbucks.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
}
