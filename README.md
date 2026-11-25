# Biznet Mobil

Biznet web sitesinin bölümlerini WebView içinde açan üç küçük Android uygulaması. Her biri ayrı bir Android
Studio projesidir.

> **Not:** Bu depo 2017 yılında örnek amaçlı yazıldı ve artık güncellenmiyor. Android SDK, Gradle ve kütüphane
> sürümleri eskidir ve bilinen güvenlik açıkları içerir; üretimde kullanmayın.

## İçerik

| Klasör | Uygulama adı | Ne yapar |
|---|---|---|
| `web/` | Biznet | Sitenin ana sayfasını açar |
| `blog/` | Biznet Blog | Sitenin blog sayfasını açar |
| `alert/` | Biznet Güvenlik Duyuruları | Sitenin güvenlik duyuruları sayfasını açar |

Üç projede de tek ekran (`MainActivity`) vardır; JavaScript açık bir `WebView` ilgili adresi yükler ve
uygulama yalnızca `INTERNET` iznini ister. Adresler `MainActivity.java` içinde sabit yazılıdır.

## Teknolojiler

- Java, Android SDK 25 (minSdk 17), Android Support AppCompat 25.3.1
- Android Gradle Plugin 2.3.3, Gradle 3.3 (wrapper)

## Çalıştırma

1. Android Studio'da *Open* ile `web`, `blog` veya `alert` klasörünü açın.
2. Gradle eşitlemesi tamamlandıktan sonra uygulamayı bir emülatörde ya da cihazda çalıştırın.

Araç sürümleri çok eski olduğundan güncel Android Studio projeyi açarken Gradle ve eklenti sürümünü
yükseltmenizi isteyebilir. Adresler `http://` ile yazılıdır; `targetSdkVersion` 28 veya üzerine çıkarılırsa
adreslerin `https://` yapılması ya da açık metin trafiğine izin verilmesi gerekir.
