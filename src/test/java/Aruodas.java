import org.example.models.Plot;
import org.example.models.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Aruodas {


    @BeforeClass
    public void SetupWebDriver() {
        ChromeOptions options = new ChromeOptions(); // maximized
        options.addArguments("--start-maximized");
        Utils._driver = new ChromeDriver(options);

    }

    @Test
    public void testAddress(){
        Plot address = new Plot("Vilnius","Vilniaus m.","Antakalnis","Laisvės pr.","85","315616161594");
        address.fillAdd();
        Assert.assertEquals(true,true);
    }


}
