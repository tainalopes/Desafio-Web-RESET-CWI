package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {

    public WebElement search_query_top;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button") //por class name demorava demais pra carregar, por isso foi usado xpath
    public WebElement submit_search;

    @FindBy(className = "login")
    public WebElement login;

    @FindBy(id = "email_create")
    public WebElement email_create;

    @FindBy(id = "SubmitCreate")
    public WebElement btn_submit_create;
}
