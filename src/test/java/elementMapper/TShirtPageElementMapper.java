package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TShirtPageElementMapper{

    @FindBy(css = "h1[itemprop='name']")
    public WebElement product_name;

    @FindBy(id = "our_price_display")
    public WebElement product_price;

    @FindBy(css = "button[name='Submit']")
    public WebElement btn_add_to_cart;

    @FindBy(css = "a[title='Proceed to checkout']")
    public WebElement btn_proceed_to_checkout_modal;

    @FindBy(css = "#cart_title")
    public WebElement shopping_cart_summary;
}
