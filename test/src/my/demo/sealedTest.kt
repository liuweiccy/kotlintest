package my.demo

sealed class Expr

data class Const(val number: Double) : Expr()
data class Sum1(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr) : Double = when (expr) {
    is Const -> expr.number
    is Sum1   -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
}

abstract class Comparable<in T> {
    abstract fun compareTo(other: T): Int
}

fun demo(x : Comparable<Number>) {
    x.compareTo(1.0)
    val y : Comparable<Double> = x
}

class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
    inner class Inner {
        fun foo() = bar
    }
}

fun main(args: Array<String>) {
    val demo = Outer.Nested()
    println(demo.foo())
    val demo1 = Outer().Inner()
    println(demo1.foo())
    println(eval(NotANumber))
    println(eval(Const(3.0)))
    println(eval(Sum1(Const(2.0), Const(1.0))))
}

