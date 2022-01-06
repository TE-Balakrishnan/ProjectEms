package com.te.ems.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "ems_table")
public class UserDetails implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;

	@Column
	private String EmailId;

	@Column
	private Double Salary;

	@Column
	private Integer age;

	@Column
	private String job;

	private String password;

	@Column
	private String name;

}
