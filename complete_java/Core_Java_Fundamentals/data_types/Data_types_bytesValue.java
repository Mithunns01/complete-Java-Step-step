package Core_Java_Fundamentals.data_types;

public class Data_types_bytesValue {
    public static void main(String[] args) {
        int a = 2;
        String s = "hai";
        boolean b = true;
        float f = 20.4f;
        double d = 20.9;
        long l = 283298237273l;
        char c = 'a';
        short sh = 23;
        byte by = 12;
        System.out.println(a);
        System.out.println(s);
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);
        System.out.println(c);
        System.out.println(sh);
        System.out.println(by);

        //Byte 
        byte smallNumber = 100;         // Valid byte value
        byte negativeByte = -50;        // Valid negative byte value
        byte maxByte = 127;             // Maximum byte value
        byte minByte = -128;            // Minimum byte value

        System.out.println("smallNumber: " + smallNumber);
        System.out.println("negativeByte: " + negativeByte);
        System.out.println("maxByte: " + maxByte);
        System.out.println("minByte: " + minByte);
    }
}
