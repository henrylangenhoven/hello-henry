package com.lang.hellohenry

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
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

	@GetMapping("/")
	fun hello(): String {
		return helloName("Henry")
	}

	@GetMapping("/{name}")
	fun helloName(@PathVariable name: String): String {
		return "Hello $name!"
	}
}