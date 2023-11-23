package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    /*
    Hooks classı ile seneryolardan önce veya sonra çalışmasını istediğimiz kodları (örneğin scenariolardan önce database bağlantısı gibi yada scenarilardan sonra
    fail olan scenarioların resmini rapora ekleme gibi , @Before ve @After (io.cucumber)  ile oluşturabiliriz . Eğer Hooks classı nı farklı bir package altında oluşturmak
     istersek Runner classındaki glue parametresine bu package yi eklememiz gerekir,
     glue parametresinde stepdefinition packagesi yer aldığı için fazladan package oluşturmamak adına biz stepdefinition package'ı altına Hooks class'ını oluşturduk

     Eğer sadece istediğimiz bir seneryodan önce çalışmasını istediğimiz bir kod olursa @Before notasyonuna parametre olarak scenario ' ya verdiğimiz
     tagı yazarız . Dolayısıyla sadece tag'ı belirttiğimiz @before methodu scenariodan önce devreye girer
     */


    /*
    cucumber hooks ,seneryolardan önce veya sonra çalışan kod bloklarına sahip bir classtır (daha önce kullandığımız test base gibi)
    @Before ve @After annotionları kullanılarak kodları projemizde ve step definitionlarda kullanabiliriz

    cucumber hooks , kod çalışma akışını daha iyi yönetmemizi kolaylaştırır ve kod fazlalığını azaltmamıza yardımcı olur
     */


    //genellikle hooks içerisinde after kullanırız
    //seneryolardan önce diyelim ki database bağlantısı yapacağız bunu hooks ile before içerisinde yapabiliriz




    //@Before("@arac2")  eğer bir parametre yazarsak runnerde tagda  hangisi yazıyorsa sadece onun için çalışır
//    @Before   //bu şekilde @Before a bir şart veya parametre yazmazsak hepsi için çalışır
//    public void setUp() {
//
//    }
//
//    @Before("")   //bu @Befora sadece @arac3  notasyonuna sahip scenario için çalışır
//    public void setUp2() {
//
//    }


//
//    @Before
//    public void setUp() {
//        System.out.println("Scenariolar calismaya basladi");
//    }
//
//    @Before("@admin")
//    public void beforeApiAdmin() {
//
//        System.out.println("Before Method for admin");
//        adminSetup();
//    }
//    @Before("@dean")
//    public void beforeApiDean() {
//
//        System.out.println("Before Method for dean");
//        deanSetup();
//    }
//    @Before("@vicedean")
//    public void beforeApiViceDean() {
//
//        System.out.println("Before Method for vicedean");
//        vicedeanSetup();
//    }
//    @Before("@teacher")
//    public void beforeApiTeacher() {
//
//        System.out.println("Before Method for teacher");
//        teacherSetup();
//    }
//    @Before("@student")
//    public void beforeApiStudent(){
//
//        System.out.println("Before method for student");
//        studentSetup();
//    }


//    @Before("@guest")
//    public void beforeApiGuest(){ System.out.println("Before method for guest");
//        guestSetup();
//    }









    @After
    public void tearDown(Scenario scenario) {  // scenario fail olursa diyebilmemiz için Scenario parametresi yazmamız gerek
        if (scenario.isFailed()) {  //eğer scenario fail olursa
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES) , "image/png" , "scenario_" + scenario.getName());
            // burda OutputType.BYTES olması gerek  ve mediaType (medyanın tipini)  ve name parametrelerini yazıyoruz  -->hangi seneryoda hata aldıysa "scenario_" yazsın ve seneryonun adını yazsın
            //attach --> eklemek demek fail olma durumunda, attach metodu ekran görüntüsünü test raporuna ekler.
            Driver.closeDriver();  //hata aldıkdan sonra browseri kapat
        }
    }





}