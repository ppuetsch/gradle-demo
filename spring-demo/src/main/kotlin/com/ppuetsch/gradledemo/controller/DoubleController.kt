package com.ppuetsch.gradledemo.controller

import org.springframework.web.bind.annotation.GetMapping
import com.ppuetsch.gradledemo.library.DoubleUp
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class DoubleController {
    @GetMapping("/double/{x}")
    fun getDouble(@PathVariable x: Double) = DoubleUp().double(x)
}