package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BookStorePage;
import pages.LoginPage;

public class BaseTest {

    LoginPage loginPage;
    BookStorePage bookStorePage;

    @BeforeMethod
    public void setUp() {
        Configuration.timeout = 10000;
        //Configuration.headless = true;

        loginPage = new LoginPage();
        bookStorePage = new BookStorePage();
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        Selenide.closeWebDriver();
    }
}
