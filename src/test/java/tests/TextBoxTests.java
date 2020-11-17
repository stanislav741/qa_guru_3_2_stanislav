package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").val("Alex");
        $("#userEmail").val("alex@test.com");
        $("#currentAddress").val("Ulitsa Shorsa");
        $("#permanentAddress").val("Jekaterinburg);
        System.out.printf("");
    }
}
