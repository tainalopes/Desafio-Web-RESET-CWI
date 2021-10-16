package testes;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjetcs.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

@Feature("Testes no site de e-commerce 'automationpractice' ")
public class SetupTest extends BaseTests {

    @Test
    @Story("Comparar se a url atual é igual a url base e abrindo o site")
    public void testOpeningBrowserAndLoadingPage() {
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl()));

    }

    @Test
    @Story("Fazer cadastro no site")
    public void testCreateAnAccount(){
        CreateAnAccount createAnAccount = new CreateAnAccount();
        createAnAccount.doNewAccount();

        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText()
                .contains("MY ACCOUNT"));
    }

    @Test
    @Story("Fazer login no site")
    public void testLogin(){

        LoginPage loginPage = new LoginPage();
        loginPage.doLogin();

        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText()
                .contains("MY ACCOUNT"));
    }

    @Test
    @Story("Iniciar um teste de pesquina na lupa do site")
    public void testSearch() {
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        String quest = "T-SHIRT";
        String questResultQtd = "1";
        home.doSearch(quest);

        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"", ""), quest);
        assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));
    }

    @Test
    @Story("Adicionar produto pesquisado ao carrinho")
    public void testAddProductToCart(){

        testSearch();

        SearchPage search = new SearchPage();
        TShirtPage tShirtPage = new TShirtPage();

        search.clickBtnMore();

        String name = "Faded Short Sleeve T-shirts";
        String price = "$16.51";
        assertEquals(tShirtPage.getTextProductName(), name);
        assertEquals(tShirtPage.getTextProductPrice(), price);

        tShirtPage.clickBtnAddToCart();
        tShirtPage.clickBtnProceedToChekoutModal();

        String summary = "SHOPPING-CART SUMMARY";
        assertThat(tShirtPage.getTextShoppingCartSummary(), CoreMatchers.containsString(summary));
        String totalPrice = "$18.51";
        assertEquals(search.getTextTotalPrice(), totalPrice);

        search.clickBtnProceedToCheckout();

    }

    @Test
    @Story("Proceder para efetuar a compra do produto")
    public void testCheckoutPage(){
        CheckoutPage checkoutPage = new CheckoutPage();

        testLogin();
        testAddProductToCart();
        String address = "E La Palma Ave 3321";
        assertEquals(checkoutPage.getTextCorrectlyAddress(), address);

        checkoutPage.btnProceedToCheckoutForShipping();
        checkoutPage.clickAgree();
        checkoutPage.clickBtnProceed();
        checkoutPage.clickPayByBankWire();
        checkoutPage.clickBtnConfirmMyOrder();

    }
}
