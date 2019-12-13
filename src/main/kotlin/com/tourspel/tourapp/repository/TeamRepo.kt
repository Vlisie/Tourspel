package com.tourspel.tourapp.repository

import com.tourspel.tourapp.domain.Team
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 12-12-19.
 */
@Repository
interface TeamRepo : CrudRepository<Team, Int> {

/*    fun findAllDTO(): Collection<TeamDTO>{
        return findAll().map { t -> TeamDTO(t.id, t.name) }
    }*/
}
