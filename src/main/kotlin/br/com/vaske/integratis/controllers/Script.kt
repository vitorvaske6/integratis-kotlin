package br.com.vaske.integratis.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/scripts")
class Script : BaseController() {

    @GetMapping("/")
    fun getAllScripts(): String {
        return "Get all scripts"
    }

}