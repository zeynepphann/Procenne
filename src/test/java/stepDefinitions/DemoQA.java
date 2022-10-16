package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DemoQAPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;


public class DemoQA {

    DemoQAPage demoPage= new DemoQAPage();
    Actions actions=new Actions(Driver.getDriver());
    Faker faker = new Faker();
    JavascriptExecutor jsx = (JavascriptExecutor)Driver.getDriver();



    @Given("Kullanici Demoqa adresine gider")
    public void kullanici_demoqa_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
    }

    @Given("Kullanici ana sayfada Forms secenegini secer")
    public void kullanici_ana_sayfada_forms_secenegini_secer() {

        jsx.executeScript("window.scrollBy(0,1000)", "");
        demoPage.formButonu.click();


    }

    @Given("Kullanici sol tarafta yer alan Practice Form secenegine secer")
    public void kullanici_sol_tarafta_yer_alan_practice_form_secenegine_secer() {
        demoPage.practiceForm.click();
    }

    @Then("Kullanici sayfada yer alan kisisel bilgileri doldurur")
    public void kullanici_sayfada_yer_alan_kisisel_bilgileri_doldurur() {
        //Driver.getDriver().manage().window().maximize();
        ReusableMethod.waitFor(3);
        actions.click(demoPage.isimKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("05555555555")
                .perform();

        demoPage.femaleButonu.click();
        ReusableMethod.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        ReusableMethod.waitFor(2);
        demoPage.select.click();
        Select select=new Select(demoPage.tarihAySelect);
        select.selectByValue("1");
        Select select1=new Select(demoPage.tarihYilSelect);
        select1.selectByValue("1999");
        ReusableMethod.waitFor(2);
        demoPage.tarihGunSelect.click();
        ReusableMethod.waitFor(5);

        demoPage.subjectKutusu.click();
        ReusableMethod.waitFor(2);
        actions.sendKeys("a").perform();
        ReusableMethod.waitFor(2);
       // actions.sendKeys(Keys.ENTER).perform(); hata alabilmek icin

        ReusableMethod.waitFor(3);
        demoPage.hobiKutucugu.click();



    }

    @Then("Kullanici resim yukler")
    public void kullaniciResimYukler() {


        String imagePath ="C:\\Users\\Asus\\IdeaProjects\\Procenne\\src\\test\\resources\\testData\\dvrkagidi.png";
        demoPage.uploadPicture.sendKeys(imagePath);
    }

    @Then("Kullanici adresi secer")
    public void kullanici_adresi_secer() {

        Driver.getDriver().manage().window().setSize(new Dimension(760,760));

        ReusableMethod.waitFor(2);
        demoPage.adressButonu.sendKeys("Adress");


      ReusableMethod.waitFor(2);
      ReusableMethod.scrooltoWebelement(demoPage.stateBuradan);
      ReusableMethod.waitFor(3);
      actions.click(demoPage.state).sendKeys(Keys.ENTER).perform();
      ReusableMethod.waitFor(3);
      actions.click(demoPage.city).sendKeys(Keys.ENTER).perform();
      ReusableMethod.waitFor(3);
      demoPage.submit.click();


    }

}
