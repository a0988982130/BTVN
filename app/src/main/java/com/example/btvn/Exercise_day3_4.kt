package com.example.btvn

import java.time.Month

fun main(args: Array<String>) {
    /*Bài 4: Nhập vào 1 tháng cho biết tháng đó nằm trong mùa nào trong năm.
     - Nếu là mùa Xuân thì tính giá trị biểu thức
       S = 1+2+3+...+n (n>0)
     - Nếu là mùa Hạ tính giá trị biếu thức
       Q = 0 + 1/2 + 2 + 9/2 + ... + n^2/2*/

    var n: String? = null
    print("Enter a month: ")
    n = readLine()
    var month = n?.toInt() ?: 0
    if (month in 1..12) {
        when (month) {
            3, 4, 5 -> caculateS(month)
            6, 7, 8 -> caculateQ(month)
            9, 10, 11 -> println("$month belongs to autumn")
            12, 1, 2 -> println("$month belongs to winter")
        }
    } else {
        println(
            """$month is not a positive integer and 
        $month is not within the range from 1 to 12"""
        )
        println("The month must be a positive integer within the range from 1 to 12")
    }

}

fun caculateS(month: Int) {
    /*S = 1+2+3+...+n (n>0)*/
    var sum: Int = 0
    for (i in 1..month) {
        sum += i
    }
    println("S = 1 + 2 + 3 + ... + $month = $sum")
}

fun caculateQ(month: Int) {
    var sum: Double = 0.0
    for (i in 0..month) {
        sum += (i * i) / 2.0
    }
    println("Q = 0 + 1/2 + 2 + 9/2 + ... + $month^2/2 = $sum")
}
