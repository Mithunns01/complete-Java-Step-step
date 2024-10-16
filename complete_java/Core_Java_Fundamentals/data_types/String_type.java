package Core_Java_Fundamentals.data_types;

public class String_type {
    public static void main(String[] args) {
        //16-bit

        char letter = 'A';               // Single character
        char digit = '1';                // Numeric character
        char symbol = '$';               // Special symbol
        char unicodeChar = '\u0041';     // Unicode representation of 'A'

        System.out.println("Letter: " + letter);
        System.out.println("Digit: " + digit);
        System.out.println("Symbol: " + symbol);
        System.out.println("Unicode Character: " + unicodeChar);

        // Performing operations with char
        char nextLetter = (char) (letter + 1);
        System.out.println("Next Letter: " + nextLetter);

        // Using char in control structures
        if (letter == 'A') {
            System.out.println("The letter is A.");
        }
    }
}
