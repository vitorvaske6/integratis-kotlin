package br.com.vaske.integratis.model

import java.time.LocalDateTime

data class User(
    val id: Long,
    val name: String,
    val email: String,
    val login: String,
    val password: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now(),
    val status: Status = Status.INACTIVE,
    val createdBy: User?,
    val updatedBy: User?
)
