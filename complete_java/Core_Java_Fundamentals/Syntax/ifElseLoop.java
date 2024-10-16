package Core_Java_Fundamentals.Syntax;
import java.util.Scanner;
public class ifElseLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter the number to check");
        int n = scan.nextInt();
        if(n%2==0){
            System.out.println(" entered number is even");
        }else{
            System.out.println("entered number is odd ");
        }
        for(int i = 0; i<=n; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int count =0;
        while (count <=n) {
            System.out.print(count+" ");
            count ++;
        }
        scan.close();
    }
}
