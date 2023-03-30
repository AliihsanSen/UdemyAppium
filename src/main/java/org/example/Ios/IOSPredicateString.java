package org.example.Ios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
