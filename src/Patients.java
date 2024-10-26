import java.util.List;
import java.util.ArrayList;

public class Patients extends Person implements Patient{

    private List<String> medicalHistory;


    public Patients(String name, int age, String id, String address, String contact) {
        super(name, age, id, address, contact);
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public void register() {
        System.out.println("Registering patient... : " +getName());
    }

    @Override
    public void addMedicalHistory(String history) {
        medicalHistory.add(history);
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getId());
        System.out.println("Medical History: " + medicalHistory);
        System.out.println("Contact: " + getContact());
        System.out.println("Address: " + getAddress());
    }
}
