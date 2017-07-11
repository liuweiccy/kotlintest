package my.demo

open class Base(p: Int) {
    init {
        println("Base主构造函数")
    }

    open fun v() {}
    fun nv() {}
}

open class Derived(p: Int) : Base(p) {
    init {
        println("Derived主构造函数")
    }
    override fun v() {}
}

class SubDeri(p: Int) : Derived(p) {
    override fun v() {}
}

class Apple : Base {
    constructor(p: Int) : super(p) {
        println(p)
    }
    constructor(p: Int, a: String) : super(p) {
        println(a)
        println(p)
    }
}

open class Foo {
    open val x: Int get() {return 10}
}

class Bar1 : Foo() {
    override val x: Int = 20
}


open class A {
    open fun f() { println("A")}
    fun a() { println("a")}
}

interface B {
    fun f() { println("B")}
    fun b() { println("b")}
}

class C : A(), B {
    override fun f() {
        super<A>.f()
        super<B>.f()
    }

    val isEmpty: Boolean
        get() = false
    var stringRepresentation: String
        get() = this.toString()
        set(value) {this.stringRepresentation = value}

}

fun main(args: Array<String>) {
    val derived = Derived(1)
    Apple(1, "1")
    val c = C()
    c.a()
    c.b()
    c.f()
}

