package com.digisky

import redis.clients.jedis.Jedis

fun main1(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
}

fun main2(args: Array<String>) {
    val items = setOf("apple", "banana", "kiwi")

    items.filter { it.startsWith("a") }
         .sortedBy { it }
         .map { it.toUpperCase() }
         .forEach { println(it) }
    val jedis = Jedis("192.168.2.214", 6333)
    jedis.auth("123456")
    jedis.set("kotlin", "hello")
    println("get redis value ${jedis.get("kotlin")}")
    jedis.del("kotlin")
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list)

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    map.plus("s" to 1)
    println(map)
    println(transform("Red"))
}

fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}