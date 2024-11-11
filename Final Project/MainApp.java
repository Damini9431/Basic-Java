package com.healthcare.entity;

import java.util.List;
import java.util.Scanner;
import com.healthcare.dao.AppointmentDAO;
import com.healthcare.dao.DepartmentDAO;
import com.healthcare.dao.DoctorDAO;
import com.healthcare.dao.PatientDAO;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;  

public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PatientDAO patientDAO = new PatientDAO();
        DoctorDAO doctorDAO = new DoctorDAO();
        AppointmentDAO appointmentDAO = new AppointmentDAO();
        DepartmentDAO departmentDAO = new DepartmentDAO();

        while (true) {
            System.out.println("\n=== Healthcare Management System ===");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Update Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Add Doctor");
            System.out.println("6. View All Doctors");
            System.out.println("7. Update Doctor");
            System.out.println("8. Delete Doctor");
            System.out.println("9. Add Appointment");
            System.out.println("10. View All Appointments");
            System.out.println("11. Cancel Appointment");
            System.out.println("12. Add Department");
            System.out.println("13. View All Departments");
            System.out.println("14. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.println("=== Add Patient ===");
                    System.out.print("Enter Patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Patient gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter Patient phone no: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter Patient address: ");
                    String address = scanner.nextLine();

                    Patient patient = new Patient();
                    patient.setName(name);
                    patient.setAge(age);
                    patient.setGender(gender);
                    patient.setPhone(phone);
                    patient.setAddress(address);
                    patientDAO.addPatient(patient);
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                	
                	    System.out.println("=== View All Patients ===");
                	    List<Patient> patients = patientDAO.getAllPatients();
                	    if (patients.isEmpty()) {
                	        System.out.println("No patients found.");
                	    } else {
                	        for (Patient p : patients) {
                	            System.out.println("Patient ID: " + p.getId());
                	            System.out.println("Name: " + p.getName());
                	            System.out.println("Age: " + p.getAge());
                	            System.out.println("Gender: " + p.getGender());
                	            System.out.println("Phone: " + p.getPhone());
                	            System.out.println("Address: " + p.getAddress());
                	            System.out.println("-------------");
                	        }
                	    }
              
                    break;

                case 3:
                	System.out.println("=== Update Patients ===");
                    System.out.print("Enter Patient ID to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  
                    patient = patientDAO.getPatientById(id);

                    if (patient != null) {
                        System.out.print("Enter new name: ");
                        patient.setName(scanner.nextLine());
                        System.out.print("Enter new age: ");
                        patient.setAge(scanner.nextInt());
                        scanner.nextLine();  
                        System.out.print("Enter new gender: ");
                        patient.setGender(scanner.nextLine());
                        System.out.print("Enter new phone: ");
                        patient.setPhone(scanner.nextLine());
                        System.out.print("Enter new address: ");
                        patient.setAddress(scanner.nextLine());

                        patientDAO.updatePatient(patient);
                        System.out.println("Patient updated successfully!");
                    } else {
                        System.out.println("Patient not found!");
                    }
                    break;

                case 4:
                	System.out.println("=== Delete Patients ===");
                    System.out.print("Enter Patient ID to delete: ");
                    id = scanner.nextInt();
                    scanner.nextLine();  
                    patientDAO.deletePatient(id);
                    System.out.println("Patient deleted successfully!");
                    break;

                case 5:
                	System.out.println("=== Add Doctor ===");
                    System.out.print("Enter Doctor name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter specialization: ");
                    String specialization = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    phone = scanner.nextLine();
                    
                    System.out.print("Enter Department ID: ");
                    int departmentId = scanner.nextInt();
                    scanner.nextLine();  

                    Department department = departmentDAO.getDepartmentById(departmentId);
                    
                    if (department != null) {
                        
                        Doctor doctor = new Doctor();
                        doctor.setName(name);
                        doctor.setSpecialization(specialization);
                        doctor.setPhone(phone);
                        doctor.setDepartment(department); 
                        
                        doctorDAO.addDoctor(doctor);
                        System.out.println("Doctor added successfully!");
                    } else {
                        System.out.println("Department not found! Please enter a valid Department ID.");
                    }
                    break;
                    
                case 6:
                	
                	    System.out.println("=== View All Doctors ===");
                	    List<Doctor> doctors = doctorDAO.getAllDoctors();
                	    
                	    if (doctors.isEmpty()) {
                	        System.out.println("No doctors found.");
                	    } else {
                	        for (Doctor doctor : doctors) {
                	            System.out.println("Doctor ID: " + doctor.getId());
                	            System.out.println("Name: " + doctor.getName());
                	            System.out.println("Specialization: " + doctor.getSpecialization());
                	            System.out.println("Phone: " + doctor.getPhone());
                	            
                	            Department d = doctor.getDepartment();
                	            if (d != null) {
                	                System.out.println("Department ID: " + d.getId());
                	            } else {
                	                System.out.println("Department: No Department Assigned");
                	            }
                	            
                	            System.out.println("-----------"); 
                	        }
                	    }
                	break;

                case 7:
                	System.out.println("=== Update Doctors ===");
                    System.out.print("Enter Doctor ID to update: ");
                    id = scanner.nextInt();
                    scanner.nextLine();  
                    Doctor doctor = doctorDAO.getDoctorById(id);

                    if (doctor != null) {
                        System.out.print("Enter new name: ");
                        doctor.setName(scanner.nextLine());
                        System.out.print("Enter new specialization: ");
                        doctor.setSpecialization(scanner.nextLine());
                        System.out.print("Enter new phone: ");
                        doctor.setPhone(scanner.nextLine());

                        doctorDAO.updateDoctor(doctor);
                        System.out.println("Doctor updated successfully!");
                    } else {
                        System.out.println("Doctor not found!");
                    }
                    break;

                case 8:
                	System.out.println("=== Delete Doctors ===");
                    System.out.print("Enter Doctor ID to delete: ");
                    id = scanner.nextInt();
                    scanner.nextLine();  
                    doctorDAO.deleteDoctor(id);
                    System.out.println("Doctor deleted successfully!");
                    break;

                case 9:
                    System.out.println("=== Add Appointment ===");
                    System.out.print("Enter Patient ID: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Doctor ID: ");
                    int doctorId = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter Appointment Date (yyyy-MM-dd): ");
                    String dateStr = scanner.nextLine();

                    try {
                        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
                        patient = patientDAO.getPatientById(patientId);
                        doctor = doctorDAO.getDoctorById(doctorId);

                        if (patient != null && doctor != null) {
                            Appointment appointment = new Appointment();
                            appointment.setPatient(patient);
                            appointment.setDoctor(doctor);
                            appointment.setAppointmentDate(date);
                            appointmentDAO.addAppointment(appointment);
                            System.out.println("Appointment added successfully!");
                        } else {
                            System.out.println("Invalid Patient or Doctor ID!");
                        }
                    } catch (ParseException e) {
                        System.out.println("Invalid date format!");
                    }
                    break;

                case 10:
                	System.out.println("=== View All Appointments ===");
                    List<Appointment> appointments = appointmentDAO.getAllAppointments();

                    if (appointments.isEmpty()) {
                        System.out.println("No appointments found.");
                    } else {
                        for (Appointment appointment : appointments) {
                            //System.out.println("Appointment ID: " + appointment.getId());
                            System.out.println("Appointment Date: " + appointment.getAppointmentDate());

                            Patient p = appointment.getPatient();
                            if (p != null) {
                                System.out.println("Patient ID: " + p.getId());
                                
                            } else {
                                System.out.println("Patient: Not Available");
                            }

                            Doctor d = appointment.getDoctor();
                            if (d != null) {
                                System.out.println("Doctor ID: " + d.getId());
                                
                            } else {
                                System.out.println("Doctor: Not Available");
                            }

                            System.out.println("-------------");
                        }
                    }
                    break;

                case 11:
                	System.out.println("=== Cancel Appointments ===");
                    System.out.print("Enter Appointment ID to cancel: ");
                    id = scanner.nextInt();
                    scanner.nextLine();  
                    appointmentDAO.cancelAppointment(id);
                    System.out.println("Appointment canceled successfully!");
                    break;

                case 12:
                	System.out.println("=== Add Department ===");
                    System.out.print("Enter Department name: ");
                    String departmentName = scanner.nextLine();
                    Department newDepartment = new Department();
                    newDepartment.setName(departmentName);
                    departmentDAO.addDepartment(newDepartment);
                    System.out.println("Department added successfully!");
                    break;

                case 13:
                    System.out.println("=== View All Departments ===");
                    List<Department> departments = departmentDAO.getAllDepartments();
                    if (departments.isEmpty()) {
                        System.out.println("No departments found.");
                    } else {
                        for (Department departmentObj : departments) {
                        	System.out.println(" ID: " + departmentObj .getId());
            	            System.out.println(" Name: " + departmentObj .getName());
                           
                        }
                    }
                    break;

                case 14:
                	System.out.println("=== Exit ===");
                    System.out.println("Exiting the system...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
                    
                  scanner.close();            }
        }
    }
}