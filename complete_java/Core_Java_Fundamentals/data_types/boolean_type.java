package Core_Java_Fundamentals.data_types;

public class boolean_type {
    public static void main(String[] args) {
        //

            boolean isJavaFun = true;              // Boolean true value
            boolean isFishTasty = false;           // Boolean false value

        // Using boolean in conditional statements
        
        if (isJavaFun) {
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun.");
        }

        if (isFishTasty) {
            System.out.println("Fish is tasty!");
        } else {
            System.out.println("Fish is not tasty.");
        }

        // Logical operations
        boolean result1 = isJavaFun && isFishTasty;
        boolean result2 = isJavaFun || isFishTasty;
        boolean result3 = !isJavaFun;

        System.out.println("Result of isJavaFun && isFishTasty: " + result1);
        System.out.println("Result of isJavaFun || isFishTasty: " + result2);
        System.out.println("Result of !isJavaFun: " + result3);
    }
}
