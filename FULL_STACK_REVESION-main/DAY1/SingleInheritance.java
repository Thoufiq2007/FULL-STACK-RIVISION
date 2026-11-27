class InheritedVehical{
  String brand ="BMW";
  void honk(){
    System.out.println("beep! Beep!");
  }
}
class car extends InheritedVehical{
  String modelName ="M4";
  void displayDetails(){
    System.out.println("brand "+ brand);
    System.out.println("modelname: "+modelName);
  }
}
public class SingleInheritance {
  public static void main(String[] args) {
    car obj = new car();
    obj.honk();
    obj.displayDetails();
  }
  
}
