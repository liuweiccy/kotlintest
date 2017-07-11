package my.demo

interface MyInterface {
    val prop: Int
    val propImpl: String
        get() = "foo"

    fun foo() {
        println(prop)
    }
}

class Child : MyInterface {
    override val prop: Int = 29
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main(args: Array<String>) {
    val child = Child()
    println(child.propImpl)
    child.foo()
    val list = mutableListOf(1,2,3)
    list.swap(0,2)
    print(list)
}