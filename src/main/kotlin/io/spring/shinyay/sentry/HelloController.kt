package io.spring.shinyay.sentry

import io.sentry.Sentry
import io.sentry.spring.tracing.SentrySpan
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(val service: HelloService) {

    @GetMapping("/")
    @SentrySpan(operation = "hello")
    fun hello(): String {
        try {
            throw Exception("This is a test.")
        } catch (e: Exception) {
            Sentry.captureException(e)
        }
        return service.hello()
    }

}
