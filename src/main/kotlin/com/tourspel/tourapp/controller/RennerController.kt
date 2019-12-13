package com.tourspel.tourapp.controller

import com.tourspel.tourapp.dto.RennerDTO
import com.tourspel.tourapp.repository.RennerRepo
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 12-12-19.
 */
@Controller("/renner")
open class RennerController(private val rennerRepo: RennerRepo) {

    @Get("/{id}")
    fun getRennerDTO(id: Int): RennerDTO {
        return rennerRepo.findOne(id)
    }

    @Get("/string")
    @Produces(MediaType.TEXT_PLAIN)
    fun getString(): String {
        return "testje";
    }

}
