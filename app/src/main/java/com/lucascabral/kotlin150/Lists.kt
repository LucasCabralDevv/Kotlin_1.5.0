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

    val fruits = mutableListOf("apple", "orange", "banana")
    fruits.fill("avocado") //[avocado, avocado, avocado]
    fruits.clear() //[]
}

fun shufflingSortingReversingLists() {
    val myList = listOf(3, 7, 2, 1, 8, 9)
    println(myList.shuffled()) //[9, 3, 2, 1, 7, 8]
    println(myList.sorted()) //[1, 2, 3, 7, 8, 9]
    println(myList.reversed()) //[9, 8, 1, 2, 7, 3]
    println(myList) //[3, 7, 2, 1, 8, 9]

    val myMutableList = mutableListOf(3, 7, 2, 1, 8, 9)
    myMutableList.shuffle()
    println(myMutableList) //[7, 9, 1, 8, 2, 3]
}

fun retainingOrRemovingElements() {
    val numbers = mutableListOf(4, 9, 7, 2, 5, 3)
    numbers.removeAll { it < 5 }
    println(numbers) //[9, 7, 5]

    val letters = mutableListOf<Char>('a', 'b', 'c', 'd', '5', 'e', '2')
    letters.retainAll { it.isLetter() }
    println(letters) //[a, b, c, d, e]
}

fun viewsOnLists() {
    val fruits = mutableListOf("apple", "orange", "banana", "melon", "grape")
    val sub = fruits.subList(1, 4) //[orange, banana, melon] fromIndex 1, toIndex 4
    fruits[1] = "papaya" // println(sub) -> [papaya, banana, melon]
    sub[2] = "lemon" // println(sub) -> [papaya, banana, lemon]
    println(fruits) // [apple, papaya, banana, lemon, grape]
    println(sub) // [papaya, banana, lemon]
    sub.fill("sugar")
    println(fruits) // [apple, sugar, sugar, sugar, grape]

    val fruits2 = mutableListOf("apple", "orange", "banana", "melon", "grape")
    val stiurf = fruits2.asReversed() // [grape, melon, banana, orange, apple]
    fruits2[1] = "papaya" // println(stiurf) -> [grape, melon, banana, papaya, apple]
    stiurf[2] = "lemon" // println(stiurf) -> [grape, melon, lemon, papaya, apple]
    println(fruits2) // [apple, papaya, lemon, melon, grape]
}

fun main() {

}