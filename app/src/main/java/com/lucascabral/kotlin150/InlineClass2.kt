package com.lucascabral.kotlin150

@JvmInline
value class Email(val e: String) {

    init {
        require(e.isNotEmpty()) {}
    }

    val length: Int
        get() = e.length

    fun greet() {
        println("Hello, $e")
    }
}

fun main() {
    val email = Email("lucas-cabral@dev.com")
    email.greet()
    println(email.length)
}