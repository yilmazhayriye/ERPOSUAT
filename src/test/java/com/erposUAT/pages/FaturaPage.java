package com.erposUAT.pages;

import com.erposUAT.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FaturaPage extends BasePage{

    @FindBy(xpath = "//button[@class='close fa fa-window-close closemodalbg']")
    public WebElement müsteriSecPOPup;

    @FindBy(xpath = "//input[@id='barcodeproduct']")
    public WebElement barkodGir;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement araBarkod;
    @FindBy(xpath = "(//input[@class='k-textbox'])[1]")
    public WebElement personelAdi;
    @FindBy(xpath = "(//input[@class='k-textbox'])[2]")
    public  WebElement personelSoyadi;
    @FindBy(xpath = "//td[contains(text(),'Hayriye')]")
    public WebElement listedekiAd;
    @FindBy(xpath = "//button[@id='sendInvoice']")
    public  WebElement odemeYap;
  // @FindBy(xpath = "//div[@class='fas fa-angle-double-right colorblue pt-3 fa-lg']")
   @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]")
    public  WebElement girilenTutar;
    @FindBy(xpath = "//button[contains(text(),'Nakit')]")
    public WebElement nakit;
    @FindBy(xpath = "//input[@name='isGsmDisabled']")
    public WebElement GSMVerilmedi;
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement faturaAdi;
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement faturaSoyadi;
    @FindBy(xpath = "//textarea[@id='adressLine']")
    public WebElement faturaAdres;
    @FindBy(xpath = "//button[contains(text(),'Tamamla')]")
    public WebElement faturaTamamla;
    @FindBy(xpath = "//button[contains(text(),'Evet')]")
    public  WebElement evetSatış;
    @FindBy(xpath = "//button[contains(text(),'Yeni Sipariş')]")
    public  WebElement yeniSipariş;
    @FindBy(xpath = "//span[contains(text(),'Finans')]")
    public  WebElement Finans;
    @FindBy(xpath = "//span[contains(text(),'Fatura Listesi')]")
    public  WebElement FaturaListesi;
   @FindBy(xpath = "(//input[@role='spinbutton'])[1]")
    //@FindBy(xpath = "(//span[@class='k-widget k-dateinput'])[1]")
    public  WebElement tarihFatura;
    @FindBy(xpath = "(//input[@role='spinbutton'])[2]")
    public  WebElement tarihFatura2;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public  WebElement filtrele;
    @FindBy(xpath = "//td//input[@type='checkbox']")
    public  WebElement faturakutucuk;
    @FindBy(css="div.hot-keys-viewport div.wrapper section.section-container div.content-wrapper div.row:nth-child(2) div.col-md-12 div.card-default.cardGrid.card div.card-header div.row div.col-md-12 div.row.form-group:nth-child(3) div.col-md-4:nth-child(4) div.d-flex.flex-row-reverse div.btn-group > button.btn.btn-danger:nth-child(6)")
    public  WebElement sil;
    @FindBy(xpath = "//header/nav[1]")
    public  WebElement header;
    @FindBy(xpath = "//input[@name='description']")
    public  WebElement acıklama;
    @FindBy(xpath = "//button[contains(text(),'Evet')]")
    public  WebElement onayla;
    @FindBy(xpath = "//button[contains(text(),'Fatura Arama')]")
    public  WebElement faturaArama;


//div[@class='k-animation-container k-animation-container-relative k-animation-container-shown']

    public void setDate(String gun, String ay,String yıl) throws AWTException {
        Robot robot= new Robot();

        robot.delay(2000);
        tarihFatura.click();
        tarihFatura.sendKeys(ay);
        //BrowserUtils.waitFor(2);
        robot.keyPress(KeyEvent.VK_RIGHT);
        tarihFatura.sendKeys(yıl);
       // BrowserUtils.waitFor(2);
        robot.keyPress(KeyEvent.VK_LEFT);
        tarihFatura.sendKeys(ay);
        robot.keyPress(KeyEvent.VK_LEFT);
        tarihFatura.sendKeys(gun);


        tarihFatura2.click();
        tarihFatura2.sendKeys(ay);
       BrowserUtils.waitFor(1);
        robot.keyPress(KeyEvent.VK_RIGHT);
        tarihFatura2.sendKeys(yıl);
        BrowserUtils.waitFor(1);
        robot.keyPress(KeyEvent.VK_LEFT);
        tarihFatura2.sendKeys(ay);
        robot.keyPress(KeyEvent.VK_LEFT);
        tarihFatura2.sendKeys(gun);

    }
}
