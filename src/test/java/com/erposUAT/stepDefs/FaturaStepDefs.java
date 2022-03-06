package com.erposUAT.stepDefs;

import com.erposUAT.pages.FaturaPage;
import com.erposUAT.utilities.BrowserUtils;
import com.erposUAT.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class FaturaStepDefs {

    FaturaPage faturaPage=new FaturaPage();
    Faker fk = new Faker();
    WebDriver driver = Driver.get();


    @When("Kullanıcı home butonuna tıklar")
    public void kullanıcı_home_butonuna_tıklar() {
        BrowserUtils.waitFor(1);

        faturaPage.header.click();
        BrowserUtils.waitFor(1);

        faturaPage.homePage.click();
    }

    @When("Kullanıcı satış iade butonunu tıklar")
    public void kullanıcı_satış_iade_butonunu_tıklar() {
        BrowserUtils.waitFor(1);
        faturaPage.satişIade.click();
    }

    @When("Kullanıcı {string} hehangi bir barkod girer ve ara butonuna tıklar")
    public void kullanıcı_hehangi_bir_barkod_girer_ve_ara_butonuna_tıklar(String barkod) {
        BrowserUtils.waitFor(1);
        faturaPage.müsteriSecPOPup.click();
        faturaPage.barkodGir.sendKeys(barkod+ Keys.ENTER);
       // faturaPage.araBarkod.click();
    }

    @When("Kullanıcı Personel adı olarak {string} ve soyad olarak {string} girer ve çıkan ismi tıklar")
    public void kullanıcı_Personel_adı_olarak_ve_soyad_olarak_girer_ve_çıkan_ismi_tıklar(String ad, String soyad) {
        BrowserUtils.waitFor(1);
      faturaPage.personelAdi.sendKeys(ad);
      faturaPage.personelSoyadi.sendKeys(soyad);
      faturaPage.listedekiAd.click();
    }

    @When("Kullanıcı ödemeYapı tıklar")
    public void kullanıcı_ödemeYapı_tıklar() {
        BrowserUtils.waitFor(1);
        faturaPage.odemeYap.click();
    }

    @When("Kullanıcı girilen tutarı girer")
    public void kullanıcı_girilen_tutarı_girer() {
        BrowserUtils.waitFor(5);
        faturaPage.girilenTutar.click();
    }

    @When("Kullanıcı Nakiti tıklar")
    public void kullanıcı_Nakiti_tıklar() {
        BrowserUtils.waitFor(1);
        faturaPage.nakit.click();
    }

    @When("Kullanıcı GSM numarısını vermediyi tıklar")
    public void kullanıcı_GSM_numarısını_vermediyi_tıklar() {
        BrowserUtils.waitFor(1);
       faturaPage.GSMVerilmedi.click();
    }

    @When("Kullanıcı Fatura Ad {string} ve soad {string} girer")
    public void kullanıcı_Fatura_Ad_ve_soad_girer(String ad, String soyad) {
        BrowserUtils.waitFor(1);
        faturaPage.faturaAdi.sendKeys(ad);
        faturaPage.faturaSoyadi.sendKeys(soyad);
    }

    @When("Kullanıcı adres girer")
    public void kullanıcı_adres_girer() {
        BrowserUtils.waitFor(1);
        faturaPage.faturaAdres.sendKeys(fk.address().fullAddress());
    }

    @Then("Kullanıcı Tamamla tuşuna basar")
    public void kullanıcı_Tamamla_tuşuna_basar() {
        BrowserUtils.waitFor(1);
               faturaPage.faturaTamamla.click();
        BrowserUtils.waitFor(1);
       faturaPage.evetSatış.click();
        BrowserUtils.waitFor(1);
        faturaPage.yeniSipariş.click();
    }
    @And("Kullanıcı çıkan popupı kapatır")
    public void kullanıcıÇıkanPopupıKapatır() {
        faturaPage.müsteriSecPOPup.click();
    }
    @And("Kullanıcı Fatura Aramayı Tıklar")
    public void kullanıcıFaturaAramayıTıklar() {

        BrowserUtils.waitFor(1);

        faturaPage.faturaArama.click();
    }

    @And("Kullanıcı Finansı Tıklar")
    public void kullanıcıFinansıTıklar() {
        BrowserUtils.waitFor(1);
        faturaPage.Finans.click();

    }

    @And("Kullanıcı Fatura Listesini Tıklar")
    public void kullanıcıFaturaListesiniTıklar() {
        BrowserUtils.waitFor(1);
        faturaPage.FaturaListesi.click();
    }



        @And("Kullanıcı günün tarihini gün {string} ay {string} yıl {string} girer")
        public void kullanıcıGününTarihiniGünAyYılGirer(String gun, String ay, String yıl) throws AWTException {
            //faturaPage.setDate("02", "03", "2022");
            faturaPage.setDate(gun, ay, yıl);
            faturaPage.header.click();

        }



    @And("Kullanıcı filtreleme yapar")
    public void kullanıcıFiltrelemeYapar() {
        faturaPage.filtrele.click();
    }


    @And("Kullanıcı Faturayı seçer")
    public void kullanıcıFaturayıSeçer() {
        BrowserUtils.waitFor(1);
        faturaPage.faturakutucuk.click();

    }


    @And("Kullanıcı Faturayı siler")
    public void kullanıcıFaturayıSiler() {
        BrowserUtils.waitFor(1);
        faturaPage.sil.click();
        BrowserUtils.waitFor(1);
    }

    @Then("Kullanıcı acıklama kısmına {string} yazar ve evet tuşunu tıklar")
    public void kullanıcıAcıklamaKısmınaYazarVeEvetTuşunuTıklar(String acıklama) {
       faturaPage.acıklama.click();
        faturaPage.acıklama.sendKeys(acıklama);
        BrowserUtils.waitFor(1);
        faturaPage.onayla.click();
        BrowserUtils.waitFor(3);

    }



}