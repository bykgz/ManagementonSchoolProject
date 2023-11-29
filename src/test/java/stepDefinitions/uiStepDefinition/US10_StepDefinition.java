package stepDefinitions.uiStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.ManagementonSchoolPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US10_StepDefinition {

    ManagementonSchoolPage page = new ManagementonSchoolPage();





    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
        ReusableMethods.bekle(2);
    }

    @When("login linkine tiklar")
    public void LoginLinkineTiklar() {
        page.loginLink.click();
        ReusableMethods.bekle(2);
    }


    @And("User Name kutusuna veri girer")
    public void userNameKutusunaVeriGirer() {
        page.usurnameBox.sendKeys(ConfigReader.getProperty("usernameViceDean"), Keys.TAB, ConfigReader.getProperty("Password"));
        ReusableMethods.bekle(2);
    }

    @And("login butonuna tiklar")
    public void loginButonunaTiklar() {
        page.loginButton.click();
    }

    @And("Menu butonuna tiklar")
    public void menuButonunaTiklar() {
        page.menuButton.click();
        ReusableMethods.bekle(2);
    }

    @And("Lesson Management linkine tıklar")
    public void lessonManagementLinkineTıklar() {
        page.lessonManagementButton.click();
        ReusableMethods.bekle(2);
    }

    @And("lesson program butonuna tiklar")
    public void lessonProgramButonunaTiklar() {
        page.lessonProgramButton.click();
        ReusableMethods.bekle(2);
    }



    @Given("choose lesson kutusundan ders secimi yapar")
    public void chooseLessonKutusundanDersSecimiYapar() {

        ReusableMethods.click(page.chooseLesson);
        page.chooseLesson.sendKeys("java is easy", Keys.ENTER);
        // ReusableMethods.sendKeysJS(page.chooseLesson,"Java",);
        ReusableMethods.bekle(2);
//        Actions actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.ENTER).perform();

    }

    @Then("dersin secilebildigini dogrular")
    public void US10dersinSecilebildiginiDogrular() {
        Assert.assertEquals("Java", page.javaText.getText());
    }




    @Given("Choose Education Term kutusundan egitim donemi secimi yapar")
    public void chooseEducationTermKutusundanEgitimDonemiSecimiYapar() {
        ReusableMethods.ddmValue(page.chooseEducationTermSelect, "25");
    }


    @Then("egitim doneminin secilebildigini dogrular")
    public void egitimDonemininSecilebildiginiDogrular() {
        Select select = new Select(page.chooseEducationTermSelect);
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "FALL_SEMESTER");
    }

    @Given("Choose Day kutusundan ders icin gun secimi yapar")
    public void chooseDayKutusundanDersIcinGunSecimiYapar() {
        ReusableMethods.ddmValue(page.chooseDaySelect, "WEDNESDAY");
    }

    @Then("ders gununun secilebildigini dogrular")
    public void dersGunununSecilebildiginiDogrular() {
        Select select2 = new Select(page.chooseDaySelect);
        Assert.assertEquals(select2.getFirstSelectedOption().getText(), "WEDNESDAY");
    }


    @Given("Start Time ve Stop Time kutularindan ders icin baslama ve bitis saati secimi yapar")
    public void startTimeVeStopTimeKutularindanDersIcinBaslamaVeBitisSaatiSecimiYapar() {
        page.startTime.sendKeys("1230");
        ReusableMethods.bekle(2);
        page.stopTime.sendKeys("1430");
    }


    @Then("Start Time ve Stop Time kutularindan ders icin baslama ve bitis saati secimi yapabidigini dogrular")
    public void startTimeVeStopTimeKutularindanDersIcinBaslamaVeBitisSaatiSecimiYapabidiginiDogrular() {

        Assert.assertEquals("12:30", page.startTime.getAttribute("value"));
        Assert.assertEquals("13:30", page.stopTime.getAttribute("value"));

    }


    @When("sayfayi kapatirMus")
    public void sayfayiKapatirMus() {
        Driver.closeDriver();
    }
}
