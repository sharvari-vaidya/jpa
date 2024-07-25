package com.demo.Jpaa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.demo.Jpaa.Entity.Emp;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Integer>{

}
