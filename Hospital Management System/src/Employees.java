 abstract class Employees extends Person implements Employee{

    private String department;
    private double salary;

    public Employees(String name, int age, String id, String address, String contact,String department,double salary) {
        super(name, age, id, address, contact);
        this.department = department;
        this.salary = salary;

    }

    public Employees(String name, int age, String id, String address, String contact, double salary) {
        super(name, age, id, address, contact);
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }


    public double getSalary() {
        return salary;
    }

    public abstract double calculateSalary(double bonus);


}
