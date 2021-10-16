package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageElementMapper {

    @FindBy(css = "ul[id='address_delivery'] li[class='address_address1 address_address2']")
    public WebElement correctly_address;

    @FindBy(css = "button[name='processAddress']")
    public WebElement btn_proceed_to_checkout_address;

    @FindBy(id = "cgv")
    public WebElement click_agree;

    @FindBy(name = "processCarrier")
    public WebElement btn_processCarrier;

    @FindBy(css = "a[title='Pay by bank wire']")
    public WebElement pay_by_bank_wire;

    @FindBy(css = "button[class='button btn btn-default button-medium']")
    public WebElement btn_confirm_my_order;
}

