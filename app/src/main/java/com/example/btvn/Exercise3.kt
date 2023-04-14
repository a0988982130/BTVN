package com.example.btvn

fun main(args: Array<String>) {
    /*Bai 3 : Viết chương trình in ra thông tin của 1 sinh viên được nhập từ bàn phím. Cho biết sinh viên có thuộc tính như sau
    Họ tên, tuổi, giới tính, địa chỉ.
    1, Tính điểm trung bình chung của học sinh với các môn như sau : Văn , Sử , Địa. (Điểm các môn được nhập từ bàn phím).
    2, Lập trình và In ra đầy đủ thông tin của sinh viên đó*/
    var name: String? = null
    var age: String? = null
    var gender: String? = null
    var address: String? = null
    var literature: String? = null
    var history: String? = null
    var geography: String? = null
    println("__________Pro__________")
    print("name: ")
    name = readLine()
    print("age: ")
    age = readLine()
    print("gender: ")
    gender = readLine()
    print("address: ")
    address = readLine()
    print("literature score: ")
    literature = readLine()
    print("history score: ")
    history = readLine()
    print("geography score: ")
    geography = readLine()
    println("Student name: $name")
    println("Age: $age")
    println("Gender: $gender")
    println("Address: $address")
    println("GPA: ${(((literature?.toFloat() ?: 0f).plus(history?.toFloat() ?: 0f)).plus(geography?.toFloat() ?: 0f)) / 3f}")
}