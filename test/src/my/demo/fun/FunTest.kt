package my.demo.`fun`



tailrec fun findFixPoint(x: Double = 1.0) : Double =
        if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

fun main(args: Array<String>) {
    println(findFixPoint(0.0))
    val sum = {x : Int,y : Int -> x + y}
    println(sum(1,4))


    val sum1:Int.(other: Int) -> Int = { other -> this + other }
    println(1.sum1(2))
    val sum2 = fun Int.(other1: Int) : Int = other1 + this
    println(1.sum2(2))
}

