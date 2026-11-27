import java.util.Scanner;

class Student{

  private int StudentID;
  private String name;
  private String department;
  private int[] marks=new int[5];
  public int total=0;
  public double average=0;

  Student(int StudentID,String name,String department,int marks[]){

    this.StudentID=StudentID;
    this.name=name;
    this.department=department;
    for (int i=0;i<marks.length;i++){
      this.marks[i]=marks[i];
    }
  }

  public void display(){
    System.out.println("===== STUDENT REPORT =====");
    System.out.println();
    System.out.println();
    System.out.println("Student ID   :"+StudentID);
    System.out.println("Name         :"+name);
    System.out.println("Department   :"+department);
  }
  public void eachSubjectResult(){
     for(int i =0;i<marks.length;i++){
   System.out.println("Subject "+(i+1)+" marks :"+marks[i]);
    if(marks[i]>=35){
      System.out.println(" PASS in subject :"+i);
    }
    else {
      System.out.println("FAIL in Subject :"+i);
    }
   }
  }
  public void totalMarks(){
    total=0;
    for(int k:marks){
      total +=k;
    }
    System.out.println("Total Marks : "+total);
  }

  public void AverageMarks(){
      average=(double)total/marks.length;
      System.out.println("Average     :"+average);
  }

  public void Grade(){
    switch((int)average/10){

      case 10,9 : 
      System.out.println("Grade      :A+");
      break;

      case 8 : 
      System.out.println("Grade      :A");
      break;

      case 7 : 
      System.out.println("Grade      :B");
      break;

      case 6 : 
      System.out.println("Grade      :C");
      break;
      
      case 5 : 
      System.out.println("Grade      :D");
      break;

      case 0,1,2,3,4:
        System.out.println("Grade    :F");
      break;
      default:System.out.println("Invalid Marks ");
    }
  }
    public void checkResult(){
  if(marks[0]>=35 && marks[1]>=35 && marks[2]>=35 && marks[3]>=35 && marks[4]>=35){
    System.out.println("Result     :PASS");
  }
  else{
    System.out.println("Result     :FAIL");
  }
}
      public void displayMarks() {

        System.out.println("===== STUDENT MARKS REPORT =====");

        eachSubjectResult();
        totalMarks();
        AverageMarks();
        Grade();
        checkResult();
    }

    public int getStudentID() {
      return StudentID;
    }


}
public class Main {
  public static void main(String[] args) {

    System.out.println("=====   STUDENT MANAGEMENT SYSTEM =====");

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter how many students need to add:");
    int studentsnum=sc.nextInt();
    int studentcount=studentsnum;
    Student[] students=new Student[studentsnum];
    for(int i=0;i<studentsnum;i++){

    System.out.println("Enter Student ID:");
    int id=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Student Name:");
    String name=sc.nextLine();
    System.out.println("Enter Department:");
    String dept=sc.nextLine();

    System.out.println("Enter Subject 1 Marks:");
    int s1=sc.nextInt();
    System.out.println("Enter Subject 2 Marks:");
    int s2=sc.nextInt();
    System.out.println("Enter Subject 3 Marks:");
    int s3=sc.nextInt();
    System.out.println("Enter Subject 4 Marks:");
    int s4=sc.nextInt();
    System.out.println("Enter Subject 5 Marks:");
    int s5=sc.nextInt();

    int mark[]={s1,s2,s3,s4,s5};
       students[i]= new Student(id,name,dept,mark);
       students[i].display();
       System.out.println("Student added successfully");
    }
  

   
   while(true){

   System.out.println("Enter a number to perform Action.");
   System.out.println("1:student details");
   System.out.println("2:Student marks ");
   System.out.println("3.Delete a student");
   System.out.println("4.exit");
   byte chooise=sc.nextByte();

    switch(chooise){

      case 1:{
        System.out.println("Enter Student ID:");
        int searchID = sc.nextInt();
        boolean found = false;
        for(int i=0; i<students.length; i++){
          if(students[i].getStudentID()==searchID){
            students[i].display();
            found=true;
            if (!found) {
             System.out.println("Student Not Found!");
            }
          }
            break;
        }
       break;
      }
      case 2:{
      System.out.println("Enter Student ID:");
      int searchID = sc.nextInt();
      boolean found = false;
       for (int i = 0; i < studentcount; i++) {
      if (students[i].getStudentID() == searchID) {
       students[i].displayMarks();
       found = true;
        break;
       }
       }
       if (!found) {
       System.out.println("Student Not Found!");
      }
      break;
    }
      case 3:{
      System.out.println("Enter Student ID to Delete:");
     int deleteID = sc.nextInt();
     int deleteIndex = -1;
     for (int i = 0; i < studentcount; i++) {
     if (students[i].getStudentID() == deleteID) {
     deleteIndex = i;
     break;
       }
     }

    if (deleteIndex != -1) {
     for (int i = deleteIndex; i < studentcount - 1; i++) {
      students[i] = students[i + 1];
     }
    students[studentcount - 1] = null;
    studentcount--;
   System.out.println("Student Deleted Successfully!");
    } else {
     System.out.println("Student Not Found!");
    }
   break;
    }
      case 4:
      System.out.println("Thank you for using my system!");
      sc.close();
      return;

      default: System.out.println("enter a valid number ");
    }
    if(chooise==4){
      break;
    }
   }
    sc.close();
  }
  
}
