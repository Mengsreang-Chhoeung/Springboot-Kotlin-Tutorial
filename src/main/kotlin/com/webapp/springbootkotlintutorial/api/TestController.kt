package com.webapp.springbootkotlintutorial.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("testing-page")
class TestController {
    @GetMapping
    fun testingPage(): String {
        return "<h1>Hello Testing Page😋</h1>"
    }
}