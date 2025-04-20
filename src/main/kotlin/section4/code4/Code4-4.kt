package section4.code4

import kotlinx.coroutines.*

fun main() = runBlocking {
    val convertImageJob1 = launch(Dispatchers.IO) {
        delay(1000)
        println("[${Thread.currentThread().name}] 이미지1 변환 완료")
    }
    val convertImageJob2 = launch(Dispatchers.IO) {
        delay(1000)
        println("[${Thread.currentThread().name}] 이미지2 변환 완료")
    }

    joinAll(convertImageJob1, convertImageJob2)

    val networkCallJob = launch(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 네트워크 호출")
    }
}