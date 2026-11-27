package Day3;
class EmployeeSalary{
  void setSalary(double salary){
    if(salary<=0){
      throw new  IllegalArgumentException("salary must be grater than zero");
    }else{
      System.out.println("Emploee Salary:"+salary);
    }
  }
}
public class D3T26 {
  public static void main(String[] args) {
    EmployeeSalary obj = new EmployeeSalary();
    obj.setSalary(25000);
    obj.setSalary(50000);
    obj.setSalary(0);
    obj.setSalary(-1000);
  }
}
