// Copyright © FunctionalKotlin.com 2017. All rights reserved.

class Connector(val host: String?, val port: Int?) {
    fun connect() {
        println("Connecting to $host:$port")
    }
}

class ConnectorBuilder {
    var connector = Connector(null, null)

    fun setHost(host: String): ConnectorBuilder {
        connector = Connector(host, connector.port)

        return this
    }

    fun setPort(port: Int): ConnectorBuilder {
        connector = Connector(connector.host, port)

        return this
    }

    fun build(): Connector = connector
}

fun main(args: Array<String>) {
    ConnectorBuilder()
        .setHost("localhost")
        .setPort(80)
        .build()
        .connect()
}