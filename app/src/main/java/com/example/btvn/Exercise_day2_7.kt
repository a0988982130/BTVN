package com.example.btvn

fun main(args: Array<String>) {
    /*Bài 2 :
    Nhập vào từ ban phím 3 số a, b , c
    Tính Z = a++ - b-- + --c
    cho biết kết quả của Z? Và các giá trị thay đổi của a, b , c*/

    var a: String? = null
    var b: String? = null
    var c: String? = null
    print("Enter a = ")
    a = readLine()
    print("Enter b = ")
    b = readLine()
    print("Enter c = ")
    c = readLine()
    var soA = (a?.toInt() ?: 0)
    var soB = (b?.toInt() ?: 0)
    var soC = (c?.toInt() ?: 0)
    var z = soA++ - soB-- + --soC
    println("z = $z")
    println("a = $soA")
    println("b = $soB")
    println("c = $soC")
}