package automationExercisesTestCase.tests;

import automationExercisesTestCase.pages.TC14_Locates;
import automationExercisesTestCase.utilities.ConfigReader;
import automationExercisesTestCase.utilities.Driver;
import automationExercisesTestCase.utilities.ReusableMethods;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC14_Test {

    @Test
    public void test14() {
        ReusableMethods.extentReport();
         ReusableMethods.extentTest = ReusableMethods.extentReports.createTest("ExtentTest", "Test Report");

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationExercise_Url"));
        ReusableMethods.extentTest.info("Navigate to url 'http://automationexercise.com'");
        ReusableMethods.waitWithThreadSleep(2);

        //3. Verify that home page is visible successfully
        TC14_Locates tc14Locates = new TC14_Locates();
        Assert.assertTrue(tc14Locates.homePageButtonForVerify.isDisplayed());
        ReusableMethods.extentTest.pass("Assertion: Home page is visible successfully");

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.extentTest.info("Page is downed");
        ReusableMethods.waitWithThreadSleep(1);

        //4. Add products to cart and click continue button

        tc14Locates.addToCartButtonForFirstProduct.click();
        ReusableMethods.waitWithThreadSleep(1);
        tc14Locates.continueShopping.click();
        ReusableMethods.waitWithThreadSleep(1);

        tc14Locates.addToCartButtonForSecondProduct.click();
        ReusableMethods.waitWithThreadSleep(1);
        tc14Locates.continueShopping.click();
        ReusableMethods.waitWithThreadSleep(1);

        tc14Locates.addToCartButtonForThirdProduct.click();
        ReusableMethods.waitWithThreadSleep(1);
        tc14Locates.continueShopping.click();
        ReusableMethods.waitWithThreadSleep(1);

        ReusableMethods.extentTest.info("Add products to cart and click continue button ");

        //5. Click 'Cart' button
        tc14Locates.cartButtonForClick.click();
        ReusableMethods.extentTest.info("Click 'Cart' button");
        ReusableMethods.waitWithThreadSleep(1);

        //6. Verify that cart page is displayed
        Assert.assertTrue(tc14Locates.cartButtonForVerify.isDisplayed());
        ReusableMethods.extentTest.pass("Verify that cart page is displayed");
        ReusableMethods.waitWithThreadSleep(1);

        //7. Click Proceed To Checkout
        tc14Locates.proceedToCheckOut.click();
        ReusableMethods.extentTest.info("Click Proceed To Checkout");
        ReusableMethods.waitWithThreadSleep(1);

        //8. Click 'Register / Login' button
        tc14Locates.registerLogin.click();
        ReusableMethods.extentTest.info("Click 'Register / Login' button");
        ReusableMethods.waitWithThreadSleep(1);

        //9. Fill all details in Signup and create account
        tc14Locates.nameForSignUpArea.sendKeys("Alicem");
        ReusableMethods.waitWithThreadSleep(1);
        tc14Locates.emailForSignUpArea.sendKeys("alicem@gmail.com");
        ReusableMethods.waitWithThreadSleep(1);
        tc14Locates.signUpButtonInSignUpArea.click();
        ReusableMethods.extentTest.info("Fill new User SignUp und call details in Signup and create account");
        ReusableMethods.waitWithThreadSleep(1);

        //Fill details: Title, Name, Email, Password, Date of birth
        //title
        tc14Locates.genderMr.click();
        //password
        tc14Locates.passwordForSignUpPage.sendKeys("12345");
        ReusableMethods.waitWithThreadSleep(1);

        //page down
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitWithThreadSleep(1);

        //Date of birth
        //Day
        WebElement day= tc14Locates.daysForSignUpPage;
        Select selectDay = new Select(day);
        selectDay.selectByValue("22");
        ReusableMethods.waitWithThreadSleep(1);
        //month
        WebElement month=tc14Locates.monthsForSignUpPage;
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("5");
        ReusableMethods.waitWithThreadSleep(1);

        //year
        WebElement year = tc14Locates.yearsForSignUpPage;
        Select selectYear = new Select(year);
        selectYear.selectByValue("1981");
        ReusableMethods.waitWithThreadSleep(1);

        // Select checkbox 'Sign up for our newsletter!'
         tc14Locates.checkBoxForNewsletter.click();
        //Select checkbox 'Receive special offers from our partners!'
        tc14Locates.checkBoxForSpecialOffers.click();
        ReusableMethods.waitWithThreadSleep(1);
        //First name
        tc14Locates.firstNameForSignUpPage.sendKeys("Alice");
        ReusableMethods.waitWithThreadSleep(1);
        //Lasat name
        tc14Locates.lastNameForSignUpPage.sendKeys("Gel");
        ReusableMethods.waitWithThreadSleep(1);
        //company
        tc14Locates.companyForSignUpPage.sendKeys("Next Technology");
        ReusableMethods.waitWithThreadSleep(1);
        //address
        tc14Locates.address1ForSignUpPage.sendKeys("Stein Street 77, 47799,Ottava");
        ReusableMethods.waitWithThreadSleep(1);
        tc14Locates.address2ForSignUpPage.sendKeys("Toronto, Canada");
        ReusableMethods.waitWithThreadSleep(1);
        //country
        WebElement country=  tc14Locates.countryForSignUpPage;
        Select selectCountry = new Select(country);
        selectCountry.selectByIndex(2);
        //state
        tc14Locates.stateForSignUpPage.sendKeys("Toronto");
        ReusableMethods.waitWithThreadSleep(1);
        //city
        tc14Locates.cityForSignUpPage.sendKeys("Toronto");
        ReusableMethods.waitWithThreadSleep(1);
        //Zipcode
        tc14Locates.zipcodeForSignUpPage.sendKeys("1457");
        ReusableMethods.waitWithThreadSleep(1);
        //Mobile number
        tc14Locates.mobileNumberForSignUpPage.sendKeys("145721214");
        ReusableMethods.waitWithThreadSleep(1);
        //click submit
        tc14Locates.submitButtonForSignUpPage.click();
        ReusableMethods.extentTest.info("Fill all details in Signup and create account");

        //10. Verify 'ACCOUNT CREATED!'

        WebElement accountCreated= tc14Locates.accountCreated;
        Assert.assertTrue(accountCreated.isDisplayed());
        ReusableMethods.extentTest.pass("Assertion : Verify 'ACCOUNT CREATED!'");
        // and click 'Continue' button
        tc14Locates.continueButtonAfterAccountCreated.click();
        ReusableMethods.extentTest.info("Click 'Continue' button");

        //      if there is a popup add, close add
        Driver.getDriver().get("https://automationexercise.com/account_created#google_vignette");
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.ESCAPE).build().perform();
        ReusableMethods.extentTest.info("Close popup add");
        ReusableMethods.waitWithThreadSleep(1);

        tc14Locates.continueButtonAfterAccountCreated.click();
        ReusableMethods.extentTest.info("After add. click 'Continue' button ");

        //11. Verify ' Logged in as username' at top
        Assert.assertTrue(tc14Locates.loggedInAsUsernameScript.isDisplayed());
        ReusableMethods.extentTest.pass("Assertion : Verify ' Logged in as username' at top");

        //12.Click 'Cart' button
        tc14Locates.cartButtonForClick.click();
        ReusableMethods.extentTest.info("Click 'Cart' button");
        ReusableMethods.waitWithThreadSleep(1);

        //13. Click 'Proceed To Checkout' button
        tc14Locates.proceedToCheckOut.click();
        ReusableMethods.extentTest.info("Click Proceed To Checkout");
        ReusableMethods.waitWithThreadSleep(1);

        //14. Verify Address Details and Review Your Order
        assert tc14Locates.addressDetailsForVerify.isDisplayed();
        assert tc14Locates.ordersDetailsForVerify.isDisplayed();
        ReusableMethods.extentTest.pass("AssertionVerify Address Details and Review Your Order");
        ReusableMethods.waitWithThreadSleep(1);

        //15. Enter description in comment text area and click 'Place Order'

        tc14Locates.textAreaForComment.sendKeys("Hallo world!");
        ReusableMethods.waitWithThreadSleep(1);
        tc14Locates.placeOrderButton.click();
        ReusableMethods.extentTest.info("Enter description in comment text area and click 'Place Order'");

        //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        //Name on Card
        tc14Locates.nameOnCard.sendKeys("Alice Money");
        //Card Number
       tc14Locates.cardNumber.sendKeys("1234 4567 6789 9123");
        //CVC
        tc14Locates.cvc.sendKeys("122");
        //Expiration date
        tc14Locates.exprationMonth.sendKeys("12");
        tc14Locates.exprationYear.sendKeys("2026");
        ReusableMethods.extentTest.info("Enter payment details: Name on Card, Card Number, CVC, Expiration date");
        ReusableMethods.waitWithThreadSleep(1);

        //17. Click 'Pay and Confirm Order' button
        tc14Locates.payAndConfirmOrderButton.click();
        ReusableMethods.extentTest.info("Click 'Pay and Confirm Order' button");
        ReusableMethods.waitWithThreadSleep(2);

        //18. Verify success message 'Your order has been placed successfully!'
        WebElement paymentMessage = tc14Locates.successfullyOrderMessageAfterCreditCardInfo;
        org.junit.Assert.assertTrue(paymentMessage.isDisplayed());
        ReusableMethods.extentTest.pass("Assertion:Verify success message 'Your order has been placed successfully!'");

        //    if there is a popup add, close ad
       Driver.getDriver().get("https://automationexercise.com/delete_account#google_vignette");
        action.sendKeys(Keys.ESCAPE).build().perform();
        ReusableMethods.extentTest.info("PopUp add closed");
       ReusableMethods.waitWithThreadSleep(1);

        //19. Click 'Delete Account' button
//        tc14Locates.deleteAccountButton.click();
//        ReusableMethods.extentTest.info("Click 'Delete Account' button");

        //  20. Verify that 'ACCOUNT DELETED!' is visible
        WebElement deletedTex = tc14Locates.accountDeletedMessage;
        Assert.assertTrue(deletedTex.isDisplayed());
       ReusableMethods.extentTest.pass("Verify that 'ACCOUNT DELETED!' is visible");


        //click continue
        tc14Locates.continueButtonAfterAccountDeleted.click();
        ReusableMethods.extentTest.info("click continue");
        ReusableMethods.extentTest.info("Close page");
    }
}
