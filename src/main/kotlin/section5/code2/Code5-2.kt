package section5.code2

import kotlinx.coroutines.*

fun main() = runBlocking {
    val async1 = async {
        delay(1000)
        return@async "Hello Coroutine1!"
    }

    val async2 = async {
        delay(1000)
        return@async "Hello Coroutine2!"
    }

    val awaitAll = awaitAll(async1, async2)
    println(awaitAll)
}
