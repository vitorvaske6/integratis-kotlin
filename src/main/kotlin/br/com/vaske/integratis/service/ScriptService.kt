package br.com.vaske.integratis.service

import br.com.vaske.integratis.dto.script.GetScriptDto
import br.com.vaske.integratis.dto.script.NewScriptDto
import br.com.vaske.integratis.mapper.script.GetScriptMapper
import br.com.vaske.integratis.mapper.script.NewScriptMapper
import br.com.vaske.integratis.model.Script
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ScriptService(
    private var scripts: List<Script> = ArrayList(),
    private val getScriptMapper: GetScriptMapper,
    private val newScriptMapper: NewScriptMapper,
) {
//    init {
//        val user = User(
//            id = 1,
//            name = "Test User",
//            email = "vitorvaske6@gmail.com",
//            login = "master",
//            password = "senha123",
//            createdAt = LocalDateTime.now(),
//            updatedAt = LocalDateTime.now(),
//            status = Status.ACTIVE,
//            createdBy = null,
//            updatedBy = null
//        )
//        val script = Script(
//            id = 1,
//            name = "Test Script",
//            description = "This is a test script",
//            cron = "0 0/5 * * * ?",
//            requiredParams = "",
//            path = "",
//            createdAt = LocalDateTime.now(),
//            updatedAt = LocalDateTime.now(),
//            createdBy = user,
//            updatedBy = user,
//            status = Status.ACTIVE,
//        )
//        val script2 = Script(
//            id = 2,
//            name = "Test Script 2",
//            description = "This is a test script 2",
//            cron = "0 0/5 * * * ?",
//            requiredParams = "",
//            path = "",
//            createdAt = LocalDateTime.now(),
//            updatedAt = LocalDateTime.now(),
//            createdBy = user,
//            updatedBy = user,
//            status = Status.ACTIVE,
//        )
//        scripts = listOf(script, script2)
//    }

    /**
     * This method is responsible for returning a list of scripts.
     * @return List<Script>
     */
    fun getAllScripts(): List<GetScriptDto> {
        return scripts.stream().map { it -> getScriptMapper.map(it) }.toList()
    }


    /**
     * This method is responsible for returning a Script searching by its ID.
     * @param id Long
     * @return Script
     */
    fun getById(id: Long): GetScriptDto {
        val script = scripts.stream().filter { it ->
            it.id == id
        }.findFirst().get()
        return getScriptMapper.map(script)
    }

    /**
     * This method is responsible for creating a new script.
     * @param dto NewScriptDto
     * @return Script
     */
    fun createScript(dto: NewScriptDto): GetScriptDto {
        val newScript = newScriptMapper.map(dto)
        val newId = scripts.size.toLong() + 1
        newScript.id = newId
        scripts.plus(newScript)
        return getById(newId)
    }
}
