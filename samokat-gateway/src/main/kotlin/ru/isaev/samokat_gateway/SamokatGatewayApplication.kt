package ru.isaev.samokat_gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SamokatGatewayApplication

fun main(args: Array<String>) {
	runApplication<SamokatGatewayApplication>(*args)
}
