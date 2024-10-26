import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Doctor d1= new Doctor("Ali",26,"e1","street21-giza","0100203025",
                "eye",6500,"جراحة",2);

        d1.performDuties();
        System.out.println("------------------");
        System.out.println("Final salary:  " +d1.calculateSalary(1200));
        System.out.println("------------------");
        d1.displayDetails();

        System.out.println("********************************************************\n");

        Nurse n1= new Nurse("hiam",24,"a1","giza","01011254896",
                "eye",4200,"night",3);
        n1.performDuties();
        System.out.println("------------------");
        System.out.println("Final salary:  " +n1.calculateSalary(1200));
        System.out.println("------------------");
        n1.displayDetails();

        System.out.println("********************************************************\n");

        Admin a1= new Admin("reem",22,"i1","Cairo","0111126589",4200);
        a1.performDuties();
        System.out.println("------------------");
        System.out.println("Final salary:  " +a1.calculateSalary(1200));
        System.out.println("------------------");
        a1.displayDetails();

        System.out.println("********************************************************\n");

        Patients p1 = new Patients("Alice Brown", 25, "P001","cairo-20s","01232569874");
        p1.register();
        System.out.println("------------------");
        p1.addMedicalHistory("Asthma");
        p1.addMedicalHistory("Eye allergy");
        p1.displayDetails();

        System.out.println("********************************************************\n");

        Appointment app = new Appointment("ap11","P001","A01",new Date());
        app.scheduleAppointment();

        System.out.println("********************************************************\n");

        Medication m1 = new Medication("Panadol",40);
        m1.prescribeMedication();


    }
}