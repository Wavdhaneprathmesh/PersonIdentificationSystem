package com.springbootproject.DatabaseDemo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootproject.DatabaseDemo.dao.PersonDao;
import com.springbootproject.DatabaseDemo.entity.Person;

@Service

public class PersonService {
	
	     @Autowired
	     PersonDao dao;

         public String addperson(Person p) {
        	 
        	 dao.addPerson(p);
			return "Data is added Successfully";
        	 
	     }

		
         
		public  String  updateRecord(int id, Person p) {
		
			String msg= dao.updateRecord(id, p);
			return msg;
			
			}
		
}
