package br.com.vaske.integratis.controller

import br.com.vaske.integratis.dto.script.GetScriptDto
import br.com.vaske.integratis.dto.script.NewScriptDto
import br.com.vaske.integratis.service.ScriptService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("/scripts")
class ScriptController(private val service: ScriptService) {

    @Operation(summary = "Returns a list of scripts", description = "Returns a list of scripts")
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200",
                description = "Successfully retrieved scripts",

                ),
            ApiResponse(responseCode = "404", description = "No scripts found"),
        ]
    )
    @GetMapping("")
    fun getAllScripts(): List<GetScriptDto> {
        return service.getAllScripts()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): GetScriptDto {
        return service.getById(id)
    }

    @Operation(
        summary = "Creates a new script",
        description = "Creates a new script from a JSON script object",
    )
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200",
                description = "Script created successfully",
//                content = [Content(schema = Schema(implementation = String::class))]
            ),
            ApiResponse(
                responseCode = "400",
                description = "Invalid request"
            )
        ]
    )
    @PostMapping("")
    fun createScript(@RequestBody @Valid script: NewScriptDto): GetScriptDto {
        return service.createScript(script)
    }

}