package my.demo.coroutine

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureTimeMillis

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L) // pretend we are doing something useful here, too
    return 29
}

fun main(args: Array<String>) = runBlocking<Unit> {
    val time = measureTimeMillis {
        println("111")
        val one = doSomethingUsefulOne()
        println("222")
        val two = doSomethingUsefulTwo()
        println("333")
        println("The answer is ${one + two}")
    }
    println("Completed in $time ms")
}

