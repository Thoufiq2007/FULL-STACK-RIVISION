class Device{
  String powerSource;
  void turnOn(){
    System.out.println("turned onn");
  }
}
class HybridMobile extends Device{
  double screensize=6.5;
  void makecall(){
    System.out.println("ringing");
  }
}
class Andriod extends HybridMobile{
   void openplaystore(){
    System.out.println("opened play store");
  }
}
class iphone extends HybridMobile{
  void openAppStore(){
    System.out.println("openeddd app store");
  }
}
public class HybrideInheritance {
  public static void main(String[] args) {
    Andriod obj = new Andriod();
    HybridMobile obj1 = new HybridMobile();
    obj.turnOn();
    obj1.turnOn();
    obj.makecall();
    obj1.makecall();
    obj.openplaystore();
    
  }
  
}
