package ru.dnvk.kotlin20.controller.interfaces

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

@Tag(name = "Ping API", description = "API для трассировки сообщений серверу")
interface IPingController {
    @GetMapping("/ping")
    fun ping(): ResponseEntity<String>
}