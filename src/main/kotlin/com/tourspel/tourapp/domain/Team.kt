package com.tourspel.tourapp.domain

import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import javax.persistence.*

/**
 * @author [Tes van der Vlist](mailto:tes.van.der.vlist@itris.nl)
 * Created on 12-12-19.
 */
@Entity
@Table(name = "teams", schema = "public", catalog = "tourspel")
class Team {
    @get:Column(name = "id", nullable = false)
    @get:Id
    var id = 0
    @get:Column(name = "name", nullable = false, length = 80)
    @get:Basic
    var name: String? = null
    @get:OneToMany(mappedBy = "teamsByTeamId")
    var rennersById: Collection<Renner>? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val team = o as Team
        return EqualsBuilder()
                .append(id, team.id)
                .append(name, team.name)
                .isEquals
    }

    override fun hashCode(): Int {
        return HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .toHashCode()
    }
}
