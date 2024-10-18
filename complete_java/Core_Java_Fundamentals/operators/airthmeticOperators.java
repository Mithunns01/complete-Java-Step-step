package Core_Java_Fundamentals.operators;

public class airthmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        
        System.out.println("Modulus: " + (a % b));
        try{
        System.out.println("Division: " + (a / b));
        } catch(ArithmeticException e){ 
            System.out.println("Error: Division by zero is not allowed");
        }  
    }
}
