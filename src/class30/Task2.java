package class30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        Set<Student> students=new HashSet<>();
        students.add(new Student("Ana A",123));
        students.add(new Student("Lilia L",456));
        students.add(new Student("Sofia S",789));
        students.add(new Student("Maya M",342));

        for(Student student:students){
            System.out.println(student.getName());
    }}
}
class Student{
    private String name;
    private int studentID;

    public Student(String name,int studentID){
        this.name= name;
        this.studentID= studentID;

    }
    public String getName(){
        return name;
    }
    public int getStudentID(){
        return studentID;

    }

    }

