package ru.dnvk.kotlin20.controller

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.dnvk.kotlin20.controller.interfaces.IPingController

@RestController
class PingController : IPingController {
    override fun ping(): ResponseEntity<String> {
        val answer = "Pong"
        return ResponseEntity.ok(answer)
    }
}