package com.zerosx.hellox

import kotlin.concurrent.timerTask

fun main(args: Array<String>) {
    println("Please Input 1st number Examle 5.0")
    var a: String = readLine().toString()
    println("Please Input + - * / ")
    var checkx = 1
    var i = 1
    var type = ""
    do {
        type = readLine().toString()
        if (type != "+" && type != "-" && type != "*" && type != "/") {
            println("Error please write + - * /")
        } else {
            i--
        }
    } while (i > 0)
    println("Please Input 2nd number Examle 5.0")
    var b: String = readLine().toString()
    if (type == "+") {
        passx(a.toDouble(), b.toDouble())
    } else if (type == "-") {
        minusx(a.toDouble(), b.toDouble())
    } else if (type == "*") {
        crossx(a.toDouble(), b.toDouble())
    } else if (type == "/") {
        divied(a.toDouble(), b.toDouble())
    }
}

fun crossx(a: Double, b: Double) {
    var resu = a * b;
    println(resu)
}

fun passx(a: Double, b: Double) {
    var resu = a + b;
    println(resu)
}

fun minusx(a: Double, b: Double) {
    var resu = a - b;
    println(resu)
}

fun divied(a: Double, b: Double) {
    var resu = a / b;
    println(resu)
}