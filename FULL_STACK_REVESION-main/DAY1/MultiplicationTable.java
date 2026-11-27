import java.util.Scanner;
public class MultiplicationTable {
  public static void main(String[] args) {
    try (Scanner data = new Scanner(System.in)) {
    int num=data.nextInt();
    System.out.println("THE MULTIPLICATION TABLE of :"+num);
    for(int i =1;i<=10;i++){
      System.out.println(num +" x "+i+" = "+num*i);
    }
    }
  }
}
