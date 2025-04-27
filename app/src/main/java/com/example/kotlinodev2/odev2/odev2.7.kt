package com.example.kotlinodev2.odev2

fun calculateQuotaCost(quotaUsedInGB: Int): Double {
    val baseQuota = 50
    val basePrice = 100.0  // 50 GB için 100 €
    val extraGBPrice = 4.0  // Kota aşımındaki her 1 GB için 4 Ł

    return if (quotaUsedInGB <= baseQuota) {
        basePrice
    } else {
        basePrice + (quotaUsedInGB - baseQuota) * extraGBPrice
    }
}

fun main(){
    val quotaCost = calculateQuotaCost(60)  // 60 GB kota kullanımı
    println("Kota ücreti: €$quotaCost")
}