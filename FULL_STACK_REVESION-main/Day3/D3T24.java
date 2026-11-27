package Day3;

import java.util.Scanner;

class TicketBooking{
  String passageName="Rahul";

}
public class D3T24 {
  public static void main(String[] args) {
    Scanner data = new Scanner(System.in);
    TicketBooking obj = new TicketBooking();
    int num=data.nextInt();
    try{
      System.out.println(obj.passageName.charAt(num));

    }catch(StringIndexOutOfBoundsException e){
      System.out.println("please check something went wrong "+e);
    }
    data.close();
  }
  
}
