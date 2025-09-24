package br.com.vaske.integratis.model

import java.time.LocalDateTime

data class Job (
    var id: Long? = null,
    val isRunning: Boolean,
    val lastExecution: LocalDateTime = LocalDateTime.now(),
    val nextExecution: LocalDateTime = LocalDateTime.now(),
    val cron: String,
    val cronTranslation: String
)
