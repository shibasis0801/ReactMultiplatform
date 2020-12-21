package com.overlord.reactmulti.library


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
