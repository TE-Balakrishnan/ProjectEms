package com.te.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ems.beans.UserDetails;
import com.te.ems.dao.EmsDao;

@Service
public class EmsService implements EmsServiceImpl{

	@Autowired
	private EmsDao dao;
	
	


	@Override
	public UserDetails getData(String id) {
		UserDetails d=dao.findById(id).get();
		return d;
	}

}
