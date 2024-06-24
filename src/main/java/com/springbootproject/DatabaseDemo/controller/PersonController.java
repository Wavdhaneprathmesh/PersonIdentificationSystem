package com.springbootproject.DatabaseDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootproject.DatabaseDemo.entity.Person;
import com.springbootproject.DatabaseDemo.service.PersonService;

@RestController
@RequestMapping("Person")
public class PersonController {
	
	@Autowired
	PersonService service;
	
	
	@PostMapping("addperson")
    public String  addPerson(@RequestBody Person p) {
		
		
		String strmsg = service.addperson(p);
        		
	     return  strmsg;
	
	
	}
	
	@PutMapping("updateperson/{id}")
	public String updatePerson(@PathVariable int id,@RequestBody Person p) {
		
		String msg = service.updateRecord(id,p);
		
		return msg;
	}
	

}