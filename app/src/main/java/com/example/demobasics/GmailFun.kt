package com.example.demobasics

fun main(){
    val operatingSystem : String? = "Chrome OS"
    val emailID : String = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem,emailID))
}
fun displayAlertMessage(operatingSystem: String?, emailID: String): String {
    return if (operatingSystem == null){
        "There's a new sign-in request on Unknown OS for your Google Account $emailID.\n"
    }else
        "There's a new sign-in request on $operatingSystem for your Google Account $emailID.\n"
}