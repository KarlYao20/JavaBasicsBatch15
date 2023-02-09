package class15;

public class Student {

    String id;
    String name;
    int age;
    double weight;
//constructor
    public Student(String sName,String sID,int sAge){
        id=sID;
        name=sName;
        age=sAge;
    }
   public Student(String sName,String sID,int sAge,double sWeight){
        id=sID;
        name=sName;
        age=sAge;
        weight=sWeight;
    }
    void printInfo(){
        System.out.println(name+" "+id+" "+age+" "+weight);
    }
}
