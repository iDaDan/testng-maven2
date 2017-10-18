package Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class SampleTest {


   /* @Test
    public void OpenGithub () {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");
    }*/

    @Test
    public void SearchGithubForm () {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/");
        driver.manage().window().maximize();
      driver.findElement(By.xpath("//form/button[@type=\"submit\"]")).isDisplayed();
      driver.findElement(By.xpath("//*[@id=\"user[login]\"]")).isDisplayed();
      driver.findElement(By.xpath("//*[@id=\"user[email]\"]")).isDisplayed();
      driver.findElement(By.xpath("//*[@id=\"user[password]\"]")).isDisplayed();
      driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/div/div/form/label/input[1]")).isDisplayed();
      driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[1]/a")).isDisplayed();
      driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/a")).isDisplayed();
      driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[3]/a")).isDisplayed();
      driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[4]/a")).isDisplayed();
      driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[5]/a")).isDisplayed();

    }

    @Test
    public void SearchOnGitHub () {


        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/");
        driver.manage().window().maximize();
        /*проверяем наличие поля поиска и */
        driver.findElement(By.xpath("/html/body/div[1]//label")).isEnabled();
        driver.findElement(By.xpath("/html/body/div[1]//label")).sendKeys("Selenide " + Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.linkText("codeborne/selenide")).isDisplayed();
        /*количество звезд*/
        String StarsAmount = driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[1]/ul/div[1]/div[3]/a")).getText();
        int SA = Integer.parseInt(StarsAmount);
        int Plank = 100;
        Assert.assertTrue(SA > Plank);
        /*находим выпадающий список*/
        driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]//button/i")).click();
        driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]//a[1]/span")).click(); /*сортировка по most stars*/
        /*//*[@id="js-pjax-container"]/div[2]/div/div[1]/div[1]/div/div/div/div[2]/a[1]/span*/
        driver.findElement(By.linkText("codeborne/selenide")).isDisplayed();
        System.out.println("Successfully passed!");

    }

/*    @Test
    public void SearchOnBazarpnz () {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/div/div/form/label")).isEnabled();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/div/div/form/label")).sendKeys("Selenide " + Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[1]/ul/div[1]/div[1]/h3/a")).isDisplayed();
        String FirstString = driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[1]/ul/div[1]/div[1]/h3/a")).getText(); *//*забираем первую строчку выдачи*//*
        String ShouldBe = "codeborne/selenide";
        Assert.assertEquals(FirstString, "codeborne/selenide");
        *//*количество звезд*//*
*//*        driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[1]/ul/div[1]/div[3]/a")).isDisplayed();
        String StarsAmount = driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[1]/ul/div[1]/div[3]/a/")).getText();
        int SA = Integer.parseInt(StarsAmount);
        int Plank = 100;
        Assert.assertTrue(SA > Plank);*//*
        *//*находим выпадающий список*//*
        *//*WebElement selectElem = driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[1]/div[1]/div"));*//*
        *//*driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[1]/div[1]/div")).sendKeys("Selenide " + Keys.ENTER);*//*
        driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[1]/div[1]/div/button/i")).click();
        //*[@id="js-pjax-container"]/div[2]/div/div[1]/div[1]/div
        driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[1]/div[1]/div/div/div/div[2]/a[1]/span")).click();
        String FirstString2 = driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[1]/ul/div[1]/div[1]/h3/a")).getText();
        Assert.assertEquals(FirstString2, "codeborne/selenide");
        System.out.println("Successfully passed!");

    }*/







/*

    @Test
    public void WrongSearchGithub () {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/");
        driver.findElement(By.name("sexy back"));

    }

    @Test(groups = {"web"})
    public void second(){
        System.out.println("web");
        Assert.assertEquals("3","31");
    }
*/

}
