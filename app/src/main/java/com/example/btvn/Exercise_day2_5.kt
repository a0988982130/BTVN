package com.example.btvn

import android.util.Log
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    /*Bài 5 :
    Viết chương trình giải phương trình bậc 2 có dạng : ax^2 + bx + c = 0*/

    var a: String? = null
    var b: String? = null
    var c: String? = null
    var delta: Float? = null
    var s = "Equation has"
    println("_____Quadratic equation solving_____")
    print("Enter a: ")
    a = readLine()
    print("Enter b: ")
    b = readLine()
    print("Enter c: ")
    c = readLine()
    if ((a?.toFloat() ?: 0f).equals(0)) {
        if ((b?.toFloat()?:0f).equals(0))
        {
           if ((c?.toFloat()?:0f).equals(0))
           {
               s += " infinitely many solutions."
               println(s)
           }
            else
           {
               s += " no solutions"
               println(s)
           }
        }
        else
        {
            s += " 1 roots"
            println(s)
            println("x = ${-(c?.toFloat() ?: 0f) / (b?.toFloat() ?: 0f)}")
        }
    } else {
        delta = (((b?.toFloat() ?: 0f).pow(2)) - 4 * ((a?.toFloat() ?: 0f).times(c?.toFloat() ?: 0f)))
        if (delta > 0) {
            s += " 2 roots"
            println(s)
            println("x1 = ${(-(b?.toFloat() ?: 0f) + sqrt(delta)).div((2 * (a?.toFloat() ?: 0f)))}")
            println("x2 = ${(-(b?.toFloat() ?: 0f) - sqrt(delta)).div((2 * (a?.toFloat() ?: 0f)))}")
        } else if (delta.equals(0)) {
            s += " 2 equal roots"
            println(s)
            println("x1 = x2 = ${-(b?.toFloat() ?: 0f) / ((a?.toFloat() ?: 0f).times(2))}")
        } else {
            s += " no solutions"
            println(s)
        }
    }
}