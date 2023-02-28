package class28;

import java.util.LinkedList;

public class ArrayListvsLinkeListDemo {
    public static void main(String[] args) {

        long startTime=System.currentTimeMillis();
        LinkedList<String> numbers=new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            numbers.add(0,"Test Data");

        }

        long endtime=System.currentTimeMillis();
        System.out.println(endtime-startTime);



    }
}
