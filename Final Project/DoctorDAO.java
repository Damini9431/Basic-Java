package com.healthcare.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.healthcare.entity.Doctor;
import com.healthcare.utils.HibernateUtil;

import java.util.List;

public class DoctorDAO {
    public void addDoctor(Doctor doctor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(doctor);
        transaction.commit();
        session.close();
    }

    public List<Doctor> getAllDoctors() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Doctor> doctors = session.createQuery("from Doctor", Doctor.class).list();
        session.close();
        return doctors;
    }

    public void updateDoctor(Doctor doctor) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(doctor);
        transaction.commit();
        session.close();
    }

    public void deleteDoctor(int doctorId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Doctor doctor = session.get(Doctor.class, doctorId);
        if (doctor != null) {
            session.delete(doctor);
        }
        transaction.commit();
        session.close();
    }

    public Doctor getDoctorById(int doctorId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Doctor doctor = session.get(Doctor.class, doctorId);  
        session.close();
        return doctor;
	}
}
