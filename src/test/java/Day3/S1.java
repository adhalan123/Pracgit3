package Day3;

import org.openqa.selenium.WebDriver;

public class S1 {

    private WebDriver driver;

    private S1(WebDriver driver){

        this.driver=driver;
    }

    public WebDriver getDriver(){

        return driver;
    }
}
