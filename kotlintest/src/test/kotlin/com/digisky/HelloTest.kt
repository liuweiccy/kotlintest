package com.digisky

import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {

    @Test
    fun test1() {
        assertEquals(1,1,"这两个值不相等")
    }
}

data class Person(val name : String, var age : Int)

fun toJSON(collection: Collection<Int>): String {
    var json : String = "["
    val itr = collection.iterator()
    while (itr.hasNext()) {
        json = json.plus(itr.next())
        if (itr.hasNext()) {
            json = json.plus(", ")
        }
    }
    json = json.plus("]")
    return json
}

fun main(args: Array<String>) {
    val p = Person("BigVV", 26)
    val (name, age) = p
    println("$name -> $age")
    val p1 = p.copy(name = "BigLiu", age = 30)
    println("${p1.name} -> ${p1.age}")
}

