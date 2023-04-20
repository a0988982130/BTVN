package com.example.btvn

fun main(args: Array<String>) {
    /*Bài 5: Cho các thông số tương đương với hệ trục tọa độ
    A.Vẽ hình trái tim
    B.Vẽ hình tam giác đứng*/

    //A.Vẽ hình trái tim
    val n: Int = 7
    for (i in 1..n) {
        for (j in 1..n) {
            if (!((i == 1 && (j == 4 || j == 1 || j == 7))
                        || (i == 2 && (j == 2 || j == 3 || j == 5 || j == 6))
                        || (i == 3 && (j == 2 || j == 3 || j == 4 || j == 5 || j == 6))
                        || (i == 4 && (j == 1 || j == 3 || j == 4 || j == 5 || j == 7))
                        || (i == 5 && (j == 1 || j == 2 || j == 4 || j == 6 || j == 7))
                        || (i == 6 && (j == 1 || j == 2 || j == 3 || j == 5 || j == 6 || j == 7))
                        || (i == 7 && (j == 1 || j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j == 7)))
            ) {
                print("*")
            }

            print("\t")
        }
        println()
    }

}