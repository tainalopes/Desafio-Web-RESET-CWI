package pageObjetcs;

import elementMapper.TShirtPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class TShirtPage extends TShirtPageElementMapper {

    public TShirtPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Compara se o nome na página é o nome correto do produto")
    public String getTextProductName(){
        return product_name.getText();
    }

    @Step("Compara se o preço na página é o preço correto do produto")
    public String getTextProductPrice(){
        return product_price.getText();
    }

    @Step("Clica no botão adicionar ao carrinho")
    public void clickBtnAddToCart(){
        btn_add_to_cart.click();
    }

    @Step("Clica no botão do modal para proceder")
    public void clickBtnProceedToChekoutModal(){
        btn_proceed_to_checkout_modal.click();
    }

    @Step("Verifica se está na página de resumo do carrinho de compras")
    public String getTextShoppingCartSummary(){
        return shopping_cart_summary.getText();
    }
}
