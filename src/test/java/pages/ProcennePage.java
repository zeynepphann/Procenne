package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProcennePage {

    public ProcennePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='inline-block text-base text-gray-dark hover:text-primary']")
    public WebElement iletisimButonu;

    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement isimButonu;

    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement soyIsimButonu;

    @FindBy(xpath = "//input[@name='company']")
    public WebElement companyButonu;

    @FindBy(xpath = "(//input[@name='email'])[1]")
    public WebElement emailButonu;

    @FindBy(xpath = "(//input[@class='mr-2'])[1]")
    public WebElement checkbox1;

    @FindBy(xpath = "(//input[@class='mr-2'])[2]")
    public WebElement checkbox2;

    @FindBy(xpath = "(//a[@target='_blank'])[17]")
    public WebElement indirmeButton1;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement okudumButton1;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement okudumButton2;

    @FindBy(xpath = "(//a[@target='_blank'])[17]")
    public WebElement indirmeButton2;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement messageButonu;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement gonderButonu;

    @FindBy(xpath = "(//label[@class='text-xs md:text-sm'])[2]")
    public WebElement sayfaIndirme;









}
