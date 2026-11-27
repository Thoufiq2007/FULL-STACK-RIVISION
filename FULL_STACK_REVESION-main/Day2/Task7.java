class SalaryEmployee{
  double baseSalary;
  double calculateSalary(){
    return baseSalary;
  }
}
class SalesEmployee extends SalaryEmployee{
  double bonus;
  double calculateSalary(){
    return super.calculateSalary() + bonus;
  }
}
public class Task7 {
  public static void main(String[] args) {
    SalesEmployee obj = new SalesEmployee();
    obj.baseSalary=3333.3;
    obj.bonus=8734.3;
    System.out.println(obj.calculateSalary());
  }
  
}
