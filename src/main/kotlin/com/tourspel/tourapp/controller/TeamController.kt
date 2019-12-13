package com.tourspel.tourapp.controller

import com.tourspel.tourapp.repository.TeamRepo
import io.micronaut.http.annotation.Controller

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 12-12-19.
 */
@Controller("/team")
class TeamController(private val teamRepo: TeamRepo) {

/*    @Get("/")
    fun getTeams(): Collection<TeamDTO> {
        return teamRepo.findAllDTO()
    }*/
}
