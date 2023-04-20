package com.example.btvn

fun main(args: Array<String>) {
    /*Bài 1: Viết chương trình tính tổng từ 1 tới gần số nguyên dương n*/
    var n: String? = null
    var sum: Int = 0
    print("Enter an integer n: ")
    n = readLine()
    var positive = n?.toInt() ?: 0
    if (positive > 0) {
        for (i in 1..positive) {
            sum += i
        }
        println("The sum from 1 to $positive is $sum")
    } else {
        println("$positive is not a positive integer")
    }
}