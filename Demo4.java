package EncapsulationDemo.constructor;

class Student {
    int age;
    String name;

    // Default constructor
    public Student() {
        System.out.println("Default constructor");
        name = "Rohan";
        System.out.println(name);
    }

    // Parameterized constructor
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(age+" "+name);
    }
}

public class Demo4 {
    public static void main(String[] args) {
        // Creating an object of Student using the default constructor
        Student obj = new Student();
        Student obj2=new Student(45,"prakash");
    }
}
