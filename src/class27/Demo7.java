package class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {


        ArrayList<String> names=new ArrayList<>();
        names.add("Karl");
        names.add("Mico");
        names.add("Alec");
        names.add("kenneth");
        names.add("Dave");
        names.add("Eric");

        System.out.println(names.contains("Daria"));
        System.out.println(names);
        names.remove("Karl");
        System.out.println(names);
        names.set(3,"Sam");
        System.out.println(names);
        System.out.println(names.indexOf("Karl"));


    }
}
