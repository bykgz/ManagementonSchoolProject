@all
Feature: US10 Vice Dean ders programı oluşturabilmelidir

  Background: Siteye gider
    Given kullanici "url" sayfasina gider
    When login linkine tiklar
    And User Name kutusuna veri girer
    And login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management linkine tıklar
    And lesson program butonuna tiklar


  Scenario: TC01 Ders programı olusturulmalidir.
    Given choose lesson kutusundan ders secimi yapar
    And dersin secilebildigini dogrular
    When  sayfayi kapatirMus

  Scenario: TC02 kullanici egitim donemi secebilmeli
    Given Choose Education Term kutusundan egitim donemi secimi yapar
    Then egitim doneminin secilebildigini dogrular
    When  sayfayi kapatirMus

  Scenario: TC03 kullanici ders icin gun secebilmeli
    Given Choose Day kutusundan ders icin gun secimi yapar
    Then ders gununun secilebildigini dogrular
    When  sayfayi kapatirMus

  Scenario: TC04 kullanici ders icin baslama ve bitis saati secebilmeli
    Given Start Time ve Stop Time kutularindan ders icin baslama ve bitis saati secimi yapar
    Then Start Time ve Stop Time kutularindan ders icin baslama ve bitis saati secimi yapabidigini dogrular
    When  sayfayi kapatirMus

#

#  Scenario: close driver deneme
#    Given  kullanici "url" sayfasina gider
#    When  sayfayi kapatirMus













