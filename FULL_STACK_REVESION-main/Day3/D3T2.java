package Day3;
class StudentName{
  String name="Saran Velmurugan";
  
    void display(){
for(int i=0;i<name.length()-1;i++){
      System.out.println(name.charAt(i));
    }
    System.out.println(name.charAt(0));
    System.out.println(name.charAt(name.length()-1));
    System.out.println(name.charAt(5));
    }
}
public class D3T2{
public static void main(String[] args) {
  StudentName obj = new StudentName();
  obj.display();
}
}