package automationExercisesTestCase.pages;

import automationExercisesTestCase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC17_Locates {
    public TC17_Locates(){
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

    @FindBy(xpath = "(//*[@class='fa fa-times'])[1]")
    public WebElement xButtonForFirstProduct;

    @FindBy(xpath = "(//*[@class='fa fa-times'])[2]")
    public WebElement xButtonForSecondProduct;

    @FindBy(xpath = "//*[@class='cart_description']")
    public WebElement firstProductForVerify;

}
