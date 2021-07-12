package com.lucascabral.kotlin150

interface Developer {
    fun framework()
}

class BackEnd : Developer {
    override fun framework() {
        println("Spring")
    }
}

class Mobile : Developer {
    override fun framework() {
        println("Flutter")
    }
}

fun main() {

    val backend: Developer = BackEnd()
    val mobile: Developer = Mobile()

    // backend.framework() or mobile.framework()
    showFramework(backend)
    showFramework(mobile)
}

fun showFramework(dev: Developer) = dev.framework()