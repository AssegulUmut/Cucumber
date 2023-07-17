Feature: US1005 Pozitif login testi

  Scenario: TC09 kullanici dogru degerlerle uygulamaya giris yapabilmeli

    Given kullanici "qdUrl" anasayfaya gider
    Then anasayfada login linkine click yapar
    And email kutusuna "gecerliUsername" yazar
    And password kutusuna "gecerliPassword" yazar
    When login butonuna basar
    Then basarili olarak giris yapildigini test eder