package com.example.btvn

fun main(args: Array<String>) {
    /*Bài 2: VIết chương trinh nhập vào 1 số và tính giai thừa.*/
    var n: String? = null
    var factorial: Int = 1
    print("Enter a number: ")
    n = readLine()
    var number = n?.toInt() ?: 0
    if (number > 0) {
        for (i in 1..number) {
            factorial *= i
        }
        println("Factorial of $number = $factorial")
    } else {
        println("$number is not a positive integer")
    }
}