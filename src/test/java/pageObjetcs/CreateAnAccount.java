package pageObjetcs;

import elementMapper.CreateAnAccountElementMapper;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreateAnAccount extends CreateAnAccountElementMapper {
    public CreateAnAccount(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Clica no botão login e é direcionado para a página de cadastro/login")
    public void clickBtnLogin(){
        login.click();
    }

    @Step("Preenche o email")
    public void fillEmail(){
        email_create.sendKeys("hayaomiyazaki@gmail.com");
    }

    @Step("Clica em submeter")
    public void clickBtnSubmitCreate(){

        btn_submit_create.click();
    }

    @Step("Clica na escolha de gênero")
    public void clickIdGender(){
        click_id_gender_1.click();
    }

    @Step("Preenche o nome")
    public void fillFirstName(){
        customer_firstname.sendKeys("Hayao");
    }

    @Step("Preenche o sobrenome")
    public void fillLastName(){
        customer_lastname.sendKeys("Miyazaki");
    }

    @Step("Preenche a senha")
    public void fillPassword(){
        password.sendKeys("darksouls123eldenring");
    }

    @Step("Preenche o endereço")
    public void fillAdress(){
        adress.sendKeys("E La Palma Ave 3321");
    }

    @Step("Preenche a cidade")
    public void fillCity(){
        city.sendKeys("Anaheim");
    }

    @Step("Escolhe o estado")
    public void selectState(){
        select_state.click();
    }

    @Step("Preenche o código postal")
    public void fillPostcode(){
        postcode.sendKeys("92806");
    }

    @Step("Escolhe o país")
    public void selectCountry(){
        select_country.click();
    }

    @Step("Preenche o número de celular")
    public void fillPhoneMobile(){
        phone_mobile.sendKeys("5121012022");
    }

    @Step("Clica em registrar")
    public void clickRegister(){
        submitAccount.click();
    }

    @Story("Método que contém todos os métodos para a criação do cadastro")
    public void doNewAccount(){
        clickBtnLogin();
        fillEmail();
        clickBtnSubmitCreate();
        clickIdGender();
        fillFirstName();
        fillLastName();
        fillPassword();
        fillAdress();
        fillCity();
        selectCountry();
        selectState();
        fillPostcode();
        fillPhoneMobile();
        clickRegister();
    }
}

