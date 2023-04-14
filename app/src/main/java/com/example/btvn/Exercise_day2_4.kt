package com.example.btvn

import java.util.*

fun main(args: Array<String>) {
    /*Bài 4:
    Viết chương trình cho phép người dùng nhập vào mã số sinh viên
    Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
    Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)*/

    val pattern = Regex("B[1-9]{7}")
    var id: String? = null
    println("_____Check Id_____")
    print("Enter Id: ")
    id = readLine()?.uppercase(Locale.ROOT).toString() // vì id có thể null mà cái regex chỉ có thể truyền 1 chuỗi nên phải ép lại kiểu về string
    if (pattern.matches(id)) {
        println("$id is Right")
    } else {
        println("$id is Wrong")
    }
}