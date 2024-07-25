package com.demo.Jpaa.Service;

import java.util.Optional;

import com.demo.Jpaa.Entity.Emp;

public interface MyService {
	

	public boolean saveData(Emp e);
	
	public Optional<Emp> getId(int id);
	
	
	
	
	

}
