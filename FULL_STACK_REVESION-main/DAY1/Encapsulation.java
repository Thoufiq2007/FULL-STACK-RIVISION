class EncapsulatedMobile{
  private String brand = "iq ";
  void  getter(){
    System.out.println(brand);
  }
  void setter(String s){
    brand=s;
  }

}
public class Encapsulation {
  public static void main(String[] args) {
    EncapsulatedMobile obj =new EncapsulatedMobile();
    obj.getter();
    obj.setter("samsung");
    obj.getter();
  }
  
}
