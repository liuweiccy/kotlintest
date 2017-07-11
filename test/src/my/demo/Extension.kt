package my.demo

open class C1 {
    fun foo() = "c1"
}

class D: C1()

fun C1.foo(a: String) = "c"

fun D.foo(a: String) = "d"

fun printFoo(c: C1) {
    println(c.foo("ss"))
}

fun main(args: Array<String>) {
    printFoo(D())
}

val <T> List<T>.lastIndex:Int
    get() = size - 1

class Myclass {
    companion object {}
}

fun Myclass.Companion.foo() = 1