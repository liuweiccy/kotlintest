package my.demo

//fun sum(a: Int, b: Int): Int {
//    return a + b
//}
//
//fun main(args : Array<String>) {
//    print("sum of 3 and 5 is ")
//    print(sum(3, 5))
//}

fun sum(a: Int, b: Int) = a + b
//fun main(args: Array<String>) {
//    println("sum of 19 and 23 is ${sum(19, 23)}")
//    printSum(23, 17)
//}

fun printSum(a: Int, b: Int) {
    print("sum of $a and $b is ${a + b}")
}

//fun main(args: Array<String>) {
//    val a: Int = 1
//    val b = 2
//    val c: Int
//    c = 3
//    println("a = $a b = $b c = $c")
//}

//fun main(array: Array<String>) {
//    var x = 5
//    x += 1
//    println("x = $x")
//}

//fun main(args: Array<String>) {
//    var a = 1
//    val s1 = "a is $a"
//    a = 2
//    val s2 = "${s1.replace("is", "was")}, but now is $a"
//    println(s2)
//}

//fun maxof(a:Int, b:Int): Int {
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
//}
//
//fun main(args : Array<String>) {
//    println("max of 0 and 42 is ${maxof(0, 42)}")
//}
//
//fun maxof(a:Int, b:Int) = if(a > b) a else b

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun parsePrint(str1: String, str2: String) {
    val x = parseInt(str1)
    val y = parseInt(str2)

    if (x == null) {
        println("$str1 not is number")
        return
    }

    if (y == null) {
        println("$str2 not is number")
        return
    }

    println(x * y)
}

fun main11(args: Array<String>) {
    parsePrint("6", "7")
    parsePrint("6", "b")
    parsePrint("a", "7")
}

//sampleStart
fun getStringLength1(obj: Any): Int? {
    if (obj is String) {
// `obj` 在该条件分支内自动转换成 `String`
        return obj.length
    }
// 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
    return null
}
//sampleEnd
fun main(args: Array<String>) {
    fun printLength(obj: Any) {
        println("'$obj' string length is ${getStringLength1(obj) ?: "... err, not a string"} ")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))
    }

