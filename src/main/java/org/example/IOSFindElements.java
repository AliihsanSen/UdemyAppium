package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IOSFindElements {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("IOS");

        WebElement myElement =  driver.findElement(MobileBy.AccessibilityId("Activity Indicators"));
        System.out.println(myElement.getText());

        myElement = driver.findElement(MobileBy.id("Activity Indicators"));
        System.out.println(myElement.getText());

        myElement =driver.findElement(MobileBy.name("Activity Indicators"));
        System.out.println(myElement.getText());

        myElement = driver.findElement(MobileBy.className("XCUIElementTypeStaticText"));
        System.out.println(myElement.getText());

        myElement = driver.findElement(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Activity Indicators\"]"));
        System.out.println(myElement.getText());

    }
}
