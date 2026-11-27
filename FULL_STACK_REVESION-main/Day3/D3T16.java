package Day3;
class StudentDetails{
  String details="Saran,22,java,85";
  String[] arr=details.split(",");
}
public class D3T16 {
  public static void main(String[] args) {
    StudentDetails obj = new StudentDetails();
    System.out.println("name: "+obj.arr[0]);
    System.out.println("Age: "+obj.arr[1]);
    System.out.println("Course: "+obj.arr[2]);
    System.out.println("marks: "+obj.arr[3]);
  }
  
}
