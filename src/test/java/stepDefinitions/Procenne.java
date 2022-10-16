package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import pages.ProcennePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

public class Procenne {

    ProcennePage procennePage=new ProcennePage();
    JavascriptExecutor jsx = (JavascriptExecutor)Driver.getDriver();


    @Given("Kullanici procenneUrl adresine gider.")
    public void kullaniciProcenneUrlAdresineGider() {

        Driver.getDriver().get(ConfigReader.getProperty("procenneUrl"));

    }

    @Then("Kullanici Iletisim butonuna tiklar.")
    public void kullanici_iletisim_butonuna_tiklar() {

        procennePage.iletisimButonu.click();

    }

    @Then("Kullanici sayfanin asagisindaki Bize Ulasin kutucugundaki gerekli alanlari doldurur.")
    public void kullanici_sayfanin_asagisindaki_bize_ulasin_kutucugundaki_gerekli_alanlari_doldurur(){

        ReusableMethod.waitFor(1);
        procennePage.isimButonu.sendKeys("Zeynep");
        ReusableMethod.waitFor(1);
        procennePage.soyIsimButonu.sendKeys("Han");
        ReusableMethod.waitFor(1);
        procennePage.companyButonu.sendKeys("Turkey");
        ReusableMethod.waitFor(1);
        procennePage.emailButonu.sendKeys("zeynephan@gmail.com");
        ReusableMethod.waitFor(1);
        procennePage.messageButonu.sendKeys("MERHABA TEST TAKIMI");

    }

    @Then("Kullanici checkbox'lari isaretler.")
    public void kullanici_checkbox_lari_isaretler() {


    ReusableMethod.waitFor(2);
    jsx.executeScript("arguments[0].click();", procennePage.checkbox1);
    ReusableMethod.waitFor(2);
    ReusableMethod.scrooltoWebelement(procennePage.indirmeButton1);
    ReusableMethod.waitFor(2);
    procennePage.okudumButton1.click();
    ReusableMethod.waitFor(2);

    jsx.executeScript("arguments[0].click();", procennePage.checkbox2);
    ReusableMethod.waitFor(2);
    ReusableMethod.scrooltoWebelement(procennePage.indirmeButton2);
    ReusableMethod.waitFor(2);
    procennePage.okudumButton2.click();
    }

    @Then("Kullanici gonder butonuna tiklar.")
    public void kullanici_gonder_butonuna_tiklar() {

        ReusableMethod.scrooltoWebelement(procennePage.sayfaIndirme);
        jsx.executeScript("arguments[0].click();", procennePage.gonderButonu);

    }
}

