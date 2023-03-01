package tests;

import io.restassured.http.ContentType;
import org.apache.http.protocol.HTTP;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class BookStoreTest extends BaseTest {

    @Test
    public void checkListOfBooksUIAndAPIForCompliance() {
        given()
                .header(HTTP.CONTENT_TYPE, ContentType.JSON)
                .log().all()
        .when()
                .get("https://demoqa.com/BookStore/v1/Books")
        .then()
                .log().all()
                .statusCode(200)
                .body("books.title", equalTo(bookStorePage.getBookNamesUI()));
    }
}
