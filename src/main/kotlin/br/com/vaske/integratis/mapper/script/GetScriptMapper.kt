package br.com.vaske.integratis.mapper.script

import br.com.vaske.integratis.dto.script.GetScriptDto
import br.com.vaske.integratis.mapper.Mapper
import br.com.vaske.integratis.model.Script
import org.springframework.stereotype.Component

@Component
class GetScriptMapper : Mapper<Script, GetScriptDto> {
    override fun map(t: Script): GetScriptDto {
        return GetScriptDto(
            id = t.id,
            name = t.name,
            description = t.description,
            cron = t.cron,
            requiredParams = t.requiredParams,
            path = t.path,
            createdAt = t.createdAt,
            updatedAt = t.updatedAt,
            createdBy = t.createdBy.name,
            updatedBy = t.updatedBy.name,
            status = t.status
        )
    }
}