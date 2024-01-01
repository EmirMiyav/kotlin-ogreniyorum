package com.myu.ders5

fun main(){

    var yas = 13
    var isim = "Mehmet"

    if(yas >=18){
        println("Yaşın tutuyor")
    }


    //Örnek2

    if (yas >= 18){
        println("Yaşınız Tutuyor")
    }else{
        println("Maleseft yaşınız tutmuyor")
    }

    //örnek 3
    if(isim == "Ahmet"){
        println("Merhaba Ahmet Bey")
    }else{
        println("Böyle Bir Kullanıcı yokk.")
    }

    //örnek 4
    if(isim == "Ahmet"){
        println("Merhaba Ahmet Bey")
    }else if (isim == "Mehmet"){
        println("Merhaba mehmet Bey.")
    }else{
        println("böyle bir kullanıcı yok")
    }

    //örnek 5 çoklu şart and

    val kullaniciAdi = "admin"
    val sifre = 12345

    if (sifre == 12345 && kullaniciAdi == "admin"){
        println("Merhaba $kullaniciAdi")
    }else{
        println("Kullanıcı adı veye şifre hatalıdır. tekrar deneyin")
    }

    //örnek 6 çoklu şart or

    val sinif = 7
    if (sinif == 9 || sinif == 10 || sinif == 11 || sinif == 12){
        println("hosgeldin ogrenci")
    }else{
        println("Bu Yazılım Lise ögrencileri icin yapilmistir aglama.")
    }

    //örnek 7 kıslatma

    if (sifre == 12345) println("hosgeldin") else println("yanlis parola")

}