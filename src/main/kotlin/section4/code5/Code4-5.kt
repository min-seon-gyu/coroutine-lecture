package section4.code5

import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val immediateJob = launch {
        println("[${getElapsedTime(startTime)}] 코루틴 실행")
    }
}

fun getElapsedTime(startTime: Long): String {
    return "지난 시간 : ${System.currentTimeMillis() - startTime}ms"
}