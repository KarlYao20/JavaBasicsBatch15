package CLASS4;

public class NestifDemo5 {
    public static void main(String[] args) {
        int money = 1000;
        String day = "Sunday";
        Boolean mood = true;

        if (money > 700) {

            if (mood) {
                System.out.println("Lets go Shopping");
            } else {
                System.out.println("lets save some money first");
            }
        }
    }
}