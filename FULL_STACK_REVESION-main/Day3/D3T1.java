package Day3;

public class D3T1 {
  public static void main(String[] args) {
    String name="C S Kishore Royal";
    String name2="dinesh";
    System.out.println(name.length());
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name.length());
    for(int i=0;i<name.length()-1;i++){
      System.out.println(name.charAt(i));
    }
    System.out.println(name==name2);
    
  }
  
}
