import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MyApplication {

  
  public static void main(String[] args) {
   System.out.println("Anu testing"); 
  SpringApplication.run(MyApplication.class, args);
  }

  @RequestMapping("/home")
  String home() {
  return "Testing Anuradha's wonderful this Spring application!";
  }
}