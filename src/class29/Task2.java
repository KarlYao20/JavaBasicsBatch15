package class29;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW Xi");
        cars.add("Tesla y");
        cars.add("Fx");

        System.out.println(cars);
        for(String car:cars){
            System.out.println(car);
        }
        for (int i = 0, carsSize = cars.size(); i < carsSize; i++) {
            String car = cars.get(i);
            System.out.println(car);
        }

    }
}
