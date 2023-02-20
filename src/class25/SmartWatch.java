package class25;
interface WashAble{
     void wash();
}
public class SmartWatch implements WashAble{
    @Override
    public void wash() {
        System.out.println("You can wash this smartwatch without any issues");
    }
}


class Phone implements WashAble{

@Override
public void wash(){
    System.out.println("I am IP65 Rated you can wash me");
}
void turnOn() {
    System.out.println("Press the power button to turn me on");
    }
}
class Inverter implements WashAble{
  public void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}