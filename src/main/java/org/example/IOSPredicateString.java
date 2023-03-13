package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;

public class IOSPredicateString {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("IOS");

        WebElement myElement = driver.findElement(
                MobileBy.iOSNsPredicateString("label CONTAINS \"Activity Indicators\""));
        System.out.println(myElement.getText());

        myElement = driver.findElement(
                MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Activity Indicators\"]"));
        System.out.println(myElement.getText());

    }
}
