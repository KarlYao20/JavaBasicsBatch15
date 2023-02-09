package class15;

import java.util.Enumeration;
import java.util.Scanner;

public class MethodsDemo1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= scan.nextInt();

        System.out.println("You entered "+num);

        Methods methods=new Methods();
       // String num2=methods.doSomething();
        char c= methods.method2();
    }
}
