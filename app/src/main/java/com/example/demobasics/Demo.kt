package com.example.demobasics

import org.intellij.lang.annotations.Language

// fun main to run on terminal
fun main(){
    println("hello world")
    /*
           Kotlin uses two ways to declare variables
           VAL = Value never changes
           VAR = Value can change
           ":" = "colon" is used to give a Data Type o your variable
       */
    var count: Int = 2
    val languageName: String = "Kotlin"
    /*
        If you want to declare a null variable, need to use "?"
        "?" = nullable;
    */
    val noValueVariable: String? = null
    /*
        You can use IF/ELSE but if its too complex you can use "when"
    */
    /*
                Use "fun" to create a function
                You can use one or more expressions
                Define or not the entry data, if yes
                Define the return type
    */
    fun conditionalWhen(){
        val answerStringConditionalWhen = when{
            count == 10 -> "i got the conditional answer"
            count > 5 -> "the conditional answer is close"
            else -> "the conditional answer eludes me"
        }
        println(answerStringConditionalWhen)
        // Toast.makeText(applicationContext, " $answerString", Toast.LENGTH_SHORT).show()
    }
    conditionalWhen() //call fun

    fun generateAnswerString():String{
        val answerString = if (count == 42){
            "I got the answer to string"
        }else{
            "The string answer eludes me"
        }
        return answerString
    }
    val answerStringReturn = generateAnswerString() //call fun
    println(answerStringReturn)
    /*
        Functions can receive arguments
        When call the function you need to insert the argument
    */
    fun generateAnswerStringArgs(countThreshold: Int): String{
        val answerString = if (count > countThreshold){
            "I have the answer with args"
        }else{
            "The args answer eludes me"
        }
        return answerString
    }
    val answerStringArgs = generateAnswerStringArgs(5); //call fun
    println(answerStringArgs)
    /*
        You can simplify variables using "return" in the beginning of body
        You can ignore variable declaration
    */
    var number: Int = 6
    fun generateSimpleString(countValue: Int): String{
        return if (number >= countValue){
            "Simple string generated"
        }else{
            "Simple string NOT generated"
        }
    }
    println(generateSimpleString(5))

    fun generateStringNoKeyWord(countValueInt: Int): String = if (count > countValueInt){
        "No return word function TRUE"
    }else{
        "No return word function FALSE"
    }
    var text = generateStringNoKeyWord(2) // call fun and introduce parameter
    println(text)
    // parameter = variables
    // arguments = numbers
    /*
        Anonymous functions = don't need name
        You can identify by the IO
        then you need to recover the value using another variable with param/argument
    */
    val stringLengthFunction: (String) -> Int = {input -> input.length}
    val stringLength: Int = stringLengthFunction(languageName)
    println("The language name is $languageName it has $stringLength letters") // print data with text
    /*
        High Order Function
        A function can use another as argument
        Useful to communicate between components
    */
    fun  stringMapper(srt: String, mapper: (String) -> Int): Int {
        // invoke function
        return mapper(srt)
    }
    // You can call this function passing a string and a function that match the other entry param
    // A function that uses string and generate a int like an anonymous function
    print(stringMapper("Android") { input -> input.length })
}