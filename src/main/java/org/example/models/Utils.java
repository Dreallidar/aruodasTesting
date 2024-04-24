package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {

    public static WebDriver _driver;
    public static WebDriverWait _wait;

    public static WebElement snoozeUntilElement(By by) {   // laukiam kol atsiras elementas
        WebDriverWait wait = new WebDriverWait(Utils._driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return element;

    }
}
