package section3.code6

import kotlinx.coroutines.*


fun main() = runBlocking<Unit> {
    val imageProcessingDispatcher = Dispatchers.Default.limitedParallelism(2)
    repeat(100) {
        launch(imageProcessingDispatcher) {
            Thread.sleep(1000)
            println("[${Thread.currentThread().name}] 이미지 처리 완료")
        }
    }
}