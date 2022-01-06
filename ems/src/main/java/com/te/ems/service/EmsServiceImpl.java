package com.te.ems.service;

import com.te.ems.beans.UserDetails;

public interface EmsServiceImpl {

	public UserDetails register(UserDetails info);

	 public Object login(String emailId, String password); 
}
