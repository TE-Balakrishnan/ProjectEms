package com.te.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.ems.beans.UserDetails;

@Repository
public interface EmsDao extends JpaRepository<UserDetails, Integer> {

	 public UserDetails findByEmailAndPassword(String email, String password); 

}
