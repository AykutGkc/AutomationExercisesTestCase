package automationExercisesTestCase.pages;

import automationExercisesTestCase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC14_Locates {
    public TC14_Locates(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@style='color: orange;']")
    public WebElement homePageButtonForVerify;


    @FindBy(xpath = "(//*[text()='Add to cart'])[1]")
    public WebElement addToCartButtonForFirstProduct;

    @FindBy(xpath = "(//*[text()='Add to cart'])[3]")
    public WebElement addToCartButtonForSecondProduct;

    @FindBy(xpath = "(//*[text()='Add to cart'])[5]")
    public WebElement addToCartButtonForThirdProduct;

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueShopping;

    @FindBy(xpath = "(//li)[3]")
    public WebElement cartButtonForClick;

    @FindBy(xpath = "//*[@style='color: orange;']")
    public WebElement cartButtonForVerify;
    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement proceedToCheckOut;
    @FindBy(xpath = "(//*[@class='text-center'])[2]")
    public WebElement registerLogin;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement nameForSignUpArea;
    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement emailForSignUpArea;
    @FindBy(xpath = "(//*[@class='btn btn-default'])[2]")
    public WebElement signUpButtonInSignUpArea;


    @FindBy(css ="input[id='id_gender1']")
    public WebElement genderMr;

    @FindBy(id = "id_gender2")
    public WebElement genderMrs;

    @FindBy(id="password")
    public WebElement passwordForSignUpPage;
    @FindBy(id ="days")
    public WebElement daysForSignUpPage;

    @FindBy(id="months")
    public WebElement monthsForSignUpPage;

    @FindBy(id="years")
    public WebElement yearsForSignUpPage;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement checkBoxForNewsletter;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement checkBoxForSpecialOffers;

    @FindBy(id = "first_name")
    public WebElement firstNameForSignUpPage;

    @FindBy(id = "last_name")
    public WebElement lastNameForSignUpPage;

    @FindBy(id = "company")
    public WebElement companyForSignUpPage;

    @FindBy(id = "address1")
    public WebElement address1ForSignUpPage;
    @FindBy(id = "address2")
    public WebElement address2ForSignUpPage;

    @FindBy(id = "country")
    public WebElement countryForSignUpPage;
    @FindBy(id = "state")
    public WebElement stateForSignUpPage;
    @FindBy(id = "city")
    public WebElement cityForSignUpPage;
    @FindBy(id = "zipcode")
    public WebElement zipcodeForSignUpPage;
    @FindBy(id = "mobile_number")
    public WebElement mobileNumberForSignUpPage;
    @FindBy( xpath = "//button[@type='submit']")
    public WebElement submitButtonForSignUpPage;
    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreated;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueButtonAfterAccountCreated;

    @FindBy(xpath = "(//a)[11]")
    public WebElement loggedInAsUsernameScript;

    @FindBy(xpath = "(//*[@class='heading'])[1]")
    public WebElement addressDetailsForVerify;

    @FindBy(xpath = "(//*[@class='heading'])[2]")
    public WebElement ordersDetailsForVerify;

    @FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement textAreaForComment;

    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement placeOrderButton;
    @FindBy(xpath = "//input[@name='name_on_card']")
    public WebElement nameOnCard;
    @FindBy(xpath = "//input[@name='card_number']")
    public WebElement cardNumber;
    @FindBy(xpath = "//input[@name='cvc']")
    public WebElement cvc;
    @FindBy(xpath = "//input[@name='expiry_month']")
    public WebElement exprationMonth;
    @FindBy(xpath = "//input[@name='expiry_year']")
    public WebElement exprationYear;
    @FindBy(id = "submit")
    public WebElement payAndConfirmOrderButton;

    @FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    public WebElement successfullyOrderMessageAfterCreditCardInfo;

    @FindBy(xpath = "//*[@class='fa fa-trash-o']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//*[text()='Account Deleted!']")
    public WebElement accountDeletedMessage;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement continueButtonAfterAccountDeleted;













}
