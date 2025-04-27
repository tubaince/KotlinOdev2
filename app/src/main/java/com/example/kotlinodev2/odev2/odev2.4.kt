package com.example.kotlinodev2.odev2

fun countAInWord(word: String): Int {
    return word.count { it == 'a' || it == 'A' }
}

fun main(){
    val count = countAInWord("Kotlin is amazing!")  // 'a' harflerinin sayısı
    println("A harfi sayısı: $count")
}