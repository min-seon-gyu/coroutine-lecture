package section7.code7

import kotlinx.coroutines.*

class CustomCoroutineScope : CoroutineScope {
    override val coroutineContext = newSingleThreadContext("CustomCoroutineScope") + CoroutineName("CustomCoroutineName")
}

fun main() {
    val coroutineScope = CustomCoroutineScope()
    coroutineScope.launch {
        delay(100)
        println("[${Thread.currentThread().name}] 코루틴 실행 완료")
    }
    Thread.sleep(1000)
}
