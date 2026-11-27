package Day3;
import java.util.Scanner;
class StudentRegistration{
  String studentName;
  int age;
  String marks;
  String[] subjects={"java" , "python","css","html"};

}
public class D3T30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StudentRegistration obj = new StudentRegistration();
    obj.studentName=sc.nextLine();
    obj.age=sc.nextInt();
    sc.next();
    obj.marks=sc.nextLine();
    if(obj.studentName.equals(null)){
      try{
      System.out.println(obj.studentName.length());
      }catch(NullPointerException e){
        System.out.println(e);
      }
    }
    try{
      int mark=Integer.parseInt(obj.marks);
    }catch (NumberFormatException e){
      System.out.println(e);
    }
    System.out.println("Enter a number to print subject:");
    int num=sc.nextInt();
    try{
      System.out.println(obj.subjects[num]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
    if (obj.age<=0){
      throw new IllegalArgumentException("age should be grater than zero");
    }
    System.out.println("Student Registration Completed");

    
    

  }
}
