package testclass;

import Listerns.TestListeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.logging.Logger;

@Listeners(TestListeners.class)
public class Test1 {

      WebDriver driver;

      @BeforeClass
      public void StartDriver(){

          driver= new ChromeDriver();

      }


      @Test
      public void loginTest(){
          driver.get("https://www.facebook.com/");
          String Title=driver.getTitle();
          System.out.println(Title);

          driver.navigate().to("https://www.instagram");
          System.out.println(driver.getTitle());



      }

      @AfterClass
    public void closeDriver(){

          driver.quit();
      }
}
