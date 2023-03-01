package tests;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;


public class LoginTest extends BaseTest {

    @Test()
    public void loginTest() {
        loginPage.open();
        loginPage.login("Marina", "!QAZ1qaz");
        $(By.xpath("//button[text()='Log out']")).shouldBe(Condition.visible);
        assertEquals($("#userName-value").getText(), "Marina", "failed to log in");
    }

    @Test()
    public void errorCheckingAtLogin() {
        loginPage.open();
        loginPage.login("Marina", "Marina");
        assertEquals(loginPage.getErrorMessage(), "Invalid username or password!", "incorrect error message");
    }
}
