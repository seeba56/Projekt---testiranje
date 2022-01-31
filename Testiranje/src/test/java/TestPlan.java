import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Log in test")
    public static void LogInTest(){
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        webForm.pressLoginButton();
        webForm.EnterLoginUsername();
        webForm.EnterLoginPassword();
        webForm.pressLoginFinalButton();
    }

    @Test(testName = "Sign up Test")
    public static void SignUpTest(){
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        webForm.pressSignupButton();
        webForm.EnterSignupUsername();
        webForm.EnterSignupPassword();
        webForm.pressSignupFinalButton();
    }

    @Test(testName = "Home button press Test")
    public static void Home_button_press(){
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        webForm.pressHomeButton();
    }

    @Test(testName = "Add to cart Test")
    public static void AddToCart(){
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        webForm.pressLaptopCategorie();
        webForm.pressSonyVaio();
        webForm.pressAddToCart();
    }

    @Test(testName = "Next page and click on item Test")
    public static void NextAndClick(){
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        webForm.pressNextPage();
        webForm.pressSamsung();
    }





    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}