package model;

public class Patient extends Person {
    private Doctor doctor;

    public Patient(String name, int age) {
        super(name, age);
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public void setAssignedDoctor(Doctor doctor) {
        Doctor assignedDoctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}




