# Davranışsal Tasarım Desenleri (Behavioral Patterns)

GoF davranışsal tasarım desenlerini Türkçe açıklamalar ve günlük hayattan seçilmiş Java örnekleriyle anlatan
eğitim deposu. Her desen klasöründe kısa bir anlatım (`README.md`) ve çalıştırılabilir bir örnek vardır.

> **Not:** Bu depo 2018 yılında eğitim amaçlı yazıldı ve artık güncellenmiyor.

## İçerik

| Klasör | Desen | Örnek senaryo |
|---|---|---|
| `chainofresponsibility` | Chain of Responsibility | Devlet dairesinde isteğin şef, şube müdürü ve müdür zincirinden geçmesi |
| `command` | Command | Hesap makinesi işlemlerinin komut nesnelerine dönüştürülmesi |
| `iterator` | Iterator | Personel listesi üzerinde dolaşma |
| `mediator` | Mediator | Uçakların birbirleriyle değil, kule üzerinden iniş izni alması |
| `memento` | Memento | Kişi nesnesinin önceki durumunu saklayıp geri alma |
| `observer` | Observer | Kiralık ev fiyatı değişince evi takip eden üyelere haber verilmesi |
| `state` | State | Açma/kapama düğmesinin cihazın durumuna göre davranması |
| `strategy` | Strategy | Logu dosyaya ya da veritabanına yazma; `ornek2` birden çok yöntemi birlikte kullanır |
| `templatemethod` | Template Method | Ortak veritabanı adımlarının soyut sınıfta, kayda özgü işlemlerin müşteri/ürün DAO'larında yapılması |
| `visitor` | Visitor | Bilgisayar parçalarına (fare, klavye, monitör) sınıfları değiştirmeden yeni işlem eklenmesi |

## Teknolojiler

- Java 8 (lambda ve stream kullanılır, dış bağımlılık yok)

## Çalıştırma

Her örneğin giriş noktası `com.mustafaergan.ornek1.Islem` sınıfıdır (Chain of Responsibility'de
`VatandasIslem`). Örneğin:

```bash
cd observer
javac -d out $(find src -name "*.java")
java -cp out com.mustafaergan.ornek1.Islem
```

Eclipse'te her klasörü *File > New > Java Project* ile ayrı bir proje olarak açıp `Islem` sınıfını
*Run As > Java Application* ile çalıştırabilirsiniz.
