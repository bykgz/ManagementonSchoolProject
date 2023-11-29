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

    @FindBy(xpath = "(//select)[3]")
    public WebElement chooseDaySelect;

    @FindBy(xpath = "(//select)[2]")
    public WebElement chooseEducationTermSelect;

    @FindBy(xpath = "(//select)[4]")
    public WebElement chooseTeacherSelect;

    @FindBy(xpath = "(//button[text()='Submit'])[3]")
    public WebElement addLessonProgramSubmitButton;

    @FindBy(xpath = "(//button[text()='Submit'])[4]")
    public WebElement lessonProgramAssigmentButton;


    @FindBy(css = "div.css-19bb58m > input")
    public WebElement chooseLesson;

    @FindBy(css = "div.css-9jq23d")
    public WebElement javaText;


    @FindBy(css = "#startTime")
    public WebElement startTime;

    @FindBy(css = "#stopTime")
    public WebElement stopTime;

    @FindBy(xpath = "//nav//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[text()='Lesson Management']")
    public WebElement lessonManagementButton;

    @FindBy(xpath = "(//table)[3]//tbody//tr[1]//td")
    public List<WebElement> lessonProgramList;

    @FindBy(xpath = "//*[text()='Created Lesson Program']")
    public WebElement createdLessonProgram;

    @FindBy(xpath = "(//table)[4]//tbody//tr[10]//td")
    public List <WebElement> chooseLessonBolumu;

    @FindBy(xpath= "(//input)[26]")
    public WebElement checkBoxLesson;

    @FindBy(xpath = "//div[text() = 'Lesson added to Teacher']")
    public WebElement addedToTeacherText;


}
