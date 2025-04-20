package section6.code1

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val coroutineContext = newSingleThreadContext("SingleThread") + CoroutineName("CoroutineName")

    launch(coroutineContext) {
        println("[${Thread.currentThread().name}] 실행")
    }
}
