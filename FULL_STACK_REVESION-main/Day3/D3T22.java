package Day3;
class StudentProfile{
  String studentName=null;
  String valid="kishore";
 
}
public class D3T22 {
  public static void main(String[] args) {
    StudentProfile obj = new StudentProfile();
    try{
      System.out.println(obj.studentName.length());
    }catch(NullPointerException e){
      System.out.println("there is no name entered"+e);
    }
     try{
      System.out.println(obj.valid.length());
    }catch(NullPointerException e){
      System.out.println("there is no name entered"+e);
    }
  }
  
}
