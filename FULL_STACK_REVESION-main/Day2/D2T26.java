interface  Alert{
  public void sendAlert(String message);
}
class EmailAlert implements Alert{
  public void sendAlert(String message) {
    System.out.println("Email Alert: " + message);
  }
}
class MobileAlert implements Alert {
 public void sendAlert(String message) {
    System.out.println("Mobile Alert: " + message);
  }
}
public class D2T26 {
  public static void main(String[] args) {
    Alert obj = new EmailAlert();
     Alert obj1 = new MobileAlert();
     obj.sendAlert("stay alert");
     obj1.sendAlert("need to take action");
  }
  
}
