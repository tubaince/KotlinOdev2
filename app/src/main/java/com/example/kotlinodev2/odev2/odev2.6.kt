package com.example.kotlinodev2.odev2

fun calculateSalary(daysWorked: Int): Double {
    val workingHoursPerDay = 8
    val regularHourlyRate = 10.0  // € olarak
    val overtimeHourlyRate = 20.0  // ₺ olarak
    val maxRegularHours = 160

    val totalHoursWorked = daysWorked * workingHoursPerDay
    val regularHours = if (totalHoursWorked <= maxRegularHours) totalHoursWorked else maxRegularHours
    val overtimeHours = if (totalHoursWorked > maxRegularHours) totalHoursWorked - maxRegularHours else 0

    val regularSalary = regularHours * regularHourlyRate
    val overtimeSalary = overtimeHours * overtimeHourlyRate

    return regularSalary + overtimeSalary
}


fun main(){
    val salary = calculateSalary(20)  // 20 gün çalışarak elde edilen maaş
    println("Maaş: €$salary")
}