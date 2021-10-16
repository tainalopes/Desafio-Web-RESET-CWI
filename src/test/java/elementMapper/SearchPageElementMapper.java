package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageElementMapper {

    @FindBy(className = "navigation_page")
    public WebElement navigation_page;

    @FindBy(className = "lighter")
    public WebElement lighter;

    @FindBy(className = "heading-counter")
    public WebElement heading_counter;

    @FindBy(css = ".product-container")
    public WebElement product;

    @FindBy(css = "a[title='View'] span")
    public WebElement click_btn_more;
    //.button[title='View']

    @FindBy(css = ".button.btn.btn-default.standard-checkout.button-medium")
    public WebElement btn_proceed_to_checkout;

    @FindBy(css = "td[class='cart_description'] p[class='product-name'] a")
    public WebElement product_name;

    @FindBy(id = "total_price")
    public WebElement total_price;
}
