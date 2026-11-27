import java.util.Scanner;
class EvenOdd{
  public static void main(String[] args) {
    try (Scanner data=new Scanner(System.in)) {
    System.out.println("eneter a numbet to know even or odd :");
    int num=data.nextInt();
    String result=num%2 ==0 ? "even number" : "odd number";
    System.out.println(result);
    }
  }
}