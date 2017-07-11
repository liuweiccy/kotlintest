package my.demo

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

//fun main(args: Array<String>) {
//    fun printLength(obj: Any) {
//        println("$obj string length is ${getStringLength(obj) ?: " ... error, not a string "}")
//    }
//    printLength("Incomprehendibilities")
//    printLength(1000)
//    printLength(listOf(Any()))
//}

//fun main(args: Array<String>) {
//    val items = listOf<String>("apple", "banana", "kiwi")
//    for (item in items) {
//        println(item)
//    }
//}

//fun main(args: Array<String>) {
//    val items = listOf("apple", "banana", "kiwi")
//    for (index in items.indices) {
//        println(items[index])
//    }
//}

//fun describe(obj: Any): String =
//        when(obj) {
//            1           -> "One"
//            "Hello"     -> "Greeting"
//            is Long     -> "Long"
//            !is String  -> "not a string"
//            else        -> "Unknown"
//        }
//
//fun main(args: Array<String>) {
//    println(describe(1))
//    println(describe("Hello"))
//    println(describe(100L))
//    println(describe(2))
//    println(describe("sss"))
//}

//fun main(args: Array<String>) {
//    val x = 10
//    val y = 9
//    if (x in 1..y+1) {
//        println("fits in range")
//    }
//}

//fun main(args: Array<String>) {
//    val list = listOf("a", "b", "b")
////    if (-1 !in 0..list.lastIndex) {
////        println("-1 is out od range")
////    }
////
////    if (list.size !in list.indices) {
////        println("list size is out of valid list indices range too")
////    }
////
////    for (x in 1..5 step 2) {
////        println(x)
////    }
////
////    for (x in 10 downTo 0 step 3) {
////        println(x)
////    }
//    when {
//        "a" in list -> println("juicy")
//        "b" in list -> println("b is a char")
//    }
//}

/*fun main(args: Array<String>) {
    val fruits = listOf("banana", "avocado", "apple", "kiwi")

    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach{ println(it)}
}*/

fun main(args: Array<String>) {
    val text = """
        > test
        > ben
        > vv
    """
    println(text.trimMargin(">"))
}