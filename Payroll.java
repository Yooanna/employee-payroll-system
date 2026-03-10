// Payroll.java - INTERFACE
// Demonstrates: ABSTRACTION (100% abstract)
// All methods are abstract (no body)

public interface Payroll {
    // Abstract methods - must be implemented by Employee class
    double calculateSalary(); // Calculate net salary
    double calculateBonus(); // Calculate bonus amount
    double calculateDeduction(); // Calculate tax/deductions
    void displayPaySlip();  // Display complete payslip
}