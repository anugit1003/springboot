import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@EnableAutoConfiguration
public class MyApplication {

  private static final Logger logger = LoggerFactory.getLogger(MyApplication.class);
  public static void main(String[] args) {
    
   logger.info("Anu testing"); 
  SpringApplication.run(MyApplication.class, args);
  }

  @RequestMapping("/home")
  String home() {
  return "Testing Anuradha's wonderful this Spring application!";
  }
}