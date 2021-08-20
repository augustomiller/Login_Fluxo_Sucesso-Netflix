package com.github.maicmiller.Tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.isChrome;

public class LoginTests {

    String userName = "*******";
    String userPass = "*******";

    @Test
    public void shouldSeeLoggedUser(){
        isChrome();
        open("https://www.netflix.com/br/");

        $(byText("Entrar")).click();

        $("#id_userLoginId").setValue(userName);
        $("#id_password").setValue(userPass);
        $(byText("Sign In")).click();

        //Validar página Users/Kids

    }

}
