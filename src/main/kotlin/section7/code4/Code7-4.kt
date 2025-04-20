package section7.code4

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val parentJob = coroutineContext[Job]
    launch {
        val childrenJob = coroutineContext[Job]
        println("1. 자식 코루틴의 Job이 가지고 있는 parent는 부모 코루틴의 Job인가? ${parentJob == childrenJob?.parent}")
        println("2. 부모 코루틴의 Job은 자식 코루틴의 Job을 가지는가? ${parentJob?.children?.contains(childrenJob)}")
    }
}
