package com.example.btvn

fun main(args: Array<String>) {
    /*Bài 1 :
    cho a = 2, b = 5 , c = 8
    Tính Z = a-- + b++ - ++c
    cho biết kết quả của Z? Và các giá trị thay đổi của a, b , c*/

    var a = 2
    var b = 5
    var c = 8
    var z = a-- + b++ - ++c
    println("z = $z")
    println("a = $a")
    println("b = $b")
    println("c = $c\n")
    z = a-- + b++ - ++c
    println("z1 = $z")
    println("a1 = $a")
    println("b1 = $b")
    println("c1 = $c\n")
    z = a-- + b++ - ++c
    println("z2 = $z")
    println("a2 = $a")
    println("b2 = $b")
    println("c2 = $c\n")
    z = a-- + b++ - ++c
    println("z3 = $z")
    println("a3 = $a")
    println("b3 = $b")
    println("c3 = $c\n")
}