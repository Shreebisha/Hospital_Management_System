package model;

import java.util.ArrayList;
public class Hospital {
    private ArrayList<Department> departments;
    private ArrayList<Appointment> appointments;
    private ArrayList<Bill> bills;

    public Hospital() {
        departments = new ArrayList<Department>();
        appointments = new ArrayList<Appointment>();
        bills = new ArrayList<Bill>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void assignDoctor(Patient patient) {
        for (Department department : departments) {
            if (department.getNumberOfDoctors() > 0) {
                Doctor doctor = department.getDoctor();
                patient.setAssignedDoctor(doctor);
                break;
            }
        }
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public void displayDepartments() {
        System.out.println("Departments in the Hospital:");
        for (Department department : departments) {
            System.out.println(department.getName());
        }
    }

    public void displayAppointments() {
        System.out.println("Appointments in the Hospital:");
        for (Appointment appointment : appointments) {
            System.out.println("Doctor: " + appointment.getDoctor().getName() +
                    ", Patient: " + appointment.getPatient().getName() +
                    ", Date: " + appointment.getDate());
        }
    }

    public void displayBills() {
        System.out.println("Bills in the Hospital:");
        for (Bill bill : bills) {
            System.out.println("Patient: " + bill.getPatient().getName() +
                    ", Amount: " + bill.getAmount());
        }
    }
}
