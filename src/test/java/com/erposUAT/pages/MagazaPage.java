package com.erposUAT.pages;

import com.github.javafaker.Faker;
import com.erposUAT.utilities.BrowserUtils;
import com.erposUAT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Locale;

public class MagazaPage extends BasePage {

    Faker fk = new Faker();


    @FindBy(xpath = "//span[contains(text(),'Mağazalar')]")
    public WebElement mağazalar;

    @FindBy(xpath = "//span[contains(text(),'Mağaza Listesi')]")
    public WebElement mağazaListesi;

    @FindBy(xpath = "//button[@class='btn-labeled btn btn-info']")
    public WebElement mağazaEkle;

    @FindBy(xpath = "//input[@name='code']")
    public WebElement mağazaKodu;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement mağazaAdı;


    @FindBy(xpath = "//textarea[@name='address']")
    public WebElement adress;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement telefon;
    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;

    @FindBy(xpath = "//button[@class='btn btn-green']")
    public WebElement Kaydet;
    @FindBy(xpath = "//input[@name='mersisNo']")
    public WebElement MeersisNo;
    @FindBy(xpath = "(//span[@class='k-searchbar'])[1]/input")
    public WebElement sirket;
    @FindBy(xpath = "(//span[@class='k-searchbar'])[3]/input")
    public WebElement bölge;
    @FindBy(xpath = "(//span[@class='k-searchbar'])[4]/input")
    public WebElement alan;
    @FindBy(xpath = "(//span[@class='k-searchbar'])[6]/input")
    public WebElement perakende;
    @FindBy(xpath = "(//span[@class='k-searchbar'])[7]/input")
    public WebElement ilSec;
    @FindBy(xpath = "(//span[@class='k-searchbar'])[8]/input")
    public WebElement ilceSec;
    @FindBy(xpath = "//div[text()='İşlem Başarılı']")
    public  WebElement islemBasarılıPopUP;

    @FindBy(xpath = "//td[text()='TEST10102']//..//td[8]//div//button[1])[1]")
    public WebElement magazaDüzenle;
    @FindBy(xpath = "//span[@class='k-switch-container'] ")
    public  WebElement pasifeAl;

    @FindBy(xpath = "//button[contains(text(),'Kaydet')]")
    public WebElement Kaydet2;
    @FindBy(xpath = "//thead/tr[2]/th[5]/div[1]/div[1]/input[1]")
    public WebElement ilFiltrele;

    @FindBy(xpath ="(//span[@class='k-input'])[1]")  //"(//span[@class='k-icon k-i-arrow-s'])[1]"
    public  WebElement bölgedrodown;
    @FindBy(xpath = "//thead/tr[2]/th[6]")
    public WebElement ucuncubölge;

    @FindBy(xpath = "//thead/tr[2]/th[2]/div[1]/div[1]/input[1]")
    public WebElement magazaAdıFiltrele;

    @FindBy(xpath = "//button[contains(text(),'Mağaza Düzenleme')]")
    public WebElement magazaDuzenleloc;

    @FindBy(xpath = "(//span[@class='k-icon k-i-clock'])[1]")
    public WebElement acılısSaati;

    @FindBy(xpath = "(//span[@class='k-icon k-i-clock'])[2]")
    public WebElement kapanısSaati;


    @FindBy(xpath = "//span//a[@class='k-select k-select']")
    public WebElement acılısTarihi5;
    @FindBy(xpath = "//div//span[@class='k-icon k-i-calendar']")
    public WebElement acılısTarihi4;
    @FindBy(xpath = "(//span//input[@class='k-input'])[5]")
   public WebElement acılısTarihi3;
   // @FindBy(xpath = "//a[@title='Takvimi Aç/Kapat']")
    @FindBy(xpath = "(//div//span[@class='k-widget k-dateinput'])[1]")
    public WebElement acılısTarihi;
    @FindBy(xpath = "//div//span[@class='k-picker-wrap k-picker-wrap']")
    public WebElement acılısTarihi2;
    @FindBy(xpath = "(//span//input[@role='spinbutton'])[2]")
    public WebElement acılısSaaati;
    @FindBy(css = "#a11fd007-a5bf-4ba6-ac4e-6c18cb146d39")
    public WebElement dayLocator;

    @FindBy(xpath = "(//span//input[@role='spinbutton'])[3]")
    public WebElement kapanısSaaati;
    //  (//td[text()='TEST10102']//..//td[8]//div//button[1])[1] ??


