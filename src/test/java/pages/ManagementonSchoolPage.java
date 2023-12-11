package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ManagementonSchoolPage {


    public ManagementonSchoolPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = "a.header_link.ms-2")
    public WebElement loginLink;

    @FindBy(css = "#username")
    public WebElement usurnameBox;

    @FindBy(css = "#password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(css = "#controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgramButton;


    @FindBy(xpath = "//*[text()='Created Lesson Program']")
    public WebElement createdLessonProgram;

    @FindBy(xpath = "(//table)[4]//tbody//tr[10]//td")
    public List <WebElement> chooseLessonBolumu;


    @FindBy(xpath = "//div[text() = 'Lesson added to Teacher']")
    public WebElement addedToTeacherText;


}
