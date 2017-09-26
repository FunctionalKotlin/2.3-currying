// Copyright © FunctionalKotlin.com 2017. All rights reserved.

fun connect(host: String): (Int) -> Unit = { port ->
    println("Connecting to $host:$port")
}

fun main(args: Array<String>) {
    connect("localhost")(80)

    val localConnector = connect("localhost")

    localConnector(80)
    localConnector(8888)
}