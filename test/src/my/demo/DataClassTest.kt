package my.demo

data class User(val name: String = "",val age: Int = 0)

val jack = User("jack", 10)

fun main1(args: Array<String>) {
    val jack2 = jack.copy(name = "VV")
    println(jack)
    println(jack2)
    val (name, age) = jack2
    println("$name, $age age of years")
}

fun main2(args: Array<String>) {
    val map = mapOf(1 to "one", 2 to "two")
    println(map.mapValues {
        entry -> val (key, value) = entry
        "$key -> $value"
    })

    println(map.mapValues { (key, value) -> "$key -> $value" })
}

typealias str = String

fun main3(args: Array<String>) {
    val name : str = "ccy"
    println("my name is $name")
}

data class Result(val value: Any, val status: String)

fun getResult() = Result(42, "ok").also { println("getResult() returns $it") }

fun main4(args: Array<String>) {
    val(_, status) = getResult()

    println("status is $status")
}


fun main(args: Array<String>) {
    val answer by lazy {
        println("Calculating the answer ...")
        42
    }
    println("The1 answer is $answer")

    println("The answer is $answer")
}
