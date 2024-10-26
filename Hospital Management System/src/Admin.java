public class Admin extends Employees{

    public Admin(String name, int age, String id, String address, String contact, double salary) {
        super(name, age, id, address, contact, salary);
    }

    @Override
    public double calculateSalary(double bonus) {
        double baseSalary = getSalary();
        double finalSalry = baseSalary +bonus;
        return finalSalry;
    }

    @Override
    public void performDuties() {
        System.out.println(getName()+ " Performing admin duties...");
    }

    @Override
    public void displayDetails() {
        System.out.println("Admin Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getId());
        System.out.println("Salary: " + getSalary());
        System.out.println("Contact: " + getContact());
        System.out.println("Address: " + getAddress());
    }
}
