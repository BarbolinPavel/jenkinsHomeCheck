package home.project.test;

import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class JenkinsHomeCheck extends TestBase{

    @Test
    @DisplayName("test")
    void gazetaTest(){
        step("Open main page",() ->{
            open("");
        });

        step("Check logo gazeta", ()->{
            $(By.tagName("img src='https://static.gazeta.ru/nm2021/img/logo_2021.svg'")).exists();
        });

        step("Check navigation gazeta", ()->{
            $(".b_nav").shouldHave(text("Новости спорт"));
        });
    }
}
