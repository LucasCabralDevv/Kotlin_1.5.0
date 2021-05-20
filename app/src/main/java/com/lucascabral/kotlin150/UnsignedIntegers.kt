package com.lucascabral.kotlin150

import org.jetbrains.annotations.TestOnly

val u1: UInt = (7u - 14u)
val u2: UInt = (7u - 14u)

fun main() {
    uintArrayOf(42u, 43u).map { it * it }.forEach { println(it) }
}
