package section8.code2

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    launch(CoroutineName("Parent coroutine")) {
        launch(CoroutineName("Coroutine1") + Job()) {
            launch(CoroutineName("Coroutine3")) {
                throw Exception("예외 발생")
            }
            delay(100)
            println("[${Thread.currentThread().name}] 코루틴 실행")
        }
        launch(CoroutineName("Coroutine2")) {
            delay(100)
            println("[${Thread.currentThread().name}] 코루틴 실행")
        }
    }
}