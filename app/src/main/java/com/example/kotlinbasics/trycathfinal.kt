package com.example.kotlinbasics

import java.lang.Exception

fun main(){
    println("Please enter number")
    try {
        //Error prone code you want to execute
        val number=readln().toInt()
        println("User entered $number")
    }catch (e:Exception){
 //what should happen when an error occurs
        println("Error ${e.message}")
    }
    finally {
        println("This will be executed regardless. Error or no error")
    }
}