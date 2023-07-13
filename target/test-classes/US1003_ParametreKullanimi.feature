Feature: US1003 Amazonda parametre olarak urun arama

  Scenario:TC07 Parametre olarak girilen urun aratilabilmeli

    Given kullanici "amazonUrl" anasayfaya gider
    Then arama kutusuna "cokokrem" yazip, ENTER tusuna basar
    And arama sonuclarinin "cokokrem" icerdigini tets eder
    And  2 saniye bekler
    And sayfayi kapatir

    #step yazarken sayi kullanilirsa otomatik olarak parametre kabul eder