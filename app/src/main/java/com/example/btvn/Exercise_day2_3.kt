package com.example.btvn

import kotlin.math.pow

fun main(args: Array<String>) {
    /*Bài 3 :
    Viết chương trình cho phép nhập vào 3 số
    Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
    Nếu 3 cạnh tạo thành 1 tam giác thì hãy xác định đó là tam giác gì.*/

    var a: String? = null
    var b: String? = null
    var c: String? = null
    println("_____Check Triangle_____")
    print("Enter a side a: ")
    a = readLine()
    print("Enter a side b: ")
    b = readLine()
    print("Enter a side c: ")
    c = readLine()
    val sideA = (a?.toFloat() ?: 0.0).toFloat()
    val sideB = (b?.toFloat() ?: 0.0).toFloat()
    val sideC = (c?.toFloat() ?: 0.0).toFloat()
    var s: String? = "This is"
    if (sideA > 0 && sideB > 0 && sideC > 0)
    {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            if (sideA == sideB && sideB == sideC && sideC == sideA) {
                s += " a equilateral triangle"
                println(s)
            } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
                s += " a isoscele triangle"
                println(s)
            } else if (sideA.pow(2) + sideB.pow(2) == sideC.pow(2) || sideA.pow(2) + sideC.pow(2) == sideB.pow(2) || sideB.pow(2) + sideC.pow(2) == sideA.pow(2)) {
                s += " a right triangle"
                println(s)
            }
        } else {
            s += " not a triangle"
            println(s)
        }
    }
    else
    {
        println("a < 0 || b < 0 ||c < 0")
    }
}