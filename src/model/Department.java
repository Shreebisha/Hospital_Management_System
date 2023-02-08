package model;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Doctor> doctors;

    public Department(String name) {
        this.name = name;
        doctors = new ArrayList<Doctor>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public int getNumberOfDoctors() {
        return doctors.size();
    }

    public Doctor getDoctor() {
        return doctors.get(0);
    }

    public String getName() {
        return name;
    }
}