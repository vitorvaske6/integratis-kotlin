package br.com.vaske.integratis.model

import java.time.LocalDateTime

data class Session(
    val id: Long,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now(),
    val user: User,
    val user_agent: String,
    val status: Status = Status.ACTIVE,
)