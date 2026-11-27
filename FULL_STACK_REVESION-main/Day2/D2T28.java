interface SmartDevice {
  public void connectWifi();
  default void deviceStatus() {
System.out.println("Smart device is ready");
  }
}
class SmartTV implements SmartDevice{
 public  void connectWifi(){
    System.out.println("Smart TV connected to WiFi");
  }
}
class SmartWatch implements SmartDevice{
  public void connectWifi(){
    System.out.println("Smart Watch connected to WiFi");
  }
}

public class D2T28 {
  public static void main(String[] args) {
    SmartDevice obj = new SmartTV();
    SmartDevice obj1=new SmartWatch();
    obj.connectWifi();
    obj.deviceStatus();
    obj1.connectWifi();
    obj1.deviceStatus();

  }
}
