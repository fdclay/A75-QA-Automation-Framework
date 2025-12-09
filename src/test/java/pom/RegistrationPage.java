package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    By RegistrationErrorMsg = By.xpath("/html/body/div[1]/form/div[2]");
    By RegistrationEmail = By.cssSelector("input[type=email]");
    By RegistrationSubmitBtn = By.xpath("//*[@id='button']");
    By RegistrationConfMsg = By.xpath("/html/body/div[1]/form/div[1]");


    public void provideRegistrationEmail(String email) {
        findElement(RegistrationEmail).sendKeys(email);
    }

    public void clickRegistrationSubmitBtn() {
        findElement(RegistrationSubmitBtn).click();
    }

    public String getRegistrationMsg() {
        return findElement(RegistrationErrorMsg).getText();
    }

    public void printRegistrationErrorMsg(String Message) {
        Message = findElement(RegistrationErrorMsg).getText();
        System.out.println("Error Message: " + Message);
    }
    public String getRegistrationConfMsg() {
        return findElement(RegistrationConfMsg).getText();
    }

    public void printRegistrationConfMsg(String Message) {
        Message = findElement(RegistrationConfMsg).getText();
        System.out.println("Confirmation Message: " + Message);
    }

}
