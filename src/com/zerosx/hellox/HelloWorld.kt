package com.zerosx.hellox

//###################Variable####################
var type=""
var a=""
var b=""
var resu:Double=0.0
//###############################################
//################MAIN PROCESS####################
fun main(args: Array<String>) {
        startcalculate()
}
//###############################################
//################FUNC PROCESS###################
fun crossx(a: Double, b: Double) {
     resu = a * b;
}

fun passx(a: Double, b: Double) {
     resu = a + b;
}

fun minusx(a: Double, b: Double) {
     resu = a - b;
}

fun divied(a: Double, b: Double) {
     resu = a / b;
}
fun checkoper(){
    var i=1
    do {
         type = readLine().toString()
        if (type != "+" && type != "-" && type != "*" && type != "/") {
            println("Error please write + - * /")
        } else {
            i--
        }
    } while (i > 0)
}
fun checknumOfA(){
    var i=1
    do {
         a = readLine().toString()
        try {
            a.toDouble()
            i--
        } catch (e:NumberFormatException) {
            println("Error please write number again")
        }
    } while (i > 0)
}
fun checknumOfB(){
    var i=1
    do {
        b = readLine().toString()
        try {
            b.toDouble()
            i--
        } catch (e:NumberFormatException) {
            println("Error please write number again")
        }
    } while (i > 0)
}
fun operan(){
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
fun startcalculate(){
    var i=1
    do{
        println("Please Input 1st number Examle 5.0")
        checknumOfA()
        println("Please Input + - * / ")
        checkoper()
        println("Please Input 2nd number Examle 5.0")
        checknumOfB()
        operan()
        println("Answer = ${resu}")
        println("Again?")
        println("Please input Y or y to again Or another to exit")
        var x = readLine()
        if(x !="Y" && x!="y"){
            i--
        }
    }while (i>0)
}