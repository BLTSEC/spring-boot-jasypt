package edu.acu.jasypt

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.env.Environment

@SpringBootApplication
class JasyptApplication {

    @Bean
    fun init(environment: Environment) = CommandLineRunner {
        val oraclePassword = environment.getProperty("oracle.password")
        println("The decrypted password is: $oraclePassword")
    }
}

fun main(args: Array<String>) {
    runApplication<JasyptApplication>(*args)
}
