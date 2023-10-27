package com.example.demobasics

fun main() {
    /*
    *   fun <NAME> (<VARIABLE NAME> : <DATA TYPE>) : <RETURN TYPE> {
    *       <BODY>
    *   <return>
    * }
    * */

    fun birthdayGreeting(): Unit {
        println("Happy Birthday, Rover")
        println("You are now 5 years old!")
    }
    birthdayGreeting()

    fun birthdayGreetingReturn() : String {
        val nameGreeting = "Happy Birthday, Return!"
        val ageGreeting = "You're now 10 years old!"
        return "$nameGreeting \n$ageGreeting"
    }
    val stringBirthday : String = birthdayGreetingReturn()
    println(stringBirthday)

    fun birthdayGreetingParamReturn(name : String) : String {
        val nameGreeting = "Happy Birthday, $name"
        val ageGreeting = "You're now 15 years old!"
        return "$nameGreeting\n$ageGreeting"
    }
    val stringBirthdayParamReturn : String = birthdayGreetingParamReturn("Param and Return")
    println(stringBirthdayParamReturn)

    fun birthdayGreetingTwoParam(name : String, age : Int) : String{
        val nameGreeting = "Happy Birthday, $name"
        val ageGreeting = "You're now have $age years!"
        return "$nameGreeting\n$ageGreeting"
    }
    val stringTwoParam : String = birthdayGreetingTwoParam("Two Param", 20)
    println(stringTwoParam)
    // Or you can print a Function nominating arguments
    println(birthdayGreetingTwoParam(age = 25, name="Two Param inverse"))

    fun add(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber + secondNumber
    }

    fun sum() {
        val firstNumber = 10
        val secondNumber = 5
        val thirdNumber = 8

        val result = add(firstNumber, secondNumber)
        val anotherResult = add(firstNumber, thirdNumber)

        println("$firstNumber + $secondNumber = $result")
        println("$firstNumber + $thirdNumber = $anotherResult")
    }
    sum()
}