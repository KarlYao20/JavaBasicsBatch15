package CLASS14;

import java.util.Scanner;

public class MethTester {
    public static void main(String[] args) {
        Meth meth=new Meth();
        meth.add(10,10);
        meth.mul(10,2,3);
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();

        int result=meth.sub(100,50);
        System.out.println(result);
    }
}
