class Employeeee{
  int id ;
  String name;
  String department="general";
  Employeeee(int id , String name){
    this.id=id;
    this.name=name;
  }
  Employeeee(int id ,String name,String department){
    this.id=id;
    this.name=name;
    this.department=department;

  }
  void displayEmployement(){
    System.out.println("name:"+name+" id:"+id+" department:"+department);
  }
}
public class D2T20 {
  public static void main(String[] args) {
    Employeeee obj = new Employeeee(12, "anil");
    Employeeee obj1= new Employeeee(13,"kishore" , "cse");
    obj.displayEmployement();
    obj1.displayEmployement();
  }
  
}
