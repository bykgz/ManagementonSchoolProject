package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //cucumber ile junit entegre olmasını sağlayan scenario çalıştırıcı notasyonu
                          //cucumber ile junit in entegre olmasını sağlıyor

@CucumberOptions(plugin = {"pretty","html:target/default-cucumber-reports.html", //html formatında rapor için   //---> baş kısımdaki "pretty"  consolda scenario ile alakalı detaylı bigi vermesi için
        "json:target/json-reports/cucumber.json",  //json formatında rapor için
        "junit:target/xml-reports/cucumber.xml",  //xml formatında rapor için
        "rerun:TestOutput/failed_scenario.txt"},  // rerun plugin'i sayesinde fail olan scenariolarımızı yolunu belirttiğimiz  txt dosya içi tutacaktır
        features = "src/test/resources",
        glue = "stepDefinitions",
        tags = "@all",
        dryRun = false,
        monochrome = true
)



public class Runner {






}
