interface Printable{
  void printDocument();
  
}
interface Scannable{
  void ScanDocument();
}
class SmartPrinter implements Printable,Scannable{
  public void printDocument(){
    System.out.println("Printing document...");
  }
  public void ScanDocument(){
    System.out.println("Scanning document...");
  }
}
public class D2T15 {
  public static void main(String[] args) {
    SmartPrinter obj=new SmartPrinter();
    obj.printDocument();
    obj.ScanDocument();
  }
  
}
