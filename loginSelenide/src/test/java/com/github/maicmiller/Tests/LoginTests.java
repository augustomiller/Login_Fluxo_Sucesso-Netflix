package com.github.maicmiller.Tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.isChrome;

public class LoginTests {

    String userName = "******";
    String userPass = "******";

    /*
    * Cenário de ‘login’ com sucesso.
    * * Usar o seletor CSS pelo ID e Propriedade de um element;
    * * Preencher Formulário simples com Selenide;
    * * Clicar em botão;
    * * Validar conteúdo esperado na tela;
    * */
    @Test
    public void shouldSeeLoggedUser() {
        //Defino o navegador
        isChrome();
        //Acesso ha página principal
        open("https://www.netflix.com/br/");
        $(byText("Entrar")).click();

        //Preencho o formulário
        $("#id_userLoginId").setValue(userName);
        $("#id_password").setValue(userPass);

        //Submeto o formulário
        $("button[data-uia=login-submit-button]").click();

        // Valida área logada de GERENCIAR PERFIS - $(".profile-gate-label");
        $(".profile-gate-label").shouldHave(text("Quem está assistindo?"));

    }
}
