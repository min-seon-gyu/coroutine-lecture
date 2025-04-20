package section7.code6

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    println("${Thread.currentThread().name} 실행")
    val parentJob = launch {
        launch {
            delay(1000)
            println("[${getElapsedTime(startTime)}] 자식 코루틴 실행 완료")
            println("${Thread.currentThread().name} 실행")
        }
        println("[${getElapsedTime(startTime)}] 부모 코루틴이 실행하는 마지막 코드")
        println("${Thread.currentThread().name} 실행")
    }
    parentJob.invokeOnCompletion {
        println("[${getElapsedTime(startTime)}] 부모 코루틴 실행 완료")
        println("${Thread.currentThread().name} 실행")
    }
}

fun getElapsedTime(startTime: Long): String {
    return "지난 시간 : ${System.currentTimeMillis() - startTime}ms"
}