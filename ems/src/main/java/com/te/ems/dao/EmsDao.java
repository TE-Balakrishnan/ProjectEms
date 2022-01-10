package com.te.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.ems.beans.UserDetails;

public interface EmsDao extends JpaRepository<UserDetails, String> {

}
