package section4.code3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val convertImageJob1 = launch(Dispatchers.IO) {
        delay(1000)
        println("[${Thread.currentThread().name}] 이미지1 변환 완료")
    }
    val convertImageJob2 = launch(Dispatchers.IO) {
        delay(1000)
        println("[${Thread.currentThread().name}] 이미지2 변환 완료")
    }

    convertImageJob1.join()
    convertImageJob2.join()

    val networkCallJob = launch(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 네트워크 호출")
    }
}