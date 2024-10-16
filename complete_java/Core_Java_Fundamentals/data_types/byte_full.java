package Core_Java_Fundamentals.data_types;

public class byte_full {
    public static void main(String[] args) {
         //Byte 

         //8 bits
         byte smallNumber = 100;         // Valid byte value
         byte negativeByte = -50;        // Valid negative byte value
         byte maxByte = 127;             // Maximum byte value
         byte minByte = -128;            // Minimum byte value
 
         System.out.println("smallNumber: " + smallNumber);
         System.out.println("negativeByte: " + negativeByte);
         System.out.println("maxByte: " + maxByte);
         System.out.println("minByte: " + minByte);

         byte sum = (byte)(smallNumber+negativeByte);
         byte difference = (byte)(smallNumber-negativeByte);
         byte product = (byte)(smallNumber*negativeByte);

         System.out.println(sum);
         System.out.println(difference);
         System.out.println(product);
    }
}
