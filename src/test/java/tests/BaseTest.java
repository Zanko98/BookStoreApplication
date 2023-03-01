package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import pages.BookStorePage;
import pages.LoginPage;

@Listeners(TestListener.class)
public class BaseTest {

    LoginPage loginPage;
    BookStorePage bookStorePage;

    @BeforeMethod
    public void setUp() {
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.headless = true;
        Configuration.clickViaJs = true;

        loginPage = new LoginPage();
        bookStorePage = new BookStorePage();
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        Selenide.closeWebDriver();
    }
}
