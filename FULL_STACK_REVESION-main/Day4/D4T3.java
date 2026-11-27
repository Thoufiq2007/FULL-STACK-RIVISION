package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class D4T3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> name=new ArrayList<>();
    ArrayList<String> attendence=new ArrayList<>();
    name.add("kishore");
    attendence.add("present");
    name.add("anil");
    attendence.add("present");
    name.add("varma");
    attendence.add("present");
    name.add("ajay");
    attendence.add("absent");
    name.add("sunil");
    attendence.add("present");

    for(int i=name.size()-1;i>=0;i--){
      if(attendence.get(i).equals("absent")){
        name.remove(i);
        attendence.remove(i);
      }
    }

    System.out.println("Attendence List");
    for(int i =0;i<name.size();i++){
      System.out.println(name.get(i)+" : "+attendence.get(i));
    }

    System.out.println("enter a name to know present or not:");
    String nameString=sc.nextLine();
     
    for(int i=0;i<name.size();i++){
      if(name.get(i).equals(nameString)){
        System.out.println(attendence.get(i));
        break;
      }else{
        System.out.println("Student not found");
      }
    }

    System.out.println("total attendense:"+attendence.size());
    
    int temp=name.size();
    for(int i =temp-1;i>=0;i--){
      System.out.println(name.get(i)+" : "+attendence.get(i));
    }
    
  }
  
}
