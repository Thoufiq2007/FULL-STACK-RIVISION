package Day3;

public class TryCatch {
  public static void main(String[] args) {
    int a =10;
    int b=0;
    try{
      int c=a/b;
      System.out.println(c);
    }catch(Exception e){
      System.out.println("cant devide with zero"+e);
    }
    String name=getStringValue();
    try{
      System.out.println(name.length());
    }catch(NullPointerException e){
      System.out.println("null please give a value for the string"+e);
    }
    int [] arr=new int[3];
    try{
      for(int i=0;i<20;i++){
        arr[i]=22;
      }

    }catch(Exception e){
      System.out.println("arry index error "+e);
    }

    String name1="kishore";
    try{
      System.out.println(name1.charAt(99));
    }catch(StringIndexOutOfBoundsException e){
      System.out.println("string index not found"+e);
    }

    String num="ki";
    try{
    int nums=Integer.parseInt(num);
    System.out.println(nums);
    }catch(Exception e){
      System.out.println("number coversion error "+num);
    }
    finally{
      System.out.println("finally....");
    }

  }

  private static String getStringValue() {
    return null;
  }
}
