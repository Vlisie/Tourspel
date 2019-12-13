package com.tourspel.tourapp.dto

import io.micronaut.core.annotation.Introspected

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 12-12-19.
 */
@Introspected
data class TeamDTO(
        var id: Int,
        var name: String?
)
