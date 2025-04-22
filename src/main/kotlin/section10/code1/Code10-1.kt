package section10.code1

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

var count = 0

fun main() = runBlocking {
    println("[${Thread.currentThread().name}]")
    withContext(Dispatchers.Default) {
        println("[${Thread.currentThread().name}]")
        repeat(10000) {
            launch {
                count += 1
            }
        }
    }
    println("Count: $count")
}