package com.tourspel.tourapp.controller

import com.tourspel.tourapp.service.GreetingService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 12-12-19.
 */
@Controller("/")
class HelloController(val greetingService : GreetingService) {

    @Get("/hello/{name}")
    fun hello(name: String): String {
        return greetingService.greet(name)
    }
}
