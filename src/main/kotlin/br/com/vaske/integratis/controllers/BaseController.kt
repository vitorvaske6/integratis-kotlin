package br.com.vaske.integratis.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
open class BaseController {
    @GetMapping(value = ["/", "/health"])
    fun default(): String {
        return "App is up and running!"
    }
}