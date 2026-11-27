import  java.util.Scanner;
class Calculator{
  public static void main(String[] args) {
    try (Scanner sc=new Scanner(System.in)) {
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    String str=sc.next();
    char operator=str.charAt(0);
    switch (operator){
      case '+' :
      System.out.println(num1+num2);
      break;
      case '-' :
      System.out.println(num1-num2);
      break;
      case '*' :
      System.out.println(num1*num2);
      break;
      case '/' :
      System.out.println(num1/num2);
      break;
    }
    }

  }
}