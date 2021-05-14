package com.lucascabral.kotlin150

interface Printable {
    fun prettyPrint(): String
}

@JvmInline
value class Name(val s: String) : Printable {
    override fun prettyPrint(): String = "Let's $s!"
}

fun main() {
    val name = Name("Kotlin 1.5.0")
    println(name.prettyPrint()) // Still called as a static method
}