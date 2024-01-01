package com.myu.ders5

import java.util.Scanner

fun main() {
    val girdi = Scanner(System.`in`)
    println("Dikdörtgen alanı (1)")
    println("Çember alanı (2)")

    val secim = girdi.nextInt()

    println("Seçiminiz $secim")

    if (secim == 1) {
        println("Kısa Kenar Giriniz.")
        val kisakenar = girdi.nextDouble()
        println("Uzun Kenar Giriniz.")
        val uzunkenar = girdi.nextDouble()
        val alan = kisakenar * uzunkenar
        println("Dikdörtgen Alanı: $alan")
    }

    if (secim == 2) {
        println("Yarı Çap Giriniz.")
        val yaricap = girdi.nextDouble()
        val alan = Math.PI * yaricap * yaricap
        println("Çember Alanı: $alan")
    }
}
