package automationExercisesTestCase.pages;

import automationExercisesTestCase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC18_Locates {
    public TC18_Locates(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@style='color: orange;']")
    public WebElement homePageButtonForVerify;

    @FindBy(xpath = "//*[@class='left-sidebar']//h2[1]")
    public WebElement categoryText;

    @FindBy(xpath = "//i[@class='fa fa-plus']")
    public WebElement womenCategory;

    @FindBy(xpath = "//*[text()='Tops ']")
    public WebElement aButtonInDDMenu;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement subCategoryTitle;

    @FindBy(xpath = "(//i[@class='fa fa-plus'])[2]")
    public WebElement menCategory;

    @FindBy(xpath = "//*[text()='Tshirts ']")
    public WebElement tshirtsMenMenu;


}
