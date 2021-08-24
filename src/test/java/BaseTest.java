import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.*;

public abstract class BaseTest {
    static Properties properties = new Properties();
    static String token;
    static String username;

     @BeforeAll
    static void  beforeAll() {
         enableLogginOfRequestAndResponceIfValidationFails();
         filters(new AllureRestAssured());
         getProperties();
         token = properties.getProperty("token");
         username = properties.getProperty("username");
     }

     private static void  getProperties(){
         try (InputStream output = new FileInputStream(name:"src/test/resources/application.properties")) {
             properties.load(output);
         }
         catch (IOException e){
             e.printStackTrace();
         }
     }
}

