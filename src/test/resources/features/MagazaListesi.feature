@Magaza
Feature: Kullanıcı Mağaza Ekleyip Silebilmelidir ve gerekli düzenlemeleri yapabilmelidir.

  Scenario: Kullanıcı Mağaza Ekleyebilmeli ve düzenleyebilmeli


    Given User navigates to Login Page
    When User types valid "username" and "password"
    And User click to login button
    When Kullanıcı "Mağazalar" ı tıklar
    Then Kullanıcı "Mağaza Listesi" ni tıklar
    Then Kullanıcı Mağaza Ekle butonuna tıklar
    Then Kullanıcı Mağaza kodu olarak "Herhangi  test bir kod" mağaza ismi olarark "Hehangi bir test magaza adı" girer
    And Şirket olarak "ERK PAZARLAMA VE GİYİM SAN. TİC. A.Ş" yı tıklar
    And Bölge olarak "3. BÖLGE" yi tıklar
    And Alan olarak "KARADENİZ ALAN" yi tıklar
    And Mersis No olarak "654321" girer
    And Kullanıcı "adres" ve "telefon" girer
    And Perakende Kanalı olarak "OOS" seçer
    And İl olarak "ADANA"
    And İlçe olarak "YUMURTALIK" seçer
    Then Kullanıcı kaydet i tıklar
    Then Kullanıcı "İşlem Başarılı" mesajını görür
    Then Kullanıcı yeni mağazasını görür
    Then Kullanıcı "düzenle" butonunu tıklar
    Then Kullanıcı durumu pasife alır ve kaydete tıklar




  Scenario: Kullanıcı zrounlu olmayan alanlarıda doldurup  Mağaza Ekleyebilmeli ve düzenleyebilmeli


    Given User navigates to Login Page
    When User types valid "username" and "password"
    And User click to login button
    When Kullanıcı "Mağazalar" ı tıklar
    Then Kullanıcı "Mağaza Listesi" ni tıklar
    Then Kullanıcı Mağaza Ekle butonuna tıklar
    Then Kullanıcı Mağaza kodu olarak "Herhangi  test bir kod" mağaza ismi olarark "Hehangi bir test magaza adı" girer
    And Şirket olarak "ERK PAZARLAMA VE GİYİM SAN. TİC. A.Ş" yı tıklar
    And Bölge olarak "3. BÖLGE" yi tıklar
    And Alan olarak "KARADENİZ ALAN" yi tıklar
    And Açılıç tarihi olarak "18.02.2022" girer
    And Mersis No olarak "654321" girer
    And Kullanıcı farklı "email"  girer
    And Kullanıcı bir mağaza seçer
    And Kullanıcı "adres" ve "telefon1" girer
    And Perakende Kanalı olarak "OOS" seçer
    And İl olarak "ADANA"
    And İlçe olarak "YUMURTALIK" seçer
    And Açılış saati olarak "09:00" girer
    And Kapanış saati olarak "17:00" girer
    Then Kullanıcı kaydet i tıklar
    Then Kullanıcı "İşlem Başarılı" mesajını görür
    Then Kullanıcı yeni mağazasını görür
    Then Kullanıcı "düzenle" butonunu tıklar
    Then Kullanıcı durumu pasife alır ve kaydete tıklar


  Scenario: Kullanıcı Mağaza sayfaları arasında gezebilmeli

    Given User navigates to Login Page
    When User types valid "username" and "password"
    And User click to login button
    When Kullanıcı "Mağazalar" ı tıklar
    Then Kullanıcı "Mağaza Listesi" ni tıklar
    Then Kullanıcı mağaza sayfaları arasında gezebilmeli

    Scenario: Kullanıcı Ödeme Tiplerini Tıklayabilmeli ve Düzenleyebilmeli

      Given User navigates to Login Page
      When User types valid "username" and "password"
      And User click to login button
      When Kullanıcı "Mağazalar" ı tıklar
      Then Kullanıcı "Mağaza Listesi" ni tıklar
      Then Kullanıcı Ödeme Tipleri butonunu tıklar
      Then Kullanıcı Üye İş yeri girişine "11111" değeri girer
      Then Kullanıcı Kaydet utonunu tıklar

  Scenario: Kullanıcı Ödeme Tiplerini Tıklayabilmeli ve Düzenleyebilmeli

    Given User navigates to Login Page
    When User types valid "username" and "password"
    And User click to login button
    When Kullanıcı "Mağazalar" ı tıklar
    Then Kullanıcı "Mağaza Listesi" ni tıklar
    Then Kullanıcı Ödeme Tipleri butonunu tıklar
    Then Kullanıcı Üye İş yeri girişine "11111" değeri girer
    Then Kullanıcı ödeme tipi pasife alınır
    Then Kullanıcı Kaydet utonunu tıklar

  Scenario: Kullanıcı Ödeme Tiplerini Tıklayabilmeli ve İptal edebilmeli

    Given User navigates to Login Page
    When User types valid "username" and "password"
    And User click to login button
    When Kullanıcı "Mağazalar" ı tıklar
    Then Kullanıcı "Mağaza Listesi" ni tıklar
    Then Kullanıcı Ödeme Tipleri butonunu tıklar
    Then Kullanıcı Üye İş yeri girişine "22222" değeri girer
    Then Kullanıcı İptal butonunu tıklar


