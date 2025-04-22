package section9.code1

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

fun main() = runBlocking {
    launch {
        while (true) {
            println("[${Thread.currentThread().name}]  child Hello Coroutine!")
            yield()
        }
    }

    while (true) {
        println("[${Thread.currentThread().name}] parent Hello Coroutine!")
        yield()
    }
}