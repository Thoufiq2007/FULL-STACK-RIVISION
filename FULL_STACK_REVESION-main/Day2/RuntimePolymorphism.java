
  class RuntimeCalculator{
  int add(int a , int b){
    return a+b;
  }
}
class Maths extends RuntimeCalculator{
  @Override 
  int add(int a, int b){
    System.out.println("anil");
    return a+b;
  }
}
public class RuntimePolymorphism {
  public static void main(String[] args) {
    RuntimeCalculator obj = new RuntimeCalculator();
    System.out.println(obj.add(2,2));
  
  }
}

