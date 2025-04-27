package com.example.kotlinodev2.odev2

fun factorial(n: Int): Long {
    var result: Long = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun main(){
    val fact = factorial(5)  // 5! = 120
    println("Faktöriyel: $fact")
}