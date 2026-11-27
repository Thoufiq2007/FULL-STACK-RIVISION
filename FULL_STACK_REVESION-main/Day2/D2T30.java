class Course{
  String courseName;
  int duration;
  double fee;
   Course(String courseName, int duration, double fee){
    this.courseName=courseName;
    this.duration=duration;
    this.fee=fee;
   }
   void diaplay(){
  System.out.println("course name:"+courseName);
  System.out.println("course duration:"+duration);
  System.out.println("course fee:"+fee);
}
}
public class D2T30 {
  public static void main(String[] args) {
    Course obj=new Course("java", 12, 3000);
    Course obj1=new Course("python",13,400);
    obj.diaplay();
    System.out.println();
    obj1.diaplay();
  }
  
}
