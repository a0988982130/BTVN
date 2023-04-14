package com.example.btvn

import kotlin.math.sqrt

fun main(args: Array<String>) {
    /*Bài 1 : Cho 3 cạnh của tam giác biết độ dài 3 cạnh lần lượt là a = 3, b = 4, c = 5.
    Hãy tính chu vi và diện tích của tam giác đó.*/
    val a = 3
    val b = 4
    val c = 5
    val p = ((a.plus(b)).plus(c)).toFloat()
    println("Area: $p")
    println("Circumference: ${sqrt((p / 2) * ((p / 2) - a) * ((p / 2) - b) * ((p / 2) - c))}")
}