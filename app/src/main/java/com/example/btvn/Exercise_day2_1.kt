package com.example.btvn

import kotlin.math.abs

fun main(args: Array<String>) {
    /*Bài 1 :
    Viết chương trình cho phép nhập vào một số nguyên dạng số,
    sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.*/

    var integer: String? = null
    var s = ""
    println("_____Number To Words_____")
    print("Enter a integer: ")
    integer = readLine()
    s += if ((integer?.toInt() ?: 0) > 0) {
        convertToWords(integer?.toInt() ?: 0)
    } else if ((integer?.toInt() ?: 0) < 0) {
        "âm" + " " + convertToWords(abs(integer?.toInt() ?: 0))
    } else {
        "'$integer' is not a number"
    }
    println(s)
}

fun convertToWords(integer: Int?): String {
    val ones = arrayOf(
        "",
        "một",
        "hai",
        "ba",
        "bốn",
        "năm",
        "sáu",
        "bảy",
        "tám",
        "chín",
        "mười",
        "mười một",
        "mười hai",
        "mười ba",
        "mười bốn",
        "mười năm",
        "mười sáu",
        "mười bảy",
        "mười tám",
        "mười chín"
    )
    val tens = arrayOf(
        "",
        "",
        "hai mươi",
        "ba mươi",
        "bốn mươi",
        "năm mươi",
        "sáu mươi",
        "bảy mươi",
        "tám mươi",
        "chín mươi"
    )
    var result = ""
    if (integer == 0) {
        result += "Không"
    } else if (integer?.compareTo(20)!! < 0) {
        result += ones[integer]
    } else if (integer < 100) {
        val tensDigit = integer.div(10)
        val onesDigit = integer.rem(10)
        result += tens[tensDigit]
        if (onesDigit >= 0) {
            result += " " + ones[onesDigit]
        }
    } else if (integer < 1000) {
        val hundredsDigit = integer.div(100)
        val x = integer.rem(100)
        result += ones[hundredsDigit] + " " + "trăm"
        if (x >= 0) {
            result += " " + convertToWords(x)
        }
    } else if (integer < 1000000) {
        val thousandsDigit = integer.div(1000)
        val x = integer.rem(1000)
        result += " " + convertToWords(thousandsDigit) + " " + "nghìn"
        if (x >= 0) {
            result += " " + convertToWords(x)
        }
    } else {
        result += "Number is too large to convert to words"
    }
    return result
}
