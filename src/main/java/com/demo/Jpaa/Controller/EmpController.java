package com.demo.Jpaa.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Jpaa.Entity.Emp;
import com.demo.Jpaa.Service.MyService;

@RestController
@RequestMapping("/jpadata")
public class EmpController {

	@Autowired
	MyService my;
	
	
	@PostMapping("/data")
	public void getJap() {
		Emp e = new Emp();
		e.setName("wewr");
		
		System.out.println(my.saveData(e));
		
		Optional<Emp> id = my.getId(52);
		System.out.println(id.toString());
		
	}
	
}
