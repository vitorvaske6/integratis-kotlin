package br.com.vaske.integratis.model

import java.time.LocalDateTime

data class Script(
    val id: Long,
    val name: String,
    val description: String,
    val cron: String,
    val requiredParams: String? = "",
    val path: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now(),
    val createdBy: User,
    val updatedBy: User,
    val status: Status = Status.INACTIVE,
)
