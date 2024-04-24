package org.example.models;

import jdk.jshell.execution.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Plot {

String region;

String district;

String quartal;

String street;

String address;

String RCNo;




    public Plot(String region, String district, String quartal, String street, String address, String RCNo) {
        this.region = region;
        this.district = district.toLowerCase();
        this.quartal = quartal.toLowerCase();
        this.street = street;
        this.address = address;
        this.RCNo = RCNo;
    }


    public void fillAdd(){
        Utils._driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=1");
        Utils.snoozeUntilElement(By.id("onetrust-reject-all-handler")).click();
        fillAddress();
        fillRcNo();


    }

    public void fillAddress() {
        fillRegion();
        fillDistrict();
        fillQuartal();
        fillStreet();
        fillHouseNo();


    }

    public void fillRegion() {
        Utils._driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[3]/span[1]/span")).click();
        List<WebElement> regions = Utils._driver.findElement(By.id("regionDropdown")).findElements(By.tagName("li"));
        for (WebElement region : regions) {
            if (region.getText().contains(this.region)) {
                region.click();
                break;
            }


        }
    }

    public void fillDistrict(){
        Utils._driver.findElement(By.xpath("//*[@id=\"district\"]/span")).click();
        List<WebElement> regions = Utils._driver.findElements(By.className("dropdown-imput-values-address")).get(1).findElements(By.tagName("li"));
        for (WebElement region : regions) {
            if (region.getText().contains(this.region)) {
                region.click();
                break;
            }


        }

    }

    public void fillQuartal(){


    }

    public void fillStreet() {

    }
    public void fillHouseNo(){

    }

    public void fillRcNo() {
        Utils._driver.findElement(By.name("RCNumber")).sendKeys(this.RCNo);

    }
}
