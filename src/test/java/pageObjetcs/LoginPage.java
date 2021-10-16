package pageObjetcs;

import elementMapper.LoginPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){

        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    @Step("Clicou no botão login e foi direcionado para a página de login")
    public void clickBtnLogin(){
        login.click();
    }

    @Step("Preencheu o email")
    public void fillEmail(){
        email.sendKeys("hayao_miyazaki@gmail.com");
    }
    @Step("Preencheu a senha")
    public void fillPasswd(){
        passwd.sendKeys("darksouls123eldenring");
    }

    @Step("Clicou no botão de submeter o login")
    public void clickBtnSubmitLogin(){
        SubmitLogin.click();
    }

    @Step("todos os métodos juntos para efetuar o login")
    public void doLogin(){
        clickBtnLogin();
        fillEmail();
        fillPasswd();
        clickBtnSubmitLogin();
    }
}
