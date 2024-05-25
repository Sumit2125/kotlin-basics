package com.example.kotlinbasics

fun main(){
  // TODO: Add new functionality

    //Strings
   /* val myStr="Hello World"
    var firstCharInStr= myStr[0];
    var lastCharInStr= myStr[myStr.length-1]
    var myLength=myStr.length
    print("First Character $firstCharInStr and the length of myStr is${myStr.length}") /* String template or String Interpolation */
   */

    // When Expression
   /* var season =3
    when(season){
        1->println("Spring")
        2->println("Summer")
        3->{
            println("Fall")
            println("Autumn")
        }
     4->println("Winter")
        else ->println("Invalid Season")
    }*/

    var month=6
    when(month){
        in 3..5->println("Spring")
        in 6..8->println("Summer")
        in 9..11->println("Fall")
        12,1,2->println("Winter")
    }


}