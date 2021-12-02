package io.spring.shinyay.sentry

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Service

@Service
class HelloService {

    fun hello(): String {
        runBlocking {
            launch {
                delay(2000)
                println("Hello")
            }
        }
        return "Hello, World!"
    }
}
