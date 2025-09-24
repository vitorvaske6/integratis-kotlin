package br.com.vaske.integratis.dto.script

import br.com.vaske.integratis.model.Status
import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDateTime

@Schema(description = "Script model")
data class GetScriptDto(
    var id: Long? = null,
    val name: String,
    val description: String,
    val cron: String,
    val requiredParams: String?,
    val path: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val createdBy: String,
    val updatedBy: String,
    val status: Status,
)