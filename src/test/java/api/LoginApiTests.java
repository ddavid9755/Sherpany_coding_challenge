package api;

import helper.ConfigFileReader;
import helper.TranslationFileReader;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;
import org.json.simple.JSONObject;

public class LoginApiTests {
    @Test
    public static void getGermanTranslation() throws Exception{
        ConfigFileReader configFileReader = new ConfigFileReader();
        TranslationFileReader translationFileReader = new TranslationFileReader();
        Response response = get("https://dev-qa-challenge.dev.sherpany.io/static/locales/de-CH/translations.json");
        String actualGermanJsonResponse = response.asString();
        String expectedGermanJsonResponse = translationFileReader.fileReader(configFileReader.getGermanTranslationFilepath());
        int statusCode = response.getStatusCode();
        assertEquals(actualGermanJsonResponse, expectedGermanJsonResponse);
        assertEquals(statusCode, 200);
    }

    @Test
    public static void getFrenchTranslation() throws Exception{
        ConfigFileReader configFileReader = new ConfigFileReader();
        TranslationFileReader translationFileReader = new TranslationFileReader();
        Response response = get("https://dev-qa-challenge.dev.sherpany.io/static/locales/fr-FR/translations.json");
        String actualFrenchJsonResponse = response.asString();
        String expectedFrenchJsonResponse = translationFileReader.fileReader(configFileReader.getFrenchTranslationFilepath());
        int statusCode = response.getStatusCode();
        assertEquals(actualFrenchJsonResponse, expectedFrenchJsonResponse);
        assertEquals(statusCode, 200);
    }

    @Test
    public static void getItalianTranslation() throws Exception{
        ConfigFileReader configFileReader = new ConfigFileReader();
        TranslationFileReader translationFileReader = new TranslationFileReader();
        Response response = get("https://dev-qa-challenge.dev.sherpany.io/static/locales/it-IT/translations.json");
        String actualItalianJsonResponse = response.asString();
        String expectedItalianJsonResponse = translationFileReader.fileReader(configFileReader.getItalianTranslationFilepath());
        int statusCode = response.getStatusCode();
        assertEquals(actualItalianJsonResponse, expectedItalianJsonResponse);
        assertEquals(statusCode, 200);
    }

    @Test
    public static void postForgotPasswordWithInvalidEmail(){
        RestAssured.baseURI = "https://dev-qa-challenge.dev.sherpany.io";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", "123");
        request.header("Content-Type", "application/json");
        request.body(requestParams.toJSONString());
        Response response = request.post("/api/authenticate/password_reset/init/");
        assertEquals(response.statusCode(), 400);
    }

    @Test
    public static void postForgotPasswordWithValidEmail(){
        RestAssured.baseURI = "https://dev-qa-challenge.dev.sherpany.io";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", "123@123.com");
        request.header("Content-Type", "application/json");
        request.body(requestParams.toJSONString());
        Response response = request.post("/api/authenticate/password_reset/init/");
        assertEquals(response.statusCode(), 200);
    }

    @Test
    public static void postForgotPasswordEmptyEmail(){
        RestAssured.baseURI = "https://dev-qa-challenge.dev.sherpany.io";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("email", "");
        request.header("Content-Type", "application/json");
        request.body(requestParams.toJSONString());
        Response response = request.post("/api/authenticate/password_reset/init/");
        assertEquals(response.statusCode(), 400);
    }
}
