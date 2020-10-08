package com.products

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProductsBackApplication

fun main(args: Array<String>) {
	runApplication<ProductsBackApplication>(*args)
}
