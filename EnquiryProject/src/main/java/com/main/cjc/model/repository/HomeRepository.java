package com.main.cjc.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.cjc.model.Employee;
@Repository
public interface HomeRepository extends JpaRepository<Employee,Integer>{

}
