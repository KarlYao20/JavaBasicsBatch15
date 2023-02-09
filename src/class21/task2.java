package class21;

public class task2 {

    static void method(String str1){
        System.out.println("Method with one string");
    }
    static void method(String str1,String str2){
        System.out.println("Method with two string");
    }
    static void method(String str1,String str2,String str3){
        System.out.println("Method with three string");
    }

    public static void main(String[] args) {
        method("Java");
        method("Java","Python");

    }
}
