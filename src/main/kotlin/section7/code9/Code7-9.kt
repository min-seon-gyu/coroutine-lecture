package section7.code9

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        val currentJob = this.coroutineContext[Job]
        val newJob = Job(currentJob)
        launch(newJob) {
            delay(1000)
        }
    }
    Thread.sleep(1000)
}
