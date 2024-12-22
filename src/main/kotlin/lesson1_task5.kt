package org.example

fun main(){
    var seconds = 6480
    var minute:Int
    var strSecond= ""
    var strMinut= ""
    var strHour= ""
    var newSeconds:Int
    var newMinuts:Int
    if(seconds%60==0){
        strSecond="0"
    }else{
        newSeconds = seconds % 60
        seconds -= newSeconds
        strSecond = newSeconds.toString()
    }
    minute=seconds/60
    if (minute%60==0){
        strMinut="0"
    }else{
        newMinuts = minute % 60
        minute -=newMinuts
        strMinut=newMinuts.toString()
    }
    strHour = (minute/60).toString()

    if (strSecond.length==1){
        strSecond = "0$strSecond"
    }
    if (strMinut.length==1){
        strMinut = "0$strMinut"
    }
    if (strHour.length==1){
        strHour = "0$strHour"
    }

    println("$strHour:$strMinut:$strSecond")

}