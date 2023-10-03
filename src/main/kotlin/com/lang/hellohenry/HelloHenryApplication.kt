package com.lang.hellohenry

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
class HelloHenryApplication

fun main(args: Array<String>) {
    runApplication<HelloHenryApplication>(*args)
}

@RestController
class HelloController {
    var logger: Logger = LoggerFactory.getLogger(HelloController::class.java)

    @GetMapping("/")
    fun hello(): String {
        return helloName("Henry")
    }

    @GetMapping("/{name}")
    fun helloName(@PathVariable name: String): String {
        logger.info("HelloController.helloName($name)")
        return "Hello $name!"
    }
}