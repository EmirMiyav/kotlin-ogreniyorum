//Kodu yeniledim. actions kısmından eski yazılarıma ulaşabilirsin.


package com.ornek

import java.util.Scanner // kullanıcıdan veri almak için gerekli kütüphane

fun main() { // programın başlangıç noktası
    val girdi = Scanner(System.`in`) // kullanıcıdan veri almak için Scanner objesi oluşturuyoruz
    println("Dikdörtgen alanı (1)") // dikdörtgen alanı seçeneği
    println("Çember alanı (2)") // çember alanı seçeneği

    val secim = girdi.nextInt() // kullanıcının seçimini alıyoruz

    println("Seçiminiz $secim") // seçimi ekrana yazdırıyoruz

    if (secim == 1) { // eğer kullanıcı dikdörtgen alanını seçtiyse
        println("Kısa Kenar Giriniz.") // kısa kenar isteği
        val kisakenar = girdi.nextDouble() // kısa kenar değeri alınıyor
        println("Uzun Kenar Giriniz.") // uzun kenar isteği
        val uzunkenar = girdi.nextDouble() // uzun kenar değeri alınıyor
        val alan = kisakenar * uzunkenar // dikdörtgen alanı hesaplanıyor
        println("Dikdörtgen Alanı: $alan") // dikdörtgen alanı ekrana yazdırılıyor
    }

    if (secim == 2) { // eğer kullanıcı çember alanını seçtiyse
        println("Yarı Çap Giriniz.") // yarı çap isteği
        val yaricap = girdi.nextDouble() // yarı çap değeri alınıyor
        val alan = Math.PI * yaricap * yaricap // çember alanı hesaplanıyor
        println("Çember Alanı: $alan") // çember alanı ekrana yazdırılıyor
    }
}
