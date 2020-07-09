package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage{
    WebDriverWait wait;

    @FindBy(xpath = "//*[@class = 'HeaderMenu-link no-underline mr-3']")
    private WebElement signIn;
    @FindBy(id = "login_field")
    private WebElement loginField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy (xpath = "//*[@class = 'btn btn-primary btn-block']")
    private WebElement signInButton;

    public LoginPage goToSignInPage(){
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class = 'HeaderMenu-link no-underline mr-3']")));
        signIn.click();
        return new LoginPage();
    }

    public LoginPage enterLoginName(){
        loginField.sendKeys("Aksana-Rachytskaya1");
        return new LoginPage();
    }

    public LoginPage enterPassword(){
        passwordField.sendKeys("Aa1416100Aa");
        return new LoginPage();
    }

    public LoginPage clickOnSignInButton(){
        signInButton.click();
        return new LoginPage();
    }
}
