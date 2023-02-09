package class21;

public class task1 {


    void area(int num1, int num2){
        System.out.println(num1*num2);
    }
    void area(int num1){
        System.out.println(num1*num1);
    }

    public static void main(String[] args) {

        task1 task = new task1();
        task.area(10);
    }
}

