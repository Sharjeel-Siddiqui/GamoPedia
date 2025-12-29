package com.sharjeel.gamopedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform