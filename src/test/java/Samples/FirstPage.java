package Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class FirstPage {
    By emailLocator = By.id("user[email]");
    By passwordLocator = By.id("user[password]");
    By submitButtonLocator = By.id("//form/button[@type=\"submit\"]");
    By searchField = By.xpath("/html/body/div[1]//label");

    @FindBy(xpath = "user[login]")
    WebElement loginLocator;

    public void fillNameField(){
        loginLocator.sendKeys("ghjgh");
    }



}
