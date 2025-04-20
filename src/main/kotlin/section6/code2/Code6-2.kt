package section6.code2

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val coroutineContext = newSingleThreadContext("SingleThread") + CoroutineName("CoroutineName")
    val newCoroutineContext = coroutineContext + CoroutineName("NewCoroutineName")

    launch(newCoroutineContext) {
        println("[${Thread.currentThread().name}] 실행")
    }
}
