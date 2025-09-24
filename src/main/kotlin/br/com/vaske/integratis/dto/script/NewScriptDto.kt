package br.com.vaske.integratis.dto.script

import br.com.vaske.integratis.model.Status
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.time.LocalDateTime

@Schema(description = "Script model")
data class NewScriptDto(
    @Schema(
        description = "Automatically generated ID",
        example = "1",
        type = "long",
        readOnly = true,
    ) var id: Long? = null,
    @Schema(
        description = "Name of the script",
        example = "Script Name",
        minimum = "3",
        maximum = "255",
    ) val name: String,
    val description: String,
    @Schema(
        description = "Cron definition",
        example = "* * * * *",
        minimum = "12",
    ) val cron: String,
    val requiredParams: String? = "",
    val path: String,
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = LocalDateTime.now(),
    @Schema(
        description = "Cron definition",
        example = "* * * * *",
        nullable = false,
    ) val createdBy: Long,
    @Schema(
        description = "Status",
        nullable = false,
    ) val updatedBy: Long,
    val status: Status = Status.INACTIVE,
)