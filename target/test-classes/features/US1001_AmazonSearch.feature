# uc Scenario olusturunuz

# kullanici amazon sayfasında
# kullanici Nutella icin arama yapar
# sonuclarin Nutella icerdigini test eder
# Sayfayı kapatir

# kullanici amazon anasayfasinda
# kullanici Java icin arama yapar
# sonuclarin Java icerdigini test eder
# Sayfayi kapatir

# kullanici amazon anasayfasinda
# kullanici iphone icin arama yapar
# sonuclarin iphone icerdigini test eder
# sayfayi kapatir

  Feature: US1001 Kullanici Amazon sayfasinda arama yapar

    @nutella
    Scenario: TC01 Kullanici Amazonda Nutella aratir
      Given Kullanici Amazon sayfasinda
      When Kullanici Nutella icin arama yapar
      And Sonuclarin Nutella icerdigini test eder
      And Sayfayi kapatir

      @java
      Scenario: TC02 Kullanici Java Nutella aratir
        Given Kullanici Amazon sayfasinda
        When Kullanici Java icin arama yapar
        And Sonuclarin Java icerdigini test eder
        And Sayfayi kapatir

