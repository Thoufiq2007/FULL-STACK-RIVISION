class ConstructorStudent{
  String name;
  double marks;
  ConstructorStudent(String name,double marks){
    this.name=name;
    this.marks=marks;
  }
  void showResult(){
    System.out.println("name:"+name+" marks:"+marks);
  }
}
public class D2T18 {
  public static void main(String[] args) {
    ConstructorStudent obj=new ConstructorStudent("kishore",99);
    obj.showResult();
  }
  
}
