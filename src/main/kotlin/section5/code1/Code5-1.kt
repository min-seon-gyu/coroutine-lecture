package section5.code1

import kotlinx.coroutines.*

fun main() = runBlocking {
    val async = async {
        delay(1000)
        return@async "Hello Coroutine!"
    }

    val result = async.await()
    println(result)
}
