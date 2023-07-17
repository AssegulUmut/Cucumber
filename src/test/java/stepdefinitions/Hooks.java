package stepdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
public class Hooks {
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
            Driver.closeDriver();
        }
    }


}

//Hooks class'i tum senrylar icin calisacak
//@Before.... veya @After...notasyonlarina sahip method'lari icerir
//TestNg'deki TestBase class'lari gibidir

//Ancak TestNG'deki TestBase class'ini ISTERSEK extends diyerek kullanabiliyorduk
//istemezek kullanmiyorduk

//Cucumber yapisi geregi stepdefiinitions packge'i altinda
//@Before... veya @After... olursa
//her Scenario icin calisacaktir

//Bundan dolayi ozel bir durum yoksa Hooks class'ini sadece screenshot

