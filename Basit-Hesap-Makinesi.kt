package com.myu.ders5

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)
    println("Toplama (1)")
    println("Çıkarma (2)")
    println("Çarpma (3)")
    println("Bölme (4)")
    val secim = girdi.nextInt()
    println("Seçiminiz $secim")

    if (secim == 1){
        println("1. Sayıyı Girin")
        var toplama1 = girdi.nextDouble()
        println("2. Sayıyı Girin")
        var toplama2 = girdi.nextDouble()
        var toplamasonuc = toplama1 + toplama2
        println("Sonuc = $toplamasonuc")
    }

    if (secim == 2){
        println("1. Sayıyı Girin")
        var cıkartma1 = girdi.nextDouble()
        println("2. Sayıyı Girin")
        var cıkartma2 = girdi.nextDouble()
        var cıkartmasonuc = cıkartma1 - cıkartma2
        println("Sonuc = $cıkartmasonuc")
    }

    if (secim == 3){
        println("1. Sayıyı Girin")
        var carpma1 = girdi.nextDouble()
        println("2. Sayıyı Girin")
        var carpma2 = girdi.nextDouble()
        var carpmasonuc = carpma1 * carpma2
        println("Sonuc = $carpmasonuc")
    }

    if (secim == 4){
        println("1. Sayıyı Girin")
        var bolme1 = girdi.nextDouble()
        println("2. Sayıyı Girin")
        var bolme2 = girdi.nextDouble()
        var bolmesonuc = bolme1 * bolme2
        println("Sonuc = $bolmesonuc")
    }



}