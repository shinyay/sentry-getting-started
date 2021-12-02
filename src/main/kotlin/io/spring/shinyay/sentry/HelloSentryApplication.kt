package io.spring.shinyay.sentry

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloSentryApplication

fun main(args: Array<String>) {
	runApplication<HelloSentryApplication>(*args)
}
