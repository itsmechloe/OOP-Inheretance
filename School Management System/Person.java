public class Person{
    protected String name, address;
    protected int age;

    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }

    public void introduce(){
        System.out.println("Hello, my name is " + name + ".");
    }
}