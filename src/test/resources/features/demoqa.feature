@demoqa
Feature: Demoqa adresinin ui testleri

  Scenario: Kullanici Demoqa adresinde gerekli formu doldurur
  Given Kullanici Demoqa adresine gider
  And Kullanici ana sayfada Forms secenegini secer
  And Kullanici sol tarafta yer alan Practice Form secenegine secer
  Then Kullanici sayfada yer alan kisisel bilgileri doldurur
  And Kullanici resim yukler
  And Kullanici adresi secer

