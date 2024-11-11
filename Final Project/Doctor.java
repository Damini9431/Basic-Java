package com.healthcare.entity;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String specialization;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // Constructor , Getters and Setters
    
	public Doctor() {
		super();
		
	}

	public Doctor(int id, String name, String specialization, String phone, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.phone = phone;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
     
}
