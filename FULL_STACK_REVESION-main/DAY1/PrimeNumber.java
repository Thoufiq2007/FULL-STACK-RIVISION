import java.util.Scanner;
public class PrimeNumber {
  public static void main(String[] args) {
    try (Scanner data=new Scanner(System.in)) {
     boolean prime =false;
    System.out.println("Eneter a number to check it is prime number or not ");
    int num=data.nextInt();
    if(num<=1){
      System.out.println("not a prime number");
    }else{
     
      for(int i=2;i<Math.sqrt(num);i++){
        if(num%i==0){
          prime=true;
          break;

        }
      }
      }
      System.out.println(prime ? "not a prime number" : "prime number");
    }
  }
  
}
