package pages;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

public class BasePage {

    @BeforeMethod
    public void setUp() {
        Configuration.baseUrl = "https://demoqa.com/";
    }
}
