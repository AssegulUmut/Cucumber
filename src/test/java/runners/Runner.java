package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin ="html:target/cucumber-reports.html",
        features = "src/test/resources",
        glue = "stepdefinitions",
        tags = "@wip",

        dryRun = false

)

public class Runner {

}


/*
    Runner class'i BOS bir class'dir
    Runner class'inin bize sagladigi islev
    Sahip oldugu 2 notasyon sayesindedir

    dryRun = true yaptigimizda
    var olan adimlari CALISTIRMADAN
    sadece eksik adimlari bulur ve onlarla ilgili stepdefinition'lari bize verir

    EGER eksik adim yoksa,
    bu durumu raporlamak icin Test PASSED isaretlenir

    features = "src/test/resources",
        glue = "stepdefinitions",

        bu iki klasor birbiriyle iliskilendirildigi icin bu klasorlerin
        altındaki tum file'ler ve clss'lar iliskilidir
        Cucumber da file ve class,2lari 1-1 eslestirmek yerine tumunu eslestirir

        Eger siz spesifik olarak 1 feature'i, belirledigiiz 1 stepdefiniation class'i
        ile calismasini isterseniz Runner class'inda


 */