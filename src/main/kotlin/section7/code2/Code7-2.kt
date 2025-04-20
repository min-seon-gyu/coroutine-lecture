package section7.code2

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val coroutineContext = newSingleThreadContext("SingleThread") + CoroutineName("ParentCoroutineName")

    launch(coroutineContext) {
        println("[${Thread.currentThread().name}] 실행")
        launch(CoroutineName("ChildCoroutineName")) {
            println("[${Thread.currentThread().name}] 실행")
        }
    }
}
