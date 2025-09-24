package br.com.vaske.integratis.model

import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDateTime

@Schema(description = "Script model")
data class Script(
    @field:Schema(
        description = "Automatically generated ID",
        example = "1",
        type = "long",
    )
    var id: Long? = null,
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
