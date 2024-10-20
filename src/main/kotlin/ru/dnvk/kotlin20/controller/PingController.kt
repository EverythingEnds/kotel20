package ru.dnvk.kotlin20.controller

import org.springframework.http.ResponseEntity
import ru.dnvk.kotlin20.controller.interfaces.IPingController

class PingController : IPingController {
    override fun ping(): ResponseEntity<String> {
        val answer = "Pong"
        return ResponseEntity.ok(answer)
    }
}