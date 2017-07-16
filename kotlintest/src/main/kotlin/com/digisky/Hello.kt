package com.digisky

data class Person(val name : String, var age : Int)

fun main(args: Array<String>) {
    val p = Person("BigVV", 26)
    val (name, age) = p
    println("$name -> $age")
    val p1 = p.copy(name = "BigLiu", age = 30)
    println("${p1.name} -> ${p1.age}")

    println(getStringLength("aaa"))
    println(getStringLength(111))

    var i = 0
    while (i < args.size) {
        println(args[i++])
    }
}

fun getStringLength(obj : Any): Int? {
    if (obj is String)
        return obj.length
    return null
}