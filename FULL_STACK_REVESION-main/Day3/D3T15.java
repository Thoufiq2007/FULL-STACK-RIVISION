package Day3;
class FileEvalidator{
  String fileName="student_report.pdf";

}
public class D3T15 {
  public static void main(String[] args) {
    FileEvalidator obj = new FileEvalidator();
    if(obj.fileName.endsWith(".pdf")){
      System.out.println("PDF file");
    }
     if(obj.fileName.endsWith(".jpg")){
      System.out.println("JPG file");
    }
     if(obj.fileName.endsWith(".docx")){
      System.out.println("DOCX file");
    }
   
  }
  
}
