package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class ExampleController {

    @Get
    fun hello() = "Hello World"
}