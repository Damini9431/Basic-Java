package com.healthcare.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.healthcare.entity.Patient;
import com.healthcare.utils.HibernateUtil;

import java.util.List;

public class PatientDAO {
    public void addPatient(Patient patient) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(patient);
        transaction.commit();
        session.close();
    }

    public List<Patient> getAllPatients() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Patient> patients = session.createQuery("from Patient", Patient.class).list();
        session.close();
        return patients;
    }

    public void updatePatient(Patient patient) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(patient);
        transaction.commit();
        session.close();
    }

    public void deletePatient(int patientId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Patient patient = session.get(Patient.class, patientId);
        if (patient != null) {
            session.delete(patient);
        }
        transaction.commit();
        session.close();
    }

    public Patient getPatientById(int patientId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Patient patient = session.get(Patient.class, patientId);  
        session.close();
        return patient;
		
	}
}