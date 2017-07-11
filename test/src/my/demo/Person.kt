package my.demo

class Person constructor(firstName: String) {
    init {
        println("主函数构造函数")
    }

    val customerKey = firstName.toUpperCase()
    var customerValue:String = ""

    constructor(firstName: String, lastName: String): this(firstName) {
        customerValue = lastName.toUpperCase()
    }
}

fun main(args: Array<String>) {
    val p = Person("BigVV", "Liu")
    println(p.customerKey)
    println(p.customerValue)
    val list = mutableListOf(1,3,4)
    list.swap(0,2)
    println(list)
}
