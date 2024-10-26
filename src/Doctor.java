public class Doctor extends Employees{

    private String specialization;
    private int experience;


    public String getSpecialization() {
        return specialization;
    }

    public int getExperience() {
        return experience;
    }

    public Doctor(String name, int age, String id, String address, String contact, String department, double salary, String specialization, int experience) {
        super(name, age, id, address, contact, department, salary);
        this.specialization = specialization;
        this.experience = experience;
    }
    @Override
    public double calculateSalary(double bonus) {
        double baseSalary = getSalary();
        double experienceBonus = experience * 500;
        double finalSalry = baseSalary +experienceBonus+bonus;
        return finalSalry;
    }

    @Override
    public void performDuties() {
        System.out.println(getName()+ " Performing doctor duties...");

    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getId());
        System.out.println("Department: " + getDepartment());
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("Salary: " + getSalary());
        System.out.println("contact: " + getContact());
        System.out.println("Address: " + getAddress());
    }
}
