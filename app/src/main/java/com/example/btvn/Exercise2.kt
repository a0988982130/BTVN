package com.example.btvn

import kotlin.math.PI
import kotlin.math.pow

fun main(args: Array<String>) {
    /*Bài 2 :  Tính chu vi và diện tích hình tròn với dữ liệu được nhập từ bàn phím.*/
    var a: String? = null
    print("radius = ")
    a = readLine()
    println("Area: ${2 * PI * (a?.toFloat() ?: 0f)}")
    println("Circumference: ${PI * ((a?.toFloat() ?: 0f).pow(2))}")
}