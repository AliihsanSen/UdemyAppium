package org.example.Android;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.concurrent.TimeUnit;

public class AndInteractWithKeyboard {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Views");
        By textFields = MobileBy.AccessibilityId("TextFields");
        By editText = MobileBy.id("io.appium.android.apis:id/edit");

        driver.findElement(views).click();

        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int endX = startX;
        int startY = (int) (size.height*0.8);
        int endY = (int) (size.height*0.2);




        driver.findElement(textFields).click();
        driver.findElement(editText).click();
        Thread.sleep(3000);

        System.out.println(((AndroidDriver) driver).isKeyboardShown());

        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.C));
//        driver.getKeyboard().pressKey(Keys.ARROW_DOWN); -> Deprecated
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.CALENDAR));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.B));
        Thread.sleep(3000);
//        driver.getKeyboard().pressKey(Keys.HOME); -> Deprecated
        ((AndroidDriver) driver).hideKeyboard();
    }
}
