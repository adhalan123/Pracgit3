import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Day6 {

    public static void main(String[]args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://practice.expandtesting.com");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        WebElement element = driver.findElement(By.xpath("//a[text()='Dropdown List']/ancestor::div[@class='card-body']/following-sibling::div//a[text()='Try it out']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",element);

        //note: here we handling selector dropdown

        WebElement drp= driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select sc= new Select(drp);

        System.out.println(sc.getOptions().get(1).getText());

       List<WebElement> ls=sc.getOptions();

       for(WebElement e:ls){

           System.out.println(e.getText());

       }

       sc.selectByVisibleText("Option 1");


        }
    }

