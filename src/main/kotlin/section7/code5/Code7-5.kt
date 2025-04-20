package section7.code5

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val parentJob = launch(Dispatchers.IO) {
        val dbResultsDeferred = listOf("db1", "db2", "db3").map {
            async {
                delay(1000L)
                println("${it}로부터 데이터를 가져오는데 성공했습니다.")
                return@async "[${it}]data"
            }
        }
        val dbResult = dbResultsDeferred.awaitAll()

        println(dbResult)
    }
    parentJob.cancel()
}
