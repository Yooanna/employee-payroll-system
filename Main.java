// Main.java - Driver class (contains main method)
// Demonstrates: OBJECT CREATION, USER INPUT, CONTROL STRUCTURES

import java.util.Scanner; // For user input

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Array to store Employee objects - up to 10 employees
        Employee[] employees = new Employee[10];
        int count = 0; // Track number of employees
        
        int choice; // Menu choice
        
        // DO-WHILE loop
        do {
            // Menu
            System.out.println("\n╔════════════════════════════╗");
            System.out.println("║ EMPLOYEE PAYROLL SYSTEM   ║");
            System.out.println("╠════════════════════════════╣");
            System.out.println("║ 1. Add Employee           ║");
            System.out.println("║ 2. View All Employees     ║");
            System.out.println("║ 3. Search Employee        ║");
            System.out.println("║ 4. Generate Payslip       ║");
            System.out.println("║ 5. Exit                   ║");
            System.out.println("╚════════════════════════════╝");
            System.out.print("Enter choice: ");
            
            choice = input.nextInt();
            input.nextLine();  // clear buffer
            
            // SWITCH statement
            switch(choice) {
                case 1:
                    // Add Employee - creating objects
                    if (count < employees.length) {
                        System.out.println("\n--- ADD EMPLOYEE ---");
                        System.out.print("Name: ");
                        String name = input.nextLine();
                        
                        System.out.print("Age: ");
                        int age = input.nextInt();
                        input.nextLine();
                        
                        System.out.print("Employee ID: ");
                        String id = input.nextLine();
                        
                        System.out.print("Basic Salary: RM");
                        double salary = input.nextDouble();
                        
                        // Create new Employee object
                        employees[count] = new Employee(name, age, id, salary);
                        count++;
                        System.out.println("✓ Employee added successfully!");
                    } else {
                        System.out.println("✗ Array is full!");
                    }
                    break;
                    
                case 2:
                    // View All Employees - using FOR loop
                    if (count > 0) {
                        System.out.println("\n--- EMPLOYEE LIST ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nEmployee #" + (i+1));
                            employees[i].displayInfo(); // Polymorphism
                        }
                    } else {
                        System.out.println("No employees found!");
                    }
                    break;
                    
                case 3:
                    // Search Employee by ID
                    if (count > 0) {
                        System.out.print("\nEnter Employee ID to search: ");
                        String searchId = input.nextLine();
                        boolean found = false;
                        
                        for (int i = 0; i < count; i++) {
                            if (employees[i].getEmployeeId().equals(searchId)) {
                                System.out.println("\n✓ EMPLOYEE FOUND:");
                                employees[i].displayInfo();
                                found = true;
                                break;
                            }
                        }
                        
                        // IF-ELSE statement
                        if (!found) {
                            System.out.println("✗ Employee not found!");
                        }
                    } else {
                        System.out.println("No employees to search!");
                    }
                    break;
                    
                case 4:
                    // Generate Payslip
                    if (count > 0) {
                        System.out.print("\nEnter Employee ID for payslip: ");
                        String payId = input.nextLine();
                        boolean payslipFound = false;
                        
                        for (int i = 0; i < count; i++) {
                            if (employees[i].getEmployeeId().equals(payId)) {
                                employees[i].displayPaySlip();
                                payslipFound = true;
                                break;
                            }
                        }
                        
                        if (!payslipFound) {
                            System.out.println("✗ Employee not found!");
                        }
                    } else {
                        System.out.println("No employees to generate payslip!");
                    }
                    break;
                    
                case 5:
                    System.out.println("\nThank you for using the system!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Try again.");
            }
            
        } while (choice != 5); // Continue until user chooses Exit
        
        input.close();  // Close scanner
    }
}