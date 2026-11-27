abstract class AbstractVehical{
  abstract void start();
  void run(){
    System.out.println("running");
  }
}
class Bike extends AbstractVehical{
  @Override 
  void start(){
    System.out.println("starting......");
  }
}
public class Abstraction {
  public static void main(String[] args) {
    Bike obj = new Bike();
    obj.start();
    obj.run();
  }
  
}
