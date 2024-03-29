package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver ;

    public HomePage (WebDriver driver ){
        this.driver = driver ;
    }

    public LoginPage clickFormAuthenticationLink (){
        clickLink("Form Authentication");
        return new LoginPage(driver);

    }

    public DropdownPage clickdropdownLink (){
        clickLink("Dropdown");
        return new DropdownPage (driver);

    }

    public DynamicLoadingPage clickDynamicLoadingLink(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }




    private  void  clickLink (String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }















}
