package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoExercisePage;
import utilities.Driver;

public class AutomationExerciseStepdefiniations {
    AutoExercisePage autoExercisePage=new AutoExercisePage();
    Faker faker=new Faker();
    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        autoExercisePage.IlksignupButonu.click();

    }
    @Given("user Create an account bolumune email adresi girer")
    public void user_create_an_account_bolumune_email_adresi_girer() {


        autoExercisePage.nameKutusu.sendKeys(faker.name().username());
        autoExercisePage.emailKutusu.sendKeys(faker.internet().emailAddress());

    }
    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
        autoExercisePage.signUpButonu.click();

    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions=new Actions(Driver.getDriver());
        actions.click(autoExercisePage.genderRadioButton)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("3")
                .sendKeys(Keys.TAB)
                .sendKeys("Mar")
                .sendKeys(Keys.TAB)
                .sendKeys("2016")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys("Canada")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

               actions.sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .perform();

    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {
        autoExercisePage.createAccountButonu.click();

    }
    @Then("hesap olustugunu test edin")
    public void hesap_olustugunu_test_edin() {
        Assert.assertTrue(autoExercisePage.hesapTesti.isDisplayed());


    }
}
