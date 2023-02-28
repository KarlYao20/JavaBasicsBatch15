package class28;
import class26.Dog;
import java.util.ArrayList;
import java.util.Objects;

public class GenericArrayList {
    public static void main(String[] args) {



        ArrayList name=new ArrayList();
        name.add("Ehsan");
        name.add(10);
        name.add('a');
        name.add(new Dog("Jacky","Green","unknown"));

        for(Object j:name){
            ((String)j).trim();
        }
    }
}
