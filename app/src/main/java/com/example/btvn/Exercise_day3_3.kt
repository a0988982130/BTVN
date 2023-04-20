package com.example.btvn

fun main(args: Array<String>) {
    /*Bài 3 : Viết chương trình nhập 1 số từ bàn phím,
    - Nếu là số chẵn thì tính tổng các số chẵn
    - Nếu là số lẻ thì in ra chuỗi "Là số lẻ lên tôi không tính tổng!!!" và thoát chương trình.
    */
    var n: String? = null
    print("Enter a number: ")
    n = readLine()
    var number = n?.toInt() ?: 0
    if (number > 0) {
        when (number % 2) {
            0 -> caculatethesum(number)
            else -> println("$number is a odd number so i won't caculate the sum")
        }
    } else {
        println("$number is not a positive integer")
    }
}

fun caculatethesum(number: Int) {
    var sum: Int = 0
    for (i in 0..number) {
        sum += i
    }
    println("The sum from 0 to $number is $sum")
}


