package com.te.ems.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data

public class UserDetails implements Serializable {

	@Column
	private String name;

	@Id
	@Column
	private String emailId;

	@Column
	@JsonIgnore
	private String password;

	@Column
	private String job;

	@Column
	private Integer age;

	@Column
	private Double Salary;

}
