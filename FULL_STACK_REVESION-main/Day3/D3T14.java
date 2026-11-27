package Day3;
class WebsiteValidator{
  String url = "https://www.google.com";


}
public class D3T14 {
  public static void main(String[] args) {
    WebsiteValidator obj = new WebsiteValidator();
    if(obj.url.startsWith("https://")){
      System.out.println("secure Website URL");
    }else{
      System.out.println("Invalid Website Protocol");
    }
     if(obj.url.startsWith("http://")){
      System.out.println("secure Website URL");
    }else{
      System.out.println("Invalid Website Protocol");
    }
  }
  
}
