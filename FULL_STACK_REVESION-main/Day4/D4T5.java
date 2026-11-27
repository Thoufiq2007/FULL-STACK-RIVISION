package Day4;

import java.util.LinkedList;
import java.util.Scanner;

public class D4T5 {
  public static void main(String[] args) {
    LinkedList<String> visited=new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    String str="";
    do{
      System.out.println("Enter visited url: or enter exit to exit from this menu:");
      str = sc.nextLine();
      if(str.equals("exit"))break;
      visited.add(str);
    }while(!str.equals(true));

    for(String k:visited){
      System.out.println("visited websites: "+k);
    }

    visited.removeLast();
    System.out.println(visited);

    System.out.println("First visited"+visited.getFirst());
    System.out.println("last visited:"+visited.getLast());
    System.out.println("enter website to check visited or not:");
    String url=sc.nextLine();
    if(visited.contains(url)){
      System.out.println("website is visited");
    }else {
     System.out.println(" website is not visited");
    }

    visited.clear();

    System.out.println("After clearing:");
    System.out.println(visited);

  }


  
}
