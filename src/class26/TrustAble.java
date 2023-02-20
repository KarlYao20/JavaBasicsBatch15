package class26;

public interface TrustAble {
    int age=10;
    String color =" kjahsjasld";

    int trust();

    static void method1(){

    }
}
class Bank implements TrustAble{

    @Override
    public int trust() {
        return 0;
    }
}
