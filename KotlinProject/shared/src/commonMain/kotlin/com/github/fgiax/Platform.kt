package com.github.fgiax

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform