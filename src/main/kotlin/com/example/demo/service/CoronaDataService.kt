package com.example.demo.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class CoronaDataService {
    val logger: Logger = LoggerFactory.getLogger(this.javaClass)

    fun requestRki() {
        val restTemplate = RestTemplate()
        val result = restTemplate.getForObject("https://api.corona-zahlen.org/states", String::class.java)
        logger.info(result)
    }
}
