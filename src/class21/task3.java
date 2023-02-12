package class21;

import Class13.Task3;

public class task3 {
   public void method(String str1){
        System.out.println("Method with one string");
    }
    public void method(String str1,String str2){
        System.out.println("Method with two string");
    }
    public void method(String str1,String str2,String str3){
        System.out.println("Method with three string");
    }

    public static void main(String[] args) {
       task3 task3=new task3();

        task3.method("Java");
        task3.method("Java","Python");

    }
}


