package com.example.demobasics
// PROPERTIES
/*
    var properties can be mutable
    var can be read-only
*/
fun main(){
    println("Hello World")
    class Address{
        var name: String = "Holmes, Sherlock"
        var street: String = "Baker"
        var city: String = "London"
        var state: String? = null
        var zip: String = "123456"
    }

    // To use a property, simply refer to it by its name

    fun copyAddress(address: Address): Address{
        val result = Address()           // Access object
        result.name = address.name       // Access properties
        result.street = address.street
        result.city = address.city
        result.state = address.state
        result.zip = address.zip
        return result
    }
    fun printAddress() {
        val objectAddress = Address() // Create an object
        val copiedAddress = copyAddress(objectAddress) // Copy the address

        // Print the copied Address object
        println("Copied Address:")
        println("Name: ${copiedAddress.name}")
        println("city: ${copiedAddress.city}")
    }
        printAddress()
}