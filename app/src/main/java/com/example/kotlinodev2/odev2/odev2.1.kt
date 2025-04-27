package com.example.kotlinodev2.odev2

fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

fun main() {
    val fahrenheit = celsiusToFahrenheit(25.0)
    println("25°C = $fahrenheit°F")
}