package com.digisky

import redis.clients.jedis.Jedis

fun main1(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
}

fun main(args: Array<String>) {
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