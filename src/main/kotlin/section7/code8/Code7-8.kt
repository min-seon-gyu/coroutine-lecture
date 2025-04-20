package section7.code8

import kotlinx.coroutines.*

fun main() {
    val coroutineScope = CoroutineScope(Dispatchers.IO)
    coroutineScope.launch {
        delay(100)
        println("[${Thread.currentThread().name}] 코루틴 실행 완료")
    }
    Thread.sleep(1000)
}
