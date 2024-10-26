abstract class Person {

    private String name;
    private int age;
    private String id;
    private String address;
    private String contact;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person(String name, int age, String id, String address, String contact) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }


    public String getContact() {
        return contact;
    }

    public abstract void displayDetails();
}
