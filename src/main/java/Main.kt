// Copyright © FunctionalKotlin.com 2017. All rights reserved.

class Connector {
    fun connect(host: String, port: Int) {
        //connection logic
    }

    fun connect(host: String) {
        connect(host, 80)
    }

    fun connect(port: Int)  {
        connect("localhost", port)
    }

    fun connect() {
        connect("localhost")
    }
}