package com.te.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.te.ems.beans.EmsResponse;
import com.te.ems.beans.UserDetails;
import com.te.ems.service.EmsServiceImpl;

@RestController
public class EmsController {

	@Autowired
	private EmsServiceImpl service;

	@PostMapping("/register")
	public ResponseEntity<EmsResponse> register(@RequestBody UserDetails reg) {
		EmsResponse re = new EmsResponse(false,service.register(reg));
		return new ResponseEntity<EmsResponse>(re, HttpStatus.CREATED);
	}

	
	  @PostMapping("/login") public ResponseEntity<EmsResponse> login(@RequestBody
	  UserDetails reg) { EmsResponse res = new EmsResponse(false,
	  service.login(reg.getEmailId(), reg.getPassword())); return new
	  ResponseEntity<EmsResponse>(res, HttpStatus.OK); }
	 

}