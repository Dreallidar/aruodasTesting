package org.example.models;

import jdk.jshell.execution.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Plot {

    String region;

    String district;

    String quartal;

    String street;

    String address;
    String apartment;

    String area;

    String noOfFloors;

    String RCNo;
    int streetFieldNo = 3;


    public Plot(String region, String district, String quartal, String street, String address, String apartment, String RCNo) {
        this.region = region.toLowerCase();
        this.district = district.toLowerCase();
        this.quartal = quartal.toLowerCase();
        this.street = street.toLowerCase();
        this.address = address.toLowerCase();
        this.apartment = apartment.toLowerCase();
        this.RCNo = RCNo;

    }




    public void fillAdd() {
        Utils._driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=2");
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
        fillApartNo();


    }



    public void fillRegion() {
        Utils._driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[3]/span[1]/span")).click();
        List<WebElement> regions = Utils._driver.findElement(By.id("regionDropdown")).findElements(By.tagName("li"));
        for (WebElement region : regions) {
            if (region.getText().toLowerCase().contains(this.region)) {
                region.click();
                break;
            }


        }
    }

    public void fillDistrict() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Utils._driver.findElement(By.xpath("//*[@id=\"district\"]/span")).click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> districts = Utils._driver.findElements(By.className("dropdown-input-values-address")).get(1).findElements(By.tagName("li"));
        for (WebElement district : districts) {
            if (district.getText().toLowerCase().contains(this.district)) {
                district.click();
                break;
            }


        }

    }

    public void fillQuartal() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (Utils._driver.findElement(By.id("quartalField")).getAttribute("class").contains("field-disabled")) {
            streetFieldNo--;
            return;
        } else {
            Utils._driver.findElement(By.xpath("//*[@id=\"quartalField\"]/span[1]/span[2]")).click();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            List<WebElement> quartals = Utils._driver.findElements(By.className("dropdown-input-values-address")).get(2).findElements(By.tagName("li"));
            for (WebElement quartal : quartals) {
                System.out.println(quartal.getText());
                if (quartal.getText().toLowerCase().contains(this.quartal)) {
                    quartal.click();
                    break;
                }
            }
        }


    }

    public void fillStreet() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (Utils._driver.findElement(By.id("streetField")).getAttribute("class").contains("field-disabled")) {
            return;
        } else {
            Utils._driver.findElement(By.xpath("//*[@id=\"streetField\"]/span[1]/span[2]")).click();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            List<WebElement> streets = Utils._driver.findElements(By.className("dropdown-input-values-address")).get(streetFieldNo).findElements(By.tagName("li"));
            for (WebElement street : streets) {
                System.out.println(street.getText());
                if (street.getText().toLowerCase().contains(this.street)) {
                    street.click();
                    break;
                }
            }
        }

    }

    public void fillApartNo() {
        Utils._driver.findElement(By.name("FApartNum")).sendKeys(this.apartment);

    }

    public void fillHouseNo() {
        Utils._driver.findElement(By.name("FHouseNum")).sendKeys(this.address);

    }

    public void fillRcNo() {
        Utils._driver.findElement(By.name("RCNumber")).sendKeys(this.RCNo);

    }
}