    //(//span[@class='k-searchbar'])[5]/input= search barların locatırları

   // @FindBy(xpath = "//button[contains(text(),'Ödeme Tipleri')]")
    @FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/button[3]")
    public WebElement ödemeTipleri;

   // @FindBy(xpath = "//button[contains(text(),'Ödeme Tipleri')]")
    @FindBy(xpath = "//tbody/tr[1]/td[6]/button[1]")
    public  WebElement ödemetipidüzenle;

    @FindBy(xpath = "(//input[@class='k-textbox'])[9]")
    public WebElement üyeIsyeri;
    @FindBy(xpath = "//button[@class='btn btn-success']")
    public  WebElement ödemetipikaydet;
    @FindBy(xpath = "//button[@class='mr-auto btn btn-danger']")
    public WebElement ödemeTipiİptal;
    @FindBy(xpath = "(//td//input[@type='checkbox'])[2]")
    public WebElement ödemeTipiPasifeAl;
    @FindBy(xpath = "(//span[@class='k-icon k-i-arrow-s'])[7]")
    public WebElement bankaSec;


    public void tarihsaatAyarla( String Tarih){

      //  WebElement element = Driver.get().findElement(By.xpath("//input[@value='" + Tarih + "']"));
        //element.

         Driver.get().switchTo().frame(acılısTarihi);

    }

    public void MagazalarMenu(String menu) {

        WebElement element = Driver.get().findElement(By.xpath("//span[contains(text(),'"+menu+"')]"));
        BrowserUtils.waitFor(1);
        element.click();
    }


    public void magazaDüzenle(String magazaAdı){
        WebElement element=Driver.get().findElement(By.xpath("(//td[text()='"+magazaAdı+"']//..//..//td[8]//div//button[1])[1] "));
        BrowserUtils.waitFor(1);
       //BrowserUtils.scrollToElement(element);
       BrowserUtils.clickWithJS(element);
       //"(//td[contains(text(),'"+magazaAdı+"')]//..//td[8]//div//button[1])[1]"
        //"(//td[text()='"+magazaAdı+"']//..//..//div//button)[1]"
       //(//td[text()='TEST84DE AVM']//..//..//div//button)[1]
       // (//td[text()='TEST84DE AVM']//..//..//td[8]//div//button[1])[1] hem bu hem bunu nul diye ikili logic kullanıcaz
        ////ul[@class='k-pager-numbers k-reset']//li sayfa geçişi için for döngüsü kullan

    }

    public void magazalarSayfa(){

        List<WebElement> pages = Driver.get().findElements(By.xpath("//ul[@class='k-pager-numbers k-reset']//li"));


        int pageSize= pages.size();

        for (int i = 1; i < pageSize-1; i++) {

            BrowserUtils.waitFor(1);

            System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
            String sayfaNo= "(//ul[@class='k-pager-numbers k-reset']//li)["+i+"]";
            WebElement sayfa =Driver.get().findElement(By.xpath(sayfaNo));
           BrowserUtils.clickWithJS(sayfa);
           String safa2denSonra="(//a[@class='k-link'])["+i+"]";
           WebElement sayfa2denSonraLoc= Driver.get().findElement(By.xpath(safa2denSonra));
           BrowserUtils.clickWithJS(sayfa2denSonraLoc);
            System.out.println("sayfa.getText() = " + sayfa.getText());


        }




    }


  //  public void sirket(String sirket){


        /* WebElement element=Driver.get().findElement(By.xpath("//input[@value='"+sirket+"']"));
        BrowserUtils.waitFor(1);
        element.click();

    }*/


    public String setMagazalar(String magazaadı,String magazakodu1) {

       // mağazaKodu.sendKeys(magazakodu1);
        mağazaKodu.sendKeys(fk.numerify("Test##Test"));
       // mağazaAdı.sendKeys(magazaadı);
        magazaadı=fk.bothify("Test##?? AVM").toUpperCase(Locale.ROOT);
        mağazaAdı.sendKeys(magazaadı);

      return magazaadı;






    }
    public void setEmail(String email1) {
        BrowserUtils.waitFor(2);
        email.sendKeys(fk.internet().emailAddress());

      //  telefon.sendKeys(fk.phoneNumber().cellPhone());


    }
    public void setAdres(String adres,String tel) {
        BrowserUtils.waitFor(2);
        adress.sendKeys(fk.internet().emailAddress());
        telefon.sendKeys(fk.phoneNumber().cellPhone());


    }
}