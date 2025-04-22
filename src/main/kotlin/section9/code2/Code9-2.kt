package section9.code2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    repeat(10) {
        launch {
            delay(1000)
            println("[${getElapsedTime(startTime)}] 코루틴${it} 실행 완료")
        }
    }
}

fun getElapsedTime(startTime: Long): String {
    return "지난 시간 : ${System.currentTimeMillis() - startTime}ms"
}