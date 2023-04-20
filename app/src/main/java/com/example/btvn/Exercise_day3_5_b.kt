package com.example.btvn

fun main(args: Array<String>)
{
    /*Bài 5: Cho các thông số tương đương với hệ trục tọa độ
    A.Vẽ hình trái tim
    B.Vẽ hình tam giác*/

    //B.Vẽ hình tam giác
    //i = 1 có 1 *
    //i = 2 có 2 *
    //i = 3 có 3 *
    //i = 4 có 4 *
    //i = 5 có 5 *
    val n: Int = 5
    for (i in 1..n)
    {
        for (j in i until n)
        {
            print(" ")
        }
        for (j in 1..i)
        {
            print("*")
            print(" ")
        }
        println()
    }




}