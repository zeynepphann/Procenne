@procenne
Feature: Procenne adresinin ui testleri

  Scenario: Kullanici Procenne adresinin iletisim bilgilerini doldurur
  Given Kullanici procenneUrl adresine gider.
  Then Kullanici Iletisim butonuna tiklar.
  And Kullanici sayfanin asagisindaki Bize Ulasin kutucugundaki gerekli alanlari doldurur.
  And Kullanici checkbox'lari isaretler.
  Then Kullanici gonder butonuna tiklar.
