import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String Username = "Username";
    private final String Password = "Password";

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement home_btn;

    @FindBy(id = "login2")
    private WebElement login_btn;
    @FindBy(id = "loginusername")
    private WebElement login_username;
    @FindBy(id = "loginpassword")
    private WebElement login_password;
    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    private WebElement login_final_btn;

    @FindBy(id = "signin2")
    private WebElement signup_btn;
    @FindBy(id = "sign-username")
    private WebElement signup_username;
    @FindBy(id = "sign-password")
    private WebElement signup_password;
    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    private WebElement signup_final_btn;


    @FindBy(xpath = "//*[@id=\"next2\"]")
    private WebElement Next_page;
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    private WebElement Samsung_phone;

    @FindBy(xpath = "//*[@id=\"itemc\"]")
    private WebElement Laptop_categorie;
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    private WebElement Sony_vaio_laptop;
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    private WebElement add_to_cart_btn;


    public WebForm(WebDriver driver) {
        super(driver);
    }


    public void EnterLoginUsername(){
        this.login_username.sendKeys(Username);
    }
    public void EnterLoginPassword(){
        this.login_password.sendKeys(Password);
    }
    public void pressLoginButton(){
        this.login_btn.click();
    }
    public void pressLoginFinalButton(){
        this.login_final_btn.click();
    }


    public void EnterSignupUsername(){
        this.signup_username.sendKeys(Username);
    }
    public void EnterSignupPassword(){
        this.signup_password.sendKeys(Password);
    }
    public void pressSignupButton(){
        this.signup_btn.click();
    }
    public void pressSignupFinalButton(){
        this.signup_final_btn.click();
    }


    public void pressHomeButton(){
        this.home_btn.click();
    }


    public void pressLaptopCategorie(){
        this.Laptop_categorie.click();
    }
    public void pressSonyVaio(){
        this.Sony_vaio_laptop.click();
    }
    public void pressAddToCart(){
        this.add_to_cart_btn.click();
    }


    public void pressNextPage(){
        this.Next_page.click();
    }
    public void pressSamsung(){
        this.Samsung_phone.click();
    }



}