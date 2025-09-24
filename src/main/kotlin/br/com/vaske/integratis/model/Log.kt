package br.com.vaske.integratis.model

import java.time.LocalDateTime

data class Log(
    var id: Int? = null,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val message: String,
    val level: String,
    val service: ServiceEnum,
    val Job: Job?
)