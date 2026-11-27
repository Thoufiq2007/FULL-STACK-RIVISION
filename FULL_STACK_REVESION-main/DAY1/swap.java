import java.util.Scanner;
class swap{
  public static void main(String[] args) {
    try (Scanner data=new Scanner(System.in)) {
    int num1=data.nextInt();
    int num2=data.nextInt();
    System.out.println("before swaping ");
    System.out.println(num1+"is num 1 ");
    System.out.println(num2+"is num 2");
    System.out.println("after swaping");
    int temp=num1;
    num1=num2;
    num2=temp;
    System.out.println(num1+" is number 1 ");
    System.out.println(num2+" is number 2");
    }
  }
}