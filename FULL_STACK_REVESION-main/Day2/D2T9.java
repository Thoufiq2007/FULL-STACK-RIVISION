abstract class Animal{
  abstract void  makeSound();
void sleep(){
  System.out.println("Animal is sleeping");
}
}
class PolymorphicDog extends Animal{
  void makeSound(){
    System.out.println("Dog barks: Woof! Woof!");
  }
}
public class D2T9 {
  public static void main(String[] args) {
    PolymorphicDog obj = new PolymorphicDog();
    obj.makeSound();
    obj.sleep();
  }
  
}
