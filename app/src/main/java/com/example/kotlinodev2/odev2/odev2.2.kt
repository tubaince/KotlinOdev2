package com.example.kotlinodev2.odev2

fun calculateRectanglePerimeter(length: Double, width: Double): Double {
    return 2 * (length + width)
}

fun main(){
    val perimeter = calculateRectanglePerimeter(5.0, 3.0)  // Uzunluk = 5, Genişlik = 3
    println("Çevre: $perimeter")
}