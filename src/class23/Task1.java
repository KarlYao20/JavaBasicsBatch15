package class23;

public class Task1 {

    public static void main(String[] args) {
        Creditcard creditcard=new Creditcard(100,10);
        creditcard.CalculateInterest();
        Visa visa=new Visa(100,10);
        visa.CalculateInterest();
        AX ax=new AX(100,10);
        ax.CalculateInterest();
    }

}

class Creditcard{
    double balance;
    double interest;

    public Creditcard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void CalculateInterest(){
        System.out.println("Interest "+(balance*interest)/100);
    }
}

class Visa extends Creditcard{

    public Visa(double balance, double interest) {
        super(balance, interest);
    }


    public static void main(String[] args) {
        Creditcard creditcard=new Creditcard(100,10);
        creditcard.CalculateInterest();
    }
}
class AX extends Creditcard{

    AX(double balance, double interest){
        super(balance, interest);
    }
    public void CalculateInterest(){
        System.out.println("Interest "+(balance*interest)/100+50);

    }
}