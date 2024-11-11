package com.healthcare.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.healthcare.entity.Department;
import com.healthcare.utils.HibernateUtil;

import java.util.List;

public class DepartmentDAO {
    public void addDepartment(Department department) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(department);
        transaction.commit();
        session.close();
    }

    public List<Department> getAllDepartments() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Department> departments = session.createQuery("from Department", Department.class).list();
        session.close();
        return departments;
    }

	public Department getDepartmentById(int departmentId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        Department department = session.get(Department.class, departmentId);  
        session.close();
        return department;
	
	}
}
