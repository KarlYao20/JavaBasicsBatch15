package class27;

public class Demo1 {
    public static void main(String[] args) {
        String name="Karl";
        String name2 ="Alec";
        String name3="Kenneth";
        String[] names={"Karl","Alec","Kenneth","Mico"};
        displayNames(names);
        display2(name,name2,name3);
    }

    private static void displayNames(String names) {
    }

    public static void displayNames(String [] names){
        
        for(String name :names){
            System.out.println(name);
        }
    }
    public static void display2(String name,String name2,String name3){
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
    }

}
