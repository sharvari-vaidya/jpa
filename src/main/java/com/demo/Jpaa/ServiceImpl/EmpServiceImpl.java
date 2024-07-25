package com.demo.Jpaa.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Jpaa.Entity.Emp;
import com.demo.Jpaa.Service.MyService;
import com.demo.Jpaa.repo.EmpRepo;

@Service
public class EmpServiceImpl implements MyService {

	@Autowired
	EmpRepo emp;
	
	@Override
	public boolean saveData(Emp e) {
		
		emp.save(e);
		return true;
		
	}

	@Override
	public Optional<Emp> getId(int id) {
		Optional<Emp> findById = emp.findById(id);
		
		emp.deleteById(102);
		return findById;
	}

}
