package Class13;

public class Task3 {
    public static void main(String[] args) {
        String dadsname="zafar";
        String momsname="Hamid";
        String Expectation="girl";
        String firsthalf="";
        String secondhalf="";
        if (Expectation.equalsIgnoreCase("boy")){
            String firstHalf=dadsname.substring(0,dadsname.length()/2);
            String secondHalf=momsname.substring(momsname.length()/2);




    }else {
            firsthalf=momsname.substring(0,momsname.length()/2);
            secondhalf=dadsname.substring(dadsname.length()/2);
        }
        System.out.println(firsthalf+secondhalf);
}
}

