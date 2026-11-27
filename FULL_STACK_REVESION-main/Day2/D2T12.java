abstract class  Appliance{
   abstract void operate();
  void plugin(){
    System.out.println("Appliance plugged into power" );
  }
}
class Fan extends Appliance{
  void operate(){
    System.out.println("Fan is spinning at high speed");
  }
}
class WashingMachine extends Appliance{
  void operate(){
    System.out.println("Washing machine is washing clothes");
  }
}
public class D2T12 {
  public static void main(String[] args) {
    Fan obj = new Fan();
    WashingMachine obj1=new WashingMachine();
    obj.plugin();
    obj1.plugin();
    obj.operate();
    obj1.operate();
  }
  
}
