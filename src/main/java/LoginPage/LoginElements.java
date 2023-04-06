package LoginPage;

import io.Ahmed.Gen.Gen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginElements {

    By signIn = By.linkText("Sign in");

    By emailTextBox = By.id("email");

    By passwordTextBox = By.id("passwd");

    By submitButton = By.id("SubmitLogin");

    By loginErrorMessage = By.xpath("//li[text()='Invalid email address.']");

    public WebElement clickSignInButton() {

        return Gen.findBy(signIn);
    }


    public WebElement enterEmail()   {
        Gen.waitToBeVisibleBy(emailTextBox, 5);
        return Gen.findBy(emailTextBox);
    }

    public WebElement enterPassword() {
        return Gen.findBy(passwordTextBox);
    }

    public WebElement clickSubmit() {

        return Gen.findBy(submitButton);
    }

    public String getLoginError() {
        Gen.waitToBeVisibleBy(loginErrorMessage, 5);
        return Gen.findBy(loginErrorMessage).getText();
    }


    public void loginForm(String username, String password) {
        // click on sign in
        Gen.click(clickSignInButton());

        //login action
        Gen.clearWrite(enterEmail(), username);
        Gen.clearWrite(enterPassword(), password);
        Gen.click(clickSubmit());
    }
}