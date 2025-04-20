package section4.code12

import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val longJob = launch(Dispatchers.Default) {
        yield()
        println("longJob 코루틴 동작")
    }
    
    longJob.cancelAndJoin()
    println("취소 후 동작")
}

fun getElapsedTime(startTime: Long): String {
    return "지난 시간 : ${System.currentTimeMillis() - startTime}ms"
}