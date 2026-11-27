class Car{
  String brand;
  int year;
    Car(){
    brand ="toyota";
    year=2024;
  }
  void displayDetails(){
    System.out.println("brand:"+brand+" year: "+year);
  }
}
public class D2T17 {
  public static void main(String[] args) {
    Car obj =new Car();
    obj.displayDetails();
  }
  
}
