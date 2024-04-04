import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestClass {

    WebDriver _globalDriver;

    @BeforeTest
    public void SetupWebDriver() {
        ChromeOptions options = new ChromeOptions(); // maximized
        options.addArguments("--start-maximized");
        _globalDriver = new ChromeDriver(options);


    }


    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};
        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

        Random random = new Random();

        StringBuilder email = new StringBuilder();

        // Generate username part
        int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            email.append(randomChar);
        }

        // Adding '@' symbol
        email.append("@");

        // Selecting random domain
        String randomDomain = domains[random.nextInt(domains.length)];
        email.append(randomDomain);

        return email.toString();
    }

    public String generateUsername() {
        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

        Random random = new Random();

        StringBuilder username = new StringBuilder();

        // Generate username part
        int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            username.append(randomChar);

        }
        return username.toString();
    }
    @Test
    public void skelbimoTestas() {
        _globalDriver.get("https://aruodas.lt/");
        _globalDriver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.id("onetrust-reject-all-handler")).click(); // Prisijungti
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[5]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/ul/li[1]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/span")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/ul[2]/li[2]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[5]/span[1]/span[2]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[5]/span[1]/ul[2]/li[41]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/span[2]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[2]/li[1]/input")).sendKeys("pasilaiciu");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[2]/li[2994]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[8]/span[1]/input")).sendKeys("17");
        _globalDriver.findElement(By.id("fieldFAreaOverAll")).sendKeys("7");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[16]/div/div[2]/div[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[18]/div/div[1]/div[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[30]/div/div[1]/textarea")).sendKeys("gers");
        ((JavascriptExecutor) _globalDriver).executeScript("window.scrollTo(0, document.body.scrollHeight/2)");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[32]/div/div[1]/a/input")).sendKeys("C:\\Users\\Dreanix\\Downloads\\Naru.jpg");
        _globalDriver.findElement(By.id("priceField")).sendKeys("2000");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[38]/span[1]/input")).sendKeys("61234567");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[39]/span[1]/input")).sendKeys(generateRandomEmail());
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[42]/span[1]/div/div/label/span")).click();
        _globalDriver.findElement(By.id("submitFormButton")).click();
        _globalDriver.quit();








    }

    @Test
    public void testOpenRegistration() {
        _globalDriver.get("https://m.aruodas.lt/");
        _globalDriver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.id("onetrust-reject-all-handler")).click(); // Slapukai
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/ul/li[5]/a/span[1]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[5]/ul[1]/li[2]/a")).click(); // registracija
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/a[2]")).click(); // registracija
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.id("userName")).sendKeys(generateRandomEmail());
        _globalDriver.findElement(By.id("password")).sendKeys("Slaptaz0dis");
        _globalDriver.findElement(By.id("registerButton")).click();


    }

    @Test
    public void garageSearch() {
        _globalDriver.get("https://aruodas.lt/");
        _globalDriver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.id("onetrust-reject-all-handler")).click(); // Prisijungti
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[1]/div/div/div/span[1]")).click(); // skelbimu dropdown
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[1]/div/div/div/div/ul/li[9]/label")).click(); // garazai
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.id("display_FRegion")).click(); // savivaldybes dropdown
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div/ul/li[2]/label")).click(); // vilnius
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[4]/div/a/span[2]")).click(); // Mikrorajonai
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.switchTo().frame("fancybox-frame");
        _globalDriver.findElement(By.id("cbCheckAll")).click();
        _globalDriver.findElement(By.id("btSaveSelected")).click();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.switchTo().defaultContent();

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[2]/div[5]/div/div[2]/label/input")).click();
        _globalDriver.findElement(By.id("buttonSearchForm")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[2]/div[5]/div/div[2]/label/input")).sendKeys("20000");
        _globalDriver.findElement(By.id("buttonSearchForm")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[8]/div[4]/div/div[2]/h3/a")).click();
        _globalDriver.quit();


    }
    @Test
    public void atsijungimas (){
        testOpenRegistration();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/ul/li[5]/a/span[1]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div/div[5]/ul[1]/li[10]/a/span")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/ul/li[5]/a/span[1]")).click();
        String prisijungti = _globalDriver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/ul/li[5]/a/span[1]")).getText();







    }
    @Test
    public void butoVertesSkaiciuokle (){

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/ul/li[5]/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        _globalDriver.findElement(By.id("address")).sendKeys("Laisvės prospektas 85, Vilnius, Vilnius City Municipality");



    }


}
