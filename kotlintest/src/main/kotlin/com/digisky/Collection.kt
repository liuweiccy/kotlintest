package com.digisky

fun main1(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
}

fun main(args: Array<String>) {
    val items = setOf("apple", "banana", "kiwi")

    items
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}