package com.healthcare.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.healthcare.entity.Appointment;
import com.healthcare.utils.HibernateUtil;

import java.util.List;

public class AppointmentDAO {
    public void addAppointment(Appointment appointment) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(appointment);
        transaction.commit();
        session.close();
    }

    public List<Appointment> getAllAppointments() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Appointment> appointments = session.createQuery("from Appointment", Appointment.class).list();
        session.close();
        return appointments;
    }

    public void cancelAppointment(int appointmentId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Appointment appointment = session.get(Appointment.class, appointmentId);
        if (appointment != null) {
            session.delete(appointment);
        }
        transaction.commit();
        session.close();
    }
}
