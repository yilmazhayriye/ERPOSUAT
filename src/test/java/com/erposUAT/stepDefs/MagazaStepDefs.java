package com.erposUAT.stepDefs;

import com.erposUAT.pages.MagazaPage;
import com.erposUAT.utilities.BrowserUtils;
import com.erposUAT.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class MagazaStepDefs {
    MagazaPage magazaPage = new MagazaPage();
    Faker fk = new Faker();
    String yeniMagaza;

    @Given("Kullanıcı {string} ı tıklar")
    public void kullanıcı_ı_tıklar(String string) {
        BrowserUtils.waitFor(1);
        magazaPage.MagazalarMenu(string);

    }

    @Then("Kullanıcı {string} ni tıklar")
    public void kullanıcıNiTıklar(String arg0) {
        BrowserUtils.waitFor(1);
        magazaPage.MagazalarMenu("Mağaza Listesi");
    }

    @Then("Kullanıcı Mağaza Ekle butonuna tıklar")
    public void kullanıcı_Mağaza_Ekle_butonuna_tıklar() {
        BrowserUtils.waitFor(1);
        magazaPage.mağazaEkle.click();
        BrowserUtils.waitFor(1);
    }

    @Then("Kullanıcı Mağaza kodu olarak {string} mağaza ismi olarark {string} girer")
    public void kullanıcı_Mağaza_kodu_olarak_mağaza_ismi_olarark_girer(String kodu, String adı) {


       yeniMagaza= magazaPage.setMagazalar(kodu,adı);
     //   magazaPage.mağazaKodu.sendKeys(fk.numerify("Test##Test"));

      // yeniMagaza=fk.bothify("Test##?? AVM");

      //  magazaPage.mağazaAdı.sendKeys(yeniMagaza);
        System.out.println(yeniMagaza);

    }

    @Then("Şirket olarak {string} yı tıklar")
    public void şirket_olarak_yı_tıklar(String sirketİsim) {
        BrowserUtils.waitFor(1);
      //  magazaPage.sirket.click();
        magazaPage.sirket.sendKeys(sirketİsim);
    }

    @Then("Bölge olarak {string} yi tıklar")
    public void bölge_olarak_yi_tıklar(String bölgeİsim) {
        BrowserUtils.waitFor(1);
        magazaPage.bölge.sendKeys(bölgeİsim);
        magazaPage.bölge.click();
    }

    @Then("Alan olarak {string} yi tıklar")
    public void alan_olarak_yi_tıklar(String alan1) {
        BrowserUtils.waitFor(1);
        magazaPage.alan.sendKeys(alan1);
    }
    @And("Açılıç tarihi olarak {string} girer")
    public void açılıçTarihiOlarakGirer(String tarih) {
BrowserUtils.waitFor(1);
        //magazaPage.acılısTarihi.click();
      //  magazaPage.acılısTarihi2.sendKeys(tarih + Keys.ENTER);
       // magazaPage.tarihsaatAyarla(tarih);
          //  magazaPage.acılısTarihi2.click();
           //DateFormat df = new SimpleDateFormat("7.02.2022");
          // Date dateObj = new Date();

      String day="22";
      String month="05";
      String year="2022";

        //Actions actions=new Actions(Driver.get());
        //actions.moveToElement(magazaPage.acılısTarihi5).perform();
       // Driver.get().switchTo().frame(magazaPage.acılısTarihi2);
       // BrowserUtils.clickWithJS(magazaPage.acılısTarihi2);
        BrowserUtils.clickWithJS(magazaPage.acılısTarihi5);

        //System.out.println("magazaPage.acılısTarihi3.getText() = " + magazaPage.dayLocator.getText());
       // magazaPage.acılısTarihi3.sendKeys(day+Keys.TAB + month+Keys.TAB + year+Keys.ENTER);
       // Driver.get().switchTo().window(Driver.get().getWindowHandle());
         //  magazaPage.acılısTarihi3.sendKeys(day+ Keys.TAB && month+Keys.TAB && year+Keys.ENTER);

        //magazaPage.acılısTarihi5.click();


    }

    @Then("Mersis No olarak {string} girer")
    public void mersis_No_olarak_girer(String mersisno) {

        BrowserUtils.waitFor(1);
        magazaPage.MeersisNo.sendKeys(mersisno);
    }
    @And("Kullanıcı farklı {string}  girer")
    public void kullanıcıFarklıGirer(String email) {
      BrowserUtils.waitFor(1);
        magazaPage.setEmail(email);
    }
    @And("Kullanıcı bir mağaza seçer")
    public void kullanıcıBirMağazaSeçer() {
     //   magazaPage.bankaSec.sendKeys("Halk Bankası");
    }

    @Then("Kullanıcı {string} ve {string} girer")
    public void kullanıcı_ve_girer(String adres, String tel) {
        BrowserUtils.waitFor(1);
        magazaPage.setAdres(adres,tel);
    }

    @Then("Perakende Kanalı olarak {string} seçer")
    public void perakende_Kanalı_olarak_seçer(String kanal) {
        BrowserUtils.waitFor(1);
        magazaPage.perakende.sendKeys(kanal);
    }

    @Then("İl olarak {string}")
    public void i̇l_olarak(String il) {
        BrowserUtils.waitFor(1);
        magazaPage.ilSec.sendKeys(il);
    }

    @Then("İlçe olarak {string} seçer")
    public void i̇lçe_olarak_TALAS_seçer(String ilce) {
        BrowserUtils.waitFor(1);
        magazaPage.ilceSec.sendKeys(ilce+ Keys.ENTER);

    }
    @And("Açılış saati olarak {string} girer")
    public void açılışSaatiOlarakGirer(String saatxx) {
        String saat="09";
        String dakika="10";
        Driver.get().switchTo().window(Driver.get().getWindowHandle());
        magazaPage.acılısSaaati.sendKeys(Keys.LEFT+ dakika+Keys.TAB);
        magazaPage.acılısSaaati.sendKeys( saat+Keys.TAB+ Keys.ENTER);

       // magazaPage.acılısSaaati.sendKeys(saat+Keys.ENTER );
        BrowserUtils.waitFor(2);
    }

        @And("Kapanış saati olarak {string} girer")
        public void kapanışSaatiOlarakGirer(String saatyy) {
        String saat="16";
        String dakika="10";

       // magazaPage.kapanısSaaati.sendKeys(Keys.ENTER);
            Driver.get().switchTo().window(Driver.get().getWindowHandle());
        magazaPage.kapanısSaaati.sendKeys(saat+ Keys.TAB + dakika+Keys.LEFT_SHIFT);


}

    @Then("Kullanıcı kaydet i tıklar")
    public void kullanıcı_kaydet_i_tıklar() {
        BrowserUtils.waitFor(3);
       magazaPage.Kaydet.click();

      //  BrowserUtils.scrollToElement(magazaPage.Kaydet);
       // BrowserUtils.clickWithJS(magazaPage.Kaydet);
       // BrowserUtils.waitFor(3);
       // magazaPage.Kaydet.click();
    }


    @Then("Kullanıcı {string} mesajını görür")
    public void kullanıcıMesajınıGörür(String mesaj) {
        //Assert.assertEquals(mesaj,magazaPage.islemBasarılıPopUP.getText());

    }


    @Then("Kullanıcı yeni mağazasını görür")
    public void kullanıcıYeniMağazasınıGörür() {
        magazaPage.magazaAdıFiltrele.sendKeys(yeniMagaza+Keys.ENTER);
        //magazaPage.bölgedrodown.click();
       // magazaPage.ucuncubölge.click();

        System.out.println(yeniMagaza);

    }

    @Then("Kullanıcı {string} butonunu tıklar")
    public void kullanıcıButonunuTıklar(String arg0) {

       BrowserUtils.waitFor(1);
       BrowserUtils.clickWithJS( magazaPage.magazaDuzenleloc);
    }

    @Then("Kullanıcı durumu pasife alır ve kaydete tıklar")
    public void kullanıcıDurumuPasifeAlırVeKaydeteTıklar() {
        BrowserUtils.waitFor(1);
        magazaPage.pasifeAl.click();
        BrowserUtils.waitFor(1);
        magazaPage.Kaydet2.click();
    }


    @Then("Kullanıcı mağaza sayfaları arasında gezebilmeli")
    public void kullanıcıMağazaSayfalarıArasındaGezebilmeli() {

        magazaPage.magazalarSayfa();
    }


    @Then("Kullanıcı Ödeme Tipleri butonunu tıklar")
    public void kullanıcıÖdemeTipleriButonunuTıklar() {
        BrowserUtils.waitFor(1);
        magazaPage.ödemeTipleri.click();
        BrowserUtils.waitFor(1);
        magazaPage.ödemetipidüzenle.click();
    }

    @Then("Kullanıcı Üye İş yeri girişine {string} değeri girer")
    public void kullanıcıÜyeİşYeriGirişineDeğeriGirer(String üyeIsyeri) {
        BrowserUtils.waitFor(1);
        magazaPage.üyeIsyeri.sendKeys(üyeIsyeri);

    }

    @Then("Kullanıcı Kaydet utonunu tıklar")
    public void kullanıcıKaydetUtonunuTıklar() {
        BrowserUtils.waitFor(1);
        magazaPage.ödemetipikaydet.click();

    }

    @Then("Kullanıcı İptal butonunu tıklar")
    public void kullanıcıİptalButonunuTıklar() {
        BrowserUtils.waitFor(1);
        magazaPage.ödemeTipiİptal.click();
    }

    @Then("Kullanıcı ödeme tipi pasife alınır")
    public void kullanıcıÖdemeTipiPasifeAlınır() {
        BrowserUtils.waitFor(1);
        magazaPage.ödemeTipiPasifeAl.click();
    }


}
