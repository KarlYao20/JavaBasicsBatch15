package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {


        MethodPractice md=new MethodPractice();
        boolean isEven= md.isEven(15);
        System.out.println(isEven);

        boolean isEven2=md.isEven(100);
        System.out.println(isEven2);
        System.out.println(md.isEven(12));
        System.out.println(md.isEven(20));

    }
}
