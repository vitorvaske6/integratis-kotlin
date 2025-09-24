package br.com.vaske.integratis.mapper.script

import br.com.vaske.integratis.dto.script.GetScriptDto
import br.com.vaske.integratis.dto.script.NewScriptDto
import br.com.vaske.integratis.mapper.Mapper
import br.com.vaske.integratis.model.Script
import br.com.vaske.integratis.service.ScriptService
import br.com.vaske.integratis.service.UserService
import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class NewScriptMapper(private val userService: UserService) :
    Mapper<NewScriptDto, Script> {
    override fun map(t: NewScriptDto): Script {
        return Script(
            createdBy = userService.getUserById(t.createdBy),
            updatedBy = userService.getUserById(t.updatedBy),
            name = t.name,
            description = t.description,
            cron = t.cron,
            requiredParams = t.requiredParams,
            path = t.path,
            createdAt = t.createdAt ?: LocalDateTime.now(),
            updatedAt = t.updatedAt ?: LocalDateTime.now(),
            status = t.status,
        )
    }
}