package automationExercisesTestCase.tests;

import automationExercisesTestCase.pages.TC17_Locates;
import automationExercisesTestCase.pages.TC18_Locates;
import automationExercisesTestCase.utilities.ConfigReader;
import automationExercisesTestCase.utilities.Driver;
import automationExercisesTestCase.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC18_Test {

    @Test
    public void test18() {
        ReusableMethods.extentReport();
        ReusableMethods.extentTest = ReusableMethods.extentReports.createTest("ExtentTest", "Test Report");

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationExercise_Url"));
        ReusableMethods.extentTest.info("Navigate to url 'http://automationexercise.com'");
        ReusableMethods.waitWithThreadSleep(2);

        //3. Verify that home page is visible successfully
        TC18_Locates tc18Locates = new TC18_Locates();
        Assert.assertTrue(tc18Locates.homePageButtonForVerify.isDisplayed());
        ReusableMethods.extentTest.pass("Assertion: Home page is visible successfully");
        ReusableMethods.waitWithThreadSleep(1);

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.extentTest.info("Page is downed");
        ReusableMethods.waitWithThreadSleep(1);

//        4. Click on 'Women' category
        tc18Locates.womenCategory.click();
        ReusableMethods.extentTest.info("Click on 'Women' category");
        ReusableMethods.waitWithThreadSleep(1);

//        5. Click on any category link under 'Women' category, for example: Dress
        tc18Locates.aButtonInDDMenu.click();
        ReusableMethods.extentTest.info("Click on any category link under 'Women' category");
        ReusableMethods.waitWithThreadSleep(1);
//    if there is a popup add, close ad
        Driver.getDriver().get("https://automationexercise.com/#google_vignette");

        actions.sendKeys(Keys.ESCAPE).build().perform();
        ReusableMethods.extentTest.info("PopUp add closed");
        ReusableMethods.waitWithThreadSleep(1);

        tc18Locates.womenCategory.click();
        tc18Locates.aButtonInDDMenu.click();
        ReusableMethods.waitWithThreadSleep(1);
//        6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
            String categoryName= tc18Locates.subCategoryTitle.getText();

            Assert.assertTrue(categoryName.equals("WOMEN - TOPS PRODUCTS"));
        ReusableMethods.extentTest.info("Click on any category link under 'Women' category");
        ReusableMethods.waitWithThreadSleep(1);

        //        7. On left side bar, click on any sub-category link of 'Men' category
            tc18Locates.menCategory.click();
            tc18Locates.tshirtsMenMenu.click();
        ReusableMethods.extentTest.info("On left side bar, click on any sub-category link of 'Men' category");
        ReusableMethods.waitWithThreadSleep(1);

//        8. Verify that user is navigated to that category page
            Assert.assertTrue(tc18Locates.subCategoryTitle.isDisplayed());
        ReusableMethods.extentTest.pass ("Assert : Verify that user is navigated to that category page");
            Driver.getDriver().close();

    }
}
