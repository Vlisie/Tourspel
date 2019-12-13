package com.tourspel.tourapp.dto

import com.fasterxml.jackson.annotation.JsonFormat
import io.micronaut.core.annotation.Introspected
import java.util.*

/**
 * @author <a href="mailto:tes.van.der.vlist@itris.nl">Tes van der Vlist</a>
 * Created on 12-12-19.
 */
@Introspected
data class RennerDTO (
        var id: Int,
        var name: String,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "CET") var birthdate: Date
)

