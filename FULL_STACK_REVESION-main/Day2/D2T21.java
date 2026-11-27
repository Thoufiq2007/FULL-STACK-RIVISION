abstract class Vehicle99{
  abstract void startEngine();
  void stopEngine(){
    System.out.println("Vehicle engine stopped");
  }
}
class Bike99 extends Vehicle99{
  void startEngine(){
    System.out.println("Bike engine started using self-start");
  }
}
public record D2T21() {
  public static void main(String[] args) {
    Bike99 obj = new Bike99();
    obj.startEngine();
    obj.stopEngine();

  }
}
