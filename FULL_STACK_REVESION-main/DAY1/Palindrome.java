import java.util.Scanner;
public class Palindrome {
  public static void main(String[] args) {
    try (Scanner data=new Scanner(System.in)) {
    int num=data.nextInt();
    int original=num;
    int reverse=0;
    while(num>0){
      reverse=reverse*10+num%10;
      num/=10;
    }
    System.out.println(original==reverse ? "Palindrome Number" : "Not a Palindrome Number");
    }
  }
  
}
