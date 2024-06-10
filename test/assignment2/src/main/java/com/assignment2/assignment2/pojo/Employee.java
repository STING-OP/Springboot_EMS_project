package com.assignment2.assignment2.pojo;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank(message = "employee name can't be left empty")
	private String employeeName;
	
	@Email(message = "Please enter a valid email Id")
	@NotNull(message = "Email cannot be NULL")
	private String employeeEmail;
	
	private long employeePhone;

	private String employeeGender;

	@Min(value = 0)
	private String employeeSalary;
	
	@NotBlank(message = "employee role can't be left empty")
	private String employeeRole;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;
}