package org.example

fun main(){
    val length: Long = 40_868_600_000
    val age: Byte = 27
    val partOfDay: Double = 0.075
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000

    println(
        """
            Расстояние-$length
            Возрвст-$age
            Часть дня-$partOfDay
            Секунды-$seconds
            Часть года-$partOfYear
            Апогей орбиты-$apogee
            
        """.trimIndent()
    )


}