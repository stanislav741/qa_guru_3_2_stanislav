package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");

        $("#userName").val("Alex");
        $("#userEmail").val("alex@test.com");
        $("#currentAddress").val("Ulitsa Shorsa");
        $("#permanentAddress").val("Jekaterinburg");
        $("#submit").click();

        $("#output").shouldHave(text("Name:Alex\n" +
                "Email:alex@test.com\n" +
                "Current Address :Ulitsa Shorsa\n" +
                "Permananet Address :Jekaterinburg"));

        System.out.printf("");
    }

    @Test
    void wrongEmailTest() {
            open("https://demoqa.com/text-box");

            $("#userName").val("Alex");
            $("#userEmail").val("Egorov");
            $("#currentAddress").val("Ulitsa Shorsa");
            $("#permanentAddress").val("Jekaterinburg");
            $("#submit").click();

            $("#userEmail").shouldHave(cssClass("field-error"));

            System.out.printf("");
    }
}
