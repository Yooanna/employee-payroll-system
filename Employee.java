// Employee.java - Subclass (Child Class)
// Demonstrates: INHERITANCE (extends Person)
// Demonstrates: IMPLEMENTATION (implements Payroll)
// Demonstrates: POLYMORPHISM (method overriding)

public class Employee extends Person implements Payroll {
    // Private attributes - ENCAPSULATION
    private String employeeId;
    private double basicSalary;
    
    // Constructor - calls parent constructor using super()
    public Employee(String name, int age, String employeeId, double basicSalary) {
        super(name, age);  // Call Person constructor
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }
    
    // Getters methods
    public String getEmployeeId() {
        return employeeId;
    }
    
    public double getBasicSalary() {
        return basicSalary;
    }
    
    // Setters methods
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    public void setBasicSalary(double basicSalary) {
        if (basicSalary > 0) {
            this.basicSalary = basicSalary;
        }
    }
    
    //Implement Payroll interface methods
    @Override
    public double calculateSalary() {
        // Net salary = Basic - Deduction + Bonus
        return basicSalary - calculateDeduction() + calculateBonus();
    }
    
    @Override
    public double calculateBonus() {
        return basicSalary * 0.10;  // 10% bonus
    }
    
    @Override
    public double calculateDeduction() {
        return basicSalary * 0.05;   // 5% deduction
    }
    
    @Override
    public void displayPaySlip() {
        System.out.println("\n=========================");
        System.out.println("       PAYSLIP");
        System.out.println("=========================");
        System.out.println("Employee ID  : " + employeeId);
        System.out.println("Name         : " + getName());
        System.out.println("Age          : " + getAge());
        System.out.println("-------------------------");
        System.out.println("Basic Salary : RM" + basicSalary);
        System.out.println("Bonus (10%)  : RM" + calculateBonus());
        System.out.println("Deduction(5%): RM" + calculateDeduction());
        System.out.println("-------------------------");
        System.out.println("NET SALARY   : RM" + calculateSalary());
        System.out.println("=========================");
    }
    
    // Override Person's displayInfo method - POLYMORPHISM
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Employee ID  : " + employeeId);
        System.out.println("Basic Salary : RM" + basicSalary);
    }
}