Feature: US1002 Kullanici Background kullanarak amazonda istedigi aramalari yapar
  #Senario'lardai ortak baslangic adimlari icin kullanilir


  Background:
    Given kullanici amazon anasayfaya gider


  Scenario: TC04 Kullanici amazonda Nutella arayabilmeli
    Then arama kutusuna Nutella yazip, ENTER tusuna basar
    And arama sonuclarinin Nutella icerdigini tets eder
    And sayfayi kapatir



  Scenario: TC05 Kullanici amazonda Samsung aratabilmeli
    Then arama kutusuna Samsung yazip, ENTER tusuna basar
    And arama sonuclarinin Samsung icerdigini tets eder
    And sayfayi kapatir


  Scenario: TC06 Kullanici amazonda Java aratabilmeli
    Then arama kutusuna Samsung yazip, ENTER tusuna basar
    And arama sonuclarinin Java icerdigini tets eder
    And sayfayi kapatir