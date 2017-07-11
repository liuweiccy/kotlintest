package my.demo.delegate

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

interface Base {
    fun print()
}

class BaseImpl(val x : Int) : Base {
    override fun print() {
        print(x)
    }
}

class Derived(b : Base) : Base by b

//fun main(args: Array<String>) {
//    val b = BaseImpl(10)
//    b.print()
//    Derived(b).print()
//}

class Delegate {
    operator fun getValue(thisRef : Any? , property : KProperty<*>) : String {
        return "$thisRef, thank you for delegate ${property.name} to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef")
    }
}

class Example {
    var p : String by Delegate()
}

//fun main(args: Array<String>) {
//    val e = Example()
//    println(e.p)
//    e.p = "1000"
//    println(e.p)
//}

val lazyValue: String by lazy {
    println("com")
    "Hello"
}

//fun main(args: Array<String>) {
//    println(lazyValue)
//    println(lazyValue)
//}

class User {
    var name : String by Delegates.observable("<No Name>") {
        property, oldValue, newValue ->
        println(property.name)
        println("$oldValue -> $newValue")
    }
    var age : Int by Delegates.vetoable(-1) {
        _, _, newValue ->
        newValue in 1..199
    }
}

//fun main(args: Array<String>) {
//    val user = User()
//    user.name = "liu"
//    user.name = "chen"
//    user.age = 100
//    user.age = 1000
//    println(user.age)
//}

class User1(val map : Map<String, Any?>) {
    val name : String by map
    val age  : Int    by map
}

val user1 = User1(mapOf(
        "name" to "John Done",
        "age"  to 25
))

fun main1(args: Array<String>) {
    println(user1.name)
    println(user1.age)
}

fun main2(args: Array<String>) {
    val input = "Kotlin"
    val keyword = "in"

    val index = input.indexOf(keyword).takeIf { it >= 0 } ?: error("keyword not found")

    println("'$keyword' was found in '$input'")
    println(input)
    println(" ".repeat(index) + "^")
}

fun main3(args: Array<String>) {
    val list1 = listOf("a", "b")
    val list2 = listOf("x", "y", "z")
    val minSize = minOf(list1.size, list2.size)
    val longestList = maxOf(list1, list2, compareBy{it.size})

    println("minSize = $minSize")
    println("longestSize = $longestList")
}

fun main(args: Array<String>) {
//sampleStart
    val squares = List(10) { index -> index * index }
    val mutable = MutableList(10) { 0 }
//sampleEnd
    println("squares: $squares")
    println("mutable: $mutable")
}

