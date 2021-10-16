package testes;

import io.qameta.allure.Step;
import org.junit.After;
import org.junit.Before;
import utils.Browser;
import utils.Utils;

public class BaseTests {

    @Before
    @Step("abre o navegador e insere a url que está lá no utils")
    public void setup(){
        Browser.loadPage(Utils.getBaseUrl());
    }

    @After
    @Step("Fecha o navegador")
    public void tearDown(){
        Browser.print(); //tira o print antes de fechar o navegador
        Browser.close();
    }
}