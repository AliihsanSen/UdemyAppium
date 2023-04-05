package org.example.Android;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
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

        for( int i =0; i<3;i++){
            TouchAction touchAction = new TouchAction(driver);
            touchAction.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                    .moveTo(PointOption.point(endX, endY))
                    .release()
                    .perform();
        }


        driver.findElement(textFields).click();
        driver.findElement(editText).click();
        Thread.sleep(3000);

        System.out.println(((AndroidDriver) driver).isKeyboardShown());

        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.C));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
        ((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.CALENDAR));
        Thread.sleep(3000);
        ((AndroidDriver) driver).hideKeyboard();
    }
}
