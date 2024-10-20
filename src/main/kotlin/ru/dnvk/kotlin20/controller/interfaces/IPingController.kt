package ru.dnvk.kotlin20.controller.interfaces

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("name")
interface IPingController {
    @GetMapping("/ping")
    fun ping(): ResponseEntity<String>
}