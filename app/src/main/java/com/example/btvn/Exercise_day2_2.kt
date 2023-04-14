package com.example.btvn

fun main(args: Array<String>) {
    /*Bài 2 :
    Viết chương trình Java mà khi chạy,
    màn hình console sẽ cho phép ta nhập vào một số nguyên,
    in ra màn hình “Đây là số nguyên dương”
    Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0,
    ngược lại in ra “Đây là số nguyên âm”.*/

    var a: String? = null
    println("_____Check Integer_____")
    print("Enter an integer: ")
    a = readLine()
    if ((a?.toInt()
            ?: 0) > 0
    ) println("$a is a positive integer") else println("$a is a negative integer")
}