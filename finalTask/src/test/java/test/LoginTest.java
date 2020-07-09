package test;

import object.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void browserSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginTest(){
        //LoginPage page = new LoginPage();
        driver.get("https://github.com/");
        new LoginPage().goToSignInPage().
                enterLoginName().
                enterPassword().
                clickOnSignInButton();
        //Assert.assertTrue();
   }
}
