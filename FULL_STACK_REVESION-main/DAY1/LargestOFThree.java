import java.util.Scanner;
public class LargestOFThree {
  public static void main(String[] args) {
    try (Scanner data=new Scanner(System.in)) {
    System.out.println("enter three numbers one by one to check grater number among three");
    int num1=data.nextInt();
    int num2=data.nextInt();
    int num3=data.nextInt();
    if(num1>num2 && num1>num3)
      System.out.println(num1+" is grater");
    else if(num2>num3){
      System.out.println(num2+" is grater");
    }else{
      System.out.println(num3+" is grater");
    }
    }
  }
  
}
