package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoQAPage {

   public DemoQAPage(){ PageFactory.initElements(Driver.getDriver(),this);}

   @FindBy(xpath ="(//div[@class='avatar mx-auto white'])[2]")
   public WebElement formButonu;

   @FindBy(xpath ="(//li[@id='item-0'])[2]")
   public WebElement practiceForm;

   @FindBy(xpath ="//label[@for='gender-radio-2']")
   public WebElement femaleButonu;

   @FindBy(xpath ="(//input[@class=' mr-sm-2 form-control'])[1]")
   public WebElement isimKutusu;

   @FindBy(xpath ="//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
   public WebElement subjectKutusu;

   @FindBy(xpath ="(//label[@class='custom-control-label'])[5]")
   public WebElement hobiKutucugu;

   @FindBy(xpath ="//input[@id='dateOfBirthInput']")
   public WebElement select;

   @FindBy(xpath ="//textarea[@id='currentAddress']")
   public WebElement adressButonu;

   @FindBy(xpath ="//select[@class='react-datepicker__month-select']")
   public WebElement tarihAySelect;

   @FindBy(xpath ="//select[@class='react-datepicker__year-select']")
   public WebElement tarihYilSelect;

   @FindBy(xpath ="//div[@class='react-datepicker__day react-datepicker__day--011']")
   public WebElement tarihGunSelect;

   @FindBy(xpath ="(//div[@class=' css-1wy0on6'])[1]")
   public WebElement state;

   @FindBy(xpath ="(//div[@class=' css-1wy0on6'])[2]")
   public WebElement city;

   @FindBy(xpath ="(//label[@class='form-label'])[9]")
   public WebElement stateBuradan;

   @FindBy(xpath ="//button[@id='submit']")
   public WebElement submit;

   @FindBy(xpath ="//input[@id='uploadPicture']")
   public WebElement resim;

   @FindBy(xpath = "//*[contains(@class, 'form-control-file')]")
   public WebElement uploadPicture;






}
