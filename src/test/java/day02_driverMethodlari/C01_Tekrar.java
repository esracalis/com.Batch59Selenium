package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/reseurces/drivers/chromedriver 2");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

    }


}
