import model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Department De1 = new Department("Cardiology");
        Doctor D1 = new Doctor("Dr. Smith", 45,"cardiology");
        Doctor D2 = new Doctor("Dr. Johnson", 35,"cardiology");
        De1.addDoctor(D1);
        De1.addDoctor(D2);
        hospital.addDepartment(De1);

        Department De2 = new Department("Orthopedics");
        Doctor Do1 = new Doctor("Dr. Patel", 50,"orthopedics");
        Doctor Do2 = new Doctor("Dr. Lee", 40,"orthopedics");
        De2.addDoctor(Do1);
        De2.addDoctor(Do2);
        hospital.addDepartment(De2);

        Patient patient1 = new Patient("John Doe", 25);
        Patient patient2 = new Patient("Jane Doe", 30);
        Patient patient3 = new Patient("Jim Brown", 35);
        hospital.assignDoctor(patient1);
        hospital.assignDoctor(patient2);
        hospital.assignDoctor(patient3);

        Appointment appointment1 = new Appointment(Do1, patient1, "2022-01-01");
        Appointment appointment2 = new Appointment(Do2, patient2, "2022-02-01");
        Appointment appointment3 = new Appointment(D1, patient3, "2022-03-01");
        hospital.addAppointment(appointment1);
        hospital.addAppointment(appointment2);
        hospital.addAppointment(appointment3);

        Bill bill1 = new Bill(patient1, 1000.0);
        Bill bill2 = new Bill(patient2, 2000.0);
        Bill bill3 = new Bill(patient3, 3000.0);
        hospital.addBill(bill1);
        hospital.addBill(bill2);
        hospital.addBill(bill3);

        hospital.displayDepartments();
        hospital.displayAppointments();
        hospital.displayBills();
    }
}
