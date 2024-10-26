public class Nurse extends Employees{

    private String shift;
    private int experience;

    public Nurse(String name, int age, String id, String address, String contact, String department, double salary, String shift, int experience) {
        super(name, age, id, address, contact, department, salary);
        this.shift = shift;
        this.experience = experience;
    }

    public String getShift() {
        return shift;
    }


    public int getExperience() {
        return experience;
    }

    @Override
    public double calculateSalary(double bonus) {
        double baseSalary = getSalary();
        double experienceBonus = experience * 300;
        double finalSalry = baseSalary +experienceBonus+bonus;
        return finalSalry;
    }

    @Override
    public void performDuties() {
        System.out.println(getName()+ " Performing nurse  duties...");
    }

    @Override
    public void displayDetails() {
        System.out.println("Nurse Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID: " + getId());
        System.out.println("Department: " + getDepartment());
        System.out.println("Shift: " + getShift());
        System.out.println("Experience: " + getExperience());
        System.out.println("Salary: " + getSalary());
        System.out.println("Contact: " + getContact());
        System.out.println("Address: " + getAddress());
    }
}
