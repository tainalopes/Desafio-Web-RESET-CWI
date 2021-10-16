package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementMapper {

    @FindBy(className = "login")
    public WebElement login;

    public WebElement email;
    public WebElement passwd;
    public WebElement SubmitLogin;
}
