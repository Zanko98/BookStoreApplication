package pages;

import com.codeborne.selenide.Selenide;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class LoginPage{

    public void open() {
        Selenide.open("login");
    }

    public void login(String userName, String password) {
        log.info("Log in with User Name: {}", userName);
        $("#userName").sendKeys(userName);
        $("#password").sendKeys(password);
        $("#login").click();

    }

    public String getErrorMessage() {
        return $("#name").getText();
    }
}
