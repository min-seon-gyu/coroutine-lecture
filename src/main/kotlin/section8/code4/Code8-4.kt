package section8.code4

import kotlinx.coroutines.*

fun main() = runBlocking {
    val supervisorJob = SupervisorJob(parent = coroutineContext[Job])
    launch(CoroutineName("Coroutine1") + supervisorJob) {
        launch(CoroutineName("Coroutine3")) {
            throw Exception("예외 발생")
        }
        delay(100)
        println("[${Thread.currentThread().name}] 코루틴 실행")
    }
    launch(CoroutineName("Coroutine2") + supervisorJob) {
        delay(100)
        println("[${Thread.currentThread().name}] 코루틴 실행")
    }
    delay(1000)
}