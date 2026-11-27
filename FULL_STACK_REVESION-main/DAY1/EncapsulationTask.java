class EncapsulationStudent{
  private String name;
  private int roll_number;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getRoll_number() {
    return roll_number;
  }
  public void setRoll_number(int roll_number) {
    this.roll_number = roll_number;
  }
}
public class EncapsulationTask {
  public static void main(String[] args) {
    EncapsulationStudent obj = new EncapsulationStudent();
    obj.setName("kishoreee");
    obj.setRoll_number(9824387);
    System.out.println( obj.getName());
    System.out.println(obj.getRoll_number());
  }
  
}
