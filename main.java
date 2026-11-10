// Base class containing basic arithmetic operations
class BasicCalculator {
    
    // Method for addition
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method for subtraction
    public double subtract(double a, double b) {
        return a - b;
    }
}

// Derived (Child) class inheriting from BasicCalculator
class AdvancedCalculator extends BasicCalculator {
    
    // Method for multiplication
    public double multiply(double a, double b) {
        return a * b;
    }
    
    // Method for division with zero-check
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}

// Main class to test the calculator
public class CalculatorApp {
    public static void main(String[] args) {
        // Instantiate the advanced calculator
        AdvancedCalculator calc = new AdvancedCalculator();
        
        double num1 = 20.0;
        double num2 = 5.0;
        
        System.out.println("--- Calculator Operations using Inheritance ---");
        System.out.println("Num 1: " + num1 + ", Num 2: " + num2);
        
        // Using inherited methods from BasicCalculator
        System.out.println("Addition (inherited): " + calc.add(num1, num2));
        System.out.println("Subtraction (inherited): " + calc.subtract(num1, num2));
        
        // Using methods from AdvancedCalculator
        System.out.println("Multiplication (advanced): " + calc.multiply(num1, num2));
        System.out.println("Division (advanced): " + calc.divide(num1, num2));
    }
}