// Person.java - Superclass (Parent Class)
// This is an ABSTRACT class - cannot create objects directly
// Demonstrates: ABSTRACTION and ENCAPSULATION
public abstract class Person {
    // Private attributes - ENCAPSULATION (data hiding)
    private String name;
    private int age;
    
    // Constructor - initializes Person objects
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter methods - public access to private data
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Setter methods - with validation
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age > 0) { // Validation
            this.age = age;
        }
    }
    
    // Method to be overridden by subclasses - POLYMORPHISM
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}