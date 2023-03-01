package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

@Log4j2
public class BookStorePage{

    public ArrayList getBookNamesUI() {
        open("books");
        ElementsCollection booksUI = $$(By.xpath("//div[@role='rowgroup']//a"));
        ArrayList<String> bookNamesUI = new ArrayList<String>();
        for (SelenideElement i : booksUI) {
            bookNamesUI.add(i.getText());
        }
        return bookNamesUI;
    }
}
