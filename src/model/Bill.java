package model;

public class Bill {
    private double amount;
    private Patient patient;

    public Bill(Patient patient, double amount) {
        this.patient = patient;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public Patient getPatient() {
        return patient;
    }

    public void printBill(Patient patient) {
        System.out.println("========== BILL ==========");
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Amount: " + amount);
        System.out.println("==========================");
    }
}

