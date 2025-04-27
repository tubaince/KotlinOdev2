package com.example.kotlinodev2.odev2

fun calculateInteriorAngles(sides: Int): Int {
    if (sides < 3) {
        throw IllegalArgumentException("Bir şekil en az 3 kenara sahip olmalıdır.")
    }
    return (sides - 2) * 180
}

fun main(){
    val angles = calculateInteriorAngles(5)  // 5 kenarlı bir şekil için iç açıların toplamı
    println("İç açılar toplamı: $angles")
}