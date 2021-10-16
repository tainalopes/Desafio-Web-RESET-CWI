package pageObjetcs;

import elementMapper.HomePageElementMapper;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage() {

        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Clicou no botão de pesquisa")
    public void clickSearch_query_top(){
        search_query_top.click();
    }

    @Step("Enviou o que foi escrito na pesquisa")
    public void sendKeysSearch_query_top(String keys){
        search_query_top.sendKeys(keys);
    }

    @Step("Clicou no botão de pesquisa")
    public  void clickSubmit_search(){
        submit_search.click();
    }

    @Story("método que unifica todos os métodos acima, assim chamamos apenas ele e não todos acima ;)")
    public void doSearch(String quest){
        clickSearch_query_top();
        sendKeysSearch_query_top(quest);
        clickSubmit_search();
    }
}
