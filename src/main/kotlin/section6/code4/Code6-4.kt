package section6.code4

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val coroutineName = CoroutineName("CoroutineName")
    val coroutineDispatcher = Dispatchers.IO
    val coroutineContext = coroutineName + coroutineDispatcher

    println(coroutineContext[coroutineName.key])
    println(coroutineContext[coroutineDispatcher.key])
}
