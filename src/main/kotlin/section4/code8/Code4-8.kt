package section4.code8

import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val longJob = launch(Dispatchers.Default) {
        repeat(10) {
            delay(1000)
            println("[${getElapsedTime(startTime)}] 반복횟수 ${it}")
        }

    }

    delay(2500)
    longJob.cancel()
}

fun getElapsedTime(startTime: Long): String {
    return "지난 시간 : ${System.currentTimeMillis() - startTime}ms"
}