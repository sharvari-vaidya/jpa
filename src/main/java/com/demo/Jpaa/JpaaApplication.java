package com.demo.Jpaa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JpaaApplication {

	
	public static Logger log = LoggerFactory.getLogger(JpaaApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(JpaaApplication.class, args);
		log.info("++++++++++++++++++");
		
//		EntityManagerFactory emf= Persistence.createEntityManagerFactory("");
//		EntityManager em= emf.createEntityManager();
		
		
 	}

}
