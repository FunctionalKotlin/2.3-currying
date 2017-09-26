// Copyright © FunctionalKotlin.com 2017. All rights reserved.

fun consoleLogger(type: String, msg: String) {
    println("[$type]    $msg")
}

fun operation(a: Int, b: Int, logger: (String, String) -> Unit) {
    if (a <= 0) {
        logger("ERROR", "a must be positive")
        return
    }

    if (b <= 0) {
        logger("ERROR", "b must be positive")
        return
    }

    println("I'm doing something with $a and $b")
}

fun main(args: Array<String>) {
    operation(1, 2, ::consoleLogger)
}