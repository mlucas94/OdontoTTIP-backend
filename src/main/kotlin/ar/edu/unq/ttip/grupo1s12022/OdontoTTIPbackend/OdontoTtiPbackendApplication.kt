package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration
class OdontoTtiPbackendApplication

fun main(args: Array<String>) {
	runApplication<OdontoTtiPbackendApplication>(*args)
}
