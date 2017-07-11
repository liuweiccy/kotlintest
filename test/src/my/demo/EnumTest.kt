package my.demo

enum class Direction {
    N,
    E,
    S,
    W
}

enum class Color(val rgb: Int) {
    R(0xFFFFFF),
    W(0x000000),
}
enum class  ProtocolState {
    WAITING {
        fun signal() = "TALKING"
    }
}

fun main(args: Array<String>) {
    println(Direction.valueOf("N"))
    println(Color.R)
    println(ProtocolState.WAITING)
    val array: Array<Direction> = Direction.values()
    for (a in array) {
        println(a)
    }
}