package my.demo

open class A1(x : Int) {
    public open val y : Int = x
}

interface B1{}

val ab : Any = object : A1(1), B {
    override val y = 15
}