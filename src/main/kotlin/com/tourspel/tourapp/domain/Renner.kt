package com.tourspel.tourapp.domain

import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import java.util.*
import javax.persistence.*

/**
 * @author [Tes van der Vlist](mailto:tes.van.der.vlist@itris.nl)
 * Created on 12-12-19.
 */
@Entity
@Table(name = "renners", schema = "public", catalog = "tourspel")
class Renner {
    @get:Column(name = "id", nullable = false)
    @get:Id
    var id = 0
    @get:Column(name = "name", nullable = false, length = 80)
    @get:Basic
    var name: String? = null
    @get:Column(name = "birthdate", nullable = false)
    @get:Basic
    var birthdate: Date? = null
    @get:Column(name = "team_id", nullable = false, insertable = false, updatable = false)
    @get:Basic
    var teamId = 0
    @get:JoinColumn(name = "team_id", referencedColumnName = "id", nullable = false)
    @get:ManyToOne
    var teamsByTeamId: Team? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val renner = o as Renner
        return EqualsBuilder()
                .append(id, renner.id)
                .append(teamId, renner.teamId)
                .append(name, renner.name)
                .append(birthdate, renner.birthdate)
                .isEquals
    }

    override fun hashCode(): Int {
        return HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .append(birthdate)
                .append(teamId)
                .toHashCode()
    }

}
