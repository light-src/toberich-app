package org.toberich.stock_analyzer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform