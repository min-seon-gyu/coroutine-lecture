package section6.code3

import kotlinx.coroutines.*

@OptIn(ExperimentalStdlibApi::class)
fun main() = runBlocking<Unit> {
    val coroutineContext = Dispatchers.IO + CoroutineName("CoroutineName")

    println(coroutineContext[CoroutineName])
    println(coroutineContext[CoroutineDispatcher.Key])
}
