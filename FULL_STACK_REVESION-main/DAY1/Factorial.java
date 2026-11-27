import java.util.Scanner;
public class Factorial {
  static int fact(int n){
      if(n<0) throw new IllegalArgumentException("Factorial is undefined for negative numbers");
      if(n==0 || n==1){
        return 1;
      }
      return n*fact(n-1);
    }
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
    System.out.println("ENter a number to know its factorial:");
    int num=sc.nextInt();
    System.out.println(fact(num));
    }

  }
  
}
