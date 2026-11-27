class D2T29Mobile{
  String brand;
  double price;
  D2T29Mobile(){
    brand = "Samsung";
    price = 25000;
  }
  void displayDetails(){
    System.out.println("brand:"+brand  +" price:"+ price);
  }
}
public class D2T29 {
  public static void main(String[] args) {
    D2T29Mobile obj = new D2T29Mobile();
    obj.displayDetails();
  }
  
}
