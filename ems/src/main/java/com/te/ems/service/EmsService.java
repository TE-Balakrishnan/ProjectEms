package com.te.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ems.beans.UserDetails;
import com.te.ems.dao.EmsDao;
import com.te.ems.exception.RegisterException;

@Service
public class EmsService implements EmsServiceImpl {

	@Autowired
	private EmsDao dao;

	@Override
	public UserDetails register(UserDetails info) {
		if (info != null) {
			return dao.save(info);
		}
		throw new RegisterException("Data Already Exist");

	}

	@Override
	public Object login(String email, String password) {

		if ((!email.isEmpty() && email != null) && (!password.isEmpty() && password != null)) {
			UserDetails log = dao.findByEmailAndPassword(email, password);
			if (log != null) {
				return log;
			} else {
				throw new RegisterException("Invalid credential");
			}
		} else {
			throw new RegisterException("Enter valid login details");
		}

	}

}
