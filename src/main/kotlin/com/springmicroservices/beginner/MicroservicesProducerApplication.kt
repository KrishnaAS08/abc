package com.springmicroservices.beginner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
open class MicroservicesProducerApplication

fun main(args: Array<String>) {
    runApplication<MicroservicesProducerApplication>(*args)
}
