package pageObjetcs;

import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Browser;

import javax.swing.*;

public class BasePage extends Browser {
    @Story("Criada a clase de mouse over para clicar no More")
    public static void mouseOver(WebElement element){
        Actions action = new Actions((Browser.getCurrentDriver()));
        action.moveToElement(element).build().perform();
    }
}
