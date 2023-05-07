package automationExercisesTestCase.tests;

import automationExercisesTestCase.pages.TC17_Locates;
import automationExercisesTestCase.utilities.ConfigReader;
import automationExercisesTestCase.utilities.Driver;
import automationExercisesTestCase.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC17_Test {
    @Test
    public void testName() {
        ReusableMethods.extentReport();
        ReusableMethods.extentTest = ReusableMethods.extentReports.createTest("ExtentTest", "Test Report");

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationExercise_Url"));
        ReusableMethods.extentTest.info("Navigate to url 'http://automationexercise.com'");
        ReusableMethods.waitWithThreadSleep(2);

        //3. Verify that home page is visible successfully
        TC17_Locates tc17Locates = new TC17_Locates();
        Assert.assertTrue(tc17Locates.homePageButtonForVerify.isDisplayed());
        ReusableMethods.extentTest.pass("Assertion: Home page is visible successfully");

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.extentTest.info("Page is downed");
        ReusableMethods.waitWithThreadSleep(1);

        //4. Add products to cart and click continue button

        tc17Locates.addToCartButtonForFirstProduct.click();
        ReusableMethods.waitWithThreadSleep(1);
        tc17Locates.continueShopping.click();
        ReusableMethods.waitWithThreadSleep(1);

        tc17Locates.addToCartButtonForSecondProduct.click();
        ReusableMethods.waitWithThreadSleep(1);
        tc17Locates.continueShopping.click();
        ReusableMethods.waitWithThreadSleep(1);

        tc17Locates.addToCartButtonForThirdProduct.click();
        ReusableMethods.waitWithThreadSleep(1);
        tc17Locates.continueShopping.click();
        ReusableMethods.waitWithThreadSleep(1);

        ReusableMethods.extentTest.info("Add products to cart and click continue button ");

        //5. Click 'Cart' button
        tc17Locates.cartButtonForClick.click();
        ReusableMethods.extentTest.info("Click 'Cart' button");
        ReusableMethods.waitWithThreadSleep(1);

        //6. Verify that cart page is displayed
        Assert.assertTrue(tc17Locates.cartButtonForVerify.isDisplayed());
        ReusableMethods.extentTest.pass("Verify that cart page is displayed");
        ReusableMethods.waitWithThreadSleep(1);

        //7. Click 'X' button corresponding to particular product
        tc17Locates.xButtonForFirstProduct.click();
        ReusableMethods.extentTest.info("Click 'X' button corresponding to particular product");
        ReusableMethods.waitWithThreadSleep(1);
        //8. Verify that product is removed from the cart

        String actualFirstProductName= tc17Locates.firstProductForVerify.getText();

        String expectedProductName="Blue Top";
        Assert.assertFalse(actualFirstProductName.equals(expectedProductName));
        ReusableMethods.extentTest.pass("Assertion : Verify that product is removed from the cart");


    }
}