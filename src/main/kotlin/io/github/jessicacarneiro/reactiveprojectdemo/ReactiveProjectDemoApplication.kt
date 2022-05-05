package io.github.jessicacarneiro.reactiveprojectdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveProjectDemoApplication

fun main(args: Array<String>) {
	runApplication<ReactiveProjectDemoApplication>(*args)
}
