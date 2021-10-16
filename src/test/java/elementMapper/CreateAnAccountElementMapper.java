package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountElementMapper {

    @FindBy(className = "login")
    public WebElement login;

    @FindBy(id = "email_create")
    public WebElement email_create;

    @FindBy(id = "SubmitCreate")
    public WebElement btn_submit_create;

    @FindBy(id = "id_gender1")
    public WebElement click_id_gender_1;

    @FindBy(id = "customer_firstname")
    public WebElement customer_firstname;

    @FindBy(id = "customer_lastname")
    public WebElement customer_lastname;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "address1")
    public WebElement adress;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(css = "select#id_state.form-control option[value='5']")
    public WebElement select_state;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(css = "select#id_country.form-control option[value='21']")
    public WebElement select_country;

    @FindBy(id = "phone_mobile")
    public WebElement phone_mobile;

    @FindBy(id = "submitAccount")
    public WebElement submitAccount;
}
