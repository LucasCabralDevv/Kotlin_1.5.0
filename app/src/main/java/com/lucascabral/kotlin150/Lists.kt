package com.lucascabral.kotlin150

import kotlin.random.Random

fun creatingLists() {
    listOf(1, 2, 3, 4, 5) //[1, 2, 3, 4, 5]
    List(5) { index: Int -> "No. $index" } //[No. 0, No. 1... ]
    "Lucas Cabral".toList() //[L, u, c... ]
    mapOf(
        1 to "Bitcoin",
        2 to "Gold",
        3 to "Euro"
    ).toList() // [(1, Bitcoin), (2, Gold)... ]

    generateSequence { Random.nextInt(100).takeIf { it > 30 } }.toList() // [54, 76, 69... ]

    (0..20).toList() // [0, 1, 2... 20]
}

fun accessingElements() {
    val myList = listOf("L", "u", "c", "a", "s")
    println(myList[1]) // "u"
    println(myList[5]) // Index 5 out of bounds for length 5
    println(myList.getOrNull(5)) // null
    println(myList.getOrElse(5) { "There's no index $it!" }) // There's no index 5!

    val listOfNullableItems = listOf(1, 2, null, 5)
    val item = listOfNullableItems[2] ?: 0
    println(item)
}

fun getMultipleItemsSlice() {
    val myList = listOf("L", "u", "c", "a", "s")
    myList.slice(listOf(0, 2, 4)) // [L, c, s]
    myList.slice(0..2) // [L, u, c]
    myList.slice(0..myList.lastIndex step 2) // [L, c, s]
    myList.slice(2 downTo 0) // [c, u, L]
}

fun removingElements() {
    val myList = mutableListOf(1, 2, 3, 3, 3, 4, 4, 4)
    myList -= 3 //[1, 2, 3, 3, 4, 4, 4]
    myList.remove(3) //[1, 2, 3, 4, 4, 4]
    myList -= listOf(1, 4) //[2, 3]
    myList.removeAt(1) //[2]
}

fun updatingElements() {
    val myList = mutableListOf("L", "u", "c", "a", "T")
    myList[myList.lastIndex] = "s" //[L, u, c, a, s]
}

fun main() {

}