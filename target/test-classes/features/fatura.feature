@fatura
Feature: Kullanıcı müşteriye satış yapıp fatura keser

  Scenario:  Kullanıcı sistemde kayıtlı olmayan müşteriye fatura keser
    Given User navigates to Login Page
    When User types valid "username" and "password"
    And User click to login button
    And Kullanıcı home butonuna tıklar
    And Kullanıcı satış iade butonunu tıklar
    And Kullanıcı "5940000033705" hehangi bir barkod girer ve ara butonuna tıklar
    And Kullanıcı Personel adı olarak "Hayriye" ve soyad olarak "Yılmaz" girer ve çıkan ismi tıklar
    And Kullanıcı ödemeYapı tıklar
    And Kullanıcı girilen tutarı girer
    And Kullanıcı Nakiti tıklar
    And Kullanıcı GSM numarısını vermediyi tıklar
    And Kullanıcı Fatura Ad "Hayriye" ve soad "Yılmaz" girer
    And Kullanıcı adres girer
    Then Kullanıcı Tamamla tuşuna basar
    And Kullanıcı çıkan popupı kapatır
    And Kullanıcı home butonuna tıklar
    And Kullanıcı Fatura Aramayı Tıklar
    And Kullanıcı günün tarihini gün "06" ay "03" yıl "2022" girer
    And Kullanıcı filtreleme yapar
    And Kullanıcı Faturayı seçer
    And Kullanıcı Faturayı siler
    Then Kullanıcı acıklama kısmına "Deneme Amaçlıdır" yazar ve evet tuşunu tıklar


  Scenario: Kullanıcı olşturduğu faturayı Siler
    Given User navigates to Login Page
    When User types valid "username" and "password"
    And User click to login button
    And Kullanıcı Finansı Tıklar
    And Kullanıcı Fatura Listesini Tıklar
    And Kullanıcı günün tarihini gün "06" ay "03" yıl "2022" girer
    And Kullanıcı filtreleme yapar
    And Kullanıcı Faturayı seçer
    And Kullanıcı Faturayı siler
    Then Kullanıcı acıklama kısmına "Deneme Amaçlıdır" yazar ve evet tuşunu tıklar