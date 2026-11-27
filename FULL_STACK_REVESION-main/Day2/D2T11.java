abstract class Employeeeee{
  String name;
  Employeeeee(String name){
    this.name="kishore";
  }
  void showName(){
    System.out.println("Employee: " + name);
  }
  abstract void  calculateSalary();
}
class FullTimeEmployee extends Employeeeee{
double monthlySalary=998.9;
FullTimeEmployee(){
    super("kishore");
  }
@Override
  void calculateSalary() {
  System.out.println("Monthly Salary: ₹" + monthlySalary);
  
}
}
public class D2T11 {
  public static void main(String[] args) {
    FullTimeEmployee obj = new FullTimeEmployee();
    obj.showName();
    obj.calculateSalary();
  }
  
}
