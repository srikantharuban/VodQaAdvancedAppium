package com.wordpress.pages;

import com.wordpress.pageobjects.ChainViewPageObjects;
import com.wordpress.utils.Helpers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by saikrisv on 12/29/16.
 */
public class ChainViewPage extends Helpers {

    private ChainViewPageObjects chainViewPageObjects;

    ChainViewPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        chainViewPageObjects = new ChainViewPageObjects();
        PageFactory.initElements(new AppiumFieldDecorator(driver,
                15, TimeUnit.MILLISECONDS), chainViewPageObjects);
    }

    public String getSecondComment() {
        return waitForElement(chainViewPageObjects.views).getText();
    }


}
