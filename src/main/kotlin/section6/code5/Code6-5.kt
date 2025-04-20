package section6.code5

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val coroutineName = CoroutineName("CoroutineName")
    val coroutineDispatcher = Dispatchers.IO
    val coroutineContext = coroutineName + coroutineDispatcher

    val deleteCoroutineContext = coroutineContext.minusKey(CoroutineName)

    println(deleteCoroutineContext)
}
