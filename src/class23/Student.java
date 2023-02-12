package class23;

import java.sql.SQLOutput;

public class Student {

    public void study(){
        System.out.println("studying.... ");

    }
    void doHomeWork(){
        System.out.println("Solving Homeworks");
    }
    void practice(){
        System.out.println("Practicing the skills");
    }
}

class SyntaxStudent extends Student{
    @Override
    public void study() {
        System.out.println("Syntax Student must study Programming");
    }

    @Override
    void doHomeWork() {
        System.out.println("Syntax students must solve the homeworks before next class");
    }

    @Override
    void practice() {
        System.out.println("Syntax students must practice Repls");
    }
}

class CollegeStudent extends Student{
    @Override
    public void study() {
        System.out.println("College students must practice to get good grades");
    }

}

class SchoolStudent extends Student{

}




