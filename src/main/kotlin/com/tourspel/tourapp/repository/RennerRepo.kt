package com.tourspel.tourapp.repository

import com.tourspel.tourapp.domain.Renner
import com.tourspel.tourapp.dto.RennerDTO
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 12-12-19.
 */
@Repository
interface RennerRepo : CrudRepository<Renner, Int> {
    fun findOne(id: Int): RennerDTO
}
