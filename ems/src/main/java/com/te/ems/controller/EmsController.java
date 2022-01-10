package com.te.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.te.ems.beans.UserDetails;
import com.te.ems.service.EmsService;
import com.te.ems.service.EmsServiceImpl;

@RestController
public class EmsController {

	@Autowired
	private EmsServiceImpl service;
	
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<UserDetails> getData(@PathVariable String id){
	UserDetails	ref=service.getData(id);
	return new ResponseEntity<UserDetails>(ref,HttpStatus.OK);
	}	
}
