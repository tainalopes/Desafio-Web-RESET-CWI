package pageObjetcs;

import elementMapper.CheckoutPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CheckoutPage extends CheckoutPageElementMapper {
    public CheckoutPage(){

        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

//    @Step("Verificando se o está na página correta")
//    public String getTextAddressDelivery(){
//        return address_delivery.getText();
//    }

    @Step("Verificando se o endereço de entrega é o mesmo que o preenchido")
    public String getTextCorrectlyAddress(){
        return correctly_address.getText();
    }
    @Step("Clica no botão para prosseguir e ir para o envio")
    public void btnProceedToCheckoutForShipping(){
        btn_proceed_to_checkout_address.click();
    }

    @Step("Clica em concordar com os termos")
    public void clickAgree(){
        click_agree.click();
    }
    @Step("Clica no botão para proceder")
    public void clickBtnProceed(){
        btn_processCarrier.click();
    }
    @Step("Seleciona o pagamento via cartão")
    public void clickPayByBankWire(){
        pay_by_bank_wire.click();
    }
    @Step("Confirmar a compra")
    public void clickBtnConfirmMyOrder(){
        btn_confirm_my_order.click();
    }
}
