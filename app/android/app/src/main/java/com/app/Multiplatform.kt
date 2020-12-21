package com.app

import com.overlord.reactmulti.library.Platform

object Multiplatform {
    fun testMultiplatform(): String {
        return Platform().platform
    }
}