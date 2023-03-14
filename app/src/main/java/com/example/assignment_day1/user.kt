package com.example.assignment_day1

import java.io.Serializable

data class User(
    var fName: String = "",
    var lName: String = "",
    var mobNo: String = ""
): Serializable