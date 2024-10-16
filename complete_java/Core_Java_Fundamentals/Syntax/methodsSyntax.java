package Core_Java_Fundamentals.Syntax;

public class methodsSyntax {
        public static int add(int a, int b){
            return a+b;
        }
        public static String hello(String name){
            return "hello"+name;
        }
    public static void main(String[] args) {
        int a = 29;
        int c = 10;
        System.out.println(hello("Mithun"));
        System.out.println(add(a, c));
    }
}
