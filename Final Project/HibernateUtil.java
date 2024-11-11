package com.healthcare.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create a Configuration instance and configure it with hibernate.cfg.xml
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");

            // Build the SessionFactory from the Configuration
            sessionFactory = configuration.buildSessionFactory();
        } catch (HibernateException ex) {
            // Log the exception if there is an issue with building the SessionFactory
            System.err.println("SessionFactory creation failed: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    // Method to get the singleton SessionFactory instance
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    // Clean up the SessionFactory when the application is done
    public static void shutdown() {
        getSessionFactory().close();
    }
}
