package br.com.vaske.integratis.model

import java.time.LocalDateTime

data class Log(
    val id: Int,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val message: String,
    val level: String,
    val service: Service,
    val Job: Job?
)

enum class Service {
    SCRIPT,
    JOB,
    SYSTEM
}