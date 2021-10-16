package pageObjetcs;

import elementMapper.SearchPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import io.qameta.allure.Step;

public class SearchPage extends SearchPageElementMapper {

    public SearchPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Pega o texto da classe Navigation_page")
    public String getTextNavigation_page(){
        return navigation_page.getText();
    }

    @Step("Pega o texto da classe 'lighter' ")
    public String getTextLighter(){
        return lighter.getText();
    }

    @Step("Verifica se o contador de resultados da pesquisa está igual")
    public String getTextHeading_counter(){
        return heading_counter.getText();
    }

    @Step("Confirma que está na página de pesquisa usando a palavra search como parâmetro")
    public boolean isSearchPage(){
        return getTextNavigation_page().equals("Search");
    }

    @Step("Clicou no botão more da t-shirt")
    public void clickBtnMore(){
        BasePage.mouseOver(product);
        click_btn_more.click();
    }

    @Step("Clica no botão para proceder a compra")
    public void clickBtnProceedToCheckout(){
        btn_proceed_to_checkout.click();
    }

//    @Step("Compara se o nome do produto é o produto certo da compra")
//    public String getTextProductName(){
//        return product_name.getText();
//    }
//
    @Step("Compara se o valor total da compra está correto")
    public String getTextTotalPrice(){
        return total_price.getText();
    }
}
