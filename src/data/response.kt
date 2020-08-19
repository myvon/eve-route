/**
 * Application API responses.
 */

package net.tkhamez.everoute.data

import net.tkhamez.everoute.EveRoute
import java.util.*

data class ResponseAuthUser(
    val characterId: Int,
    val characterName: String,
    val allianceId: Int?
)

data class ResponseGates(
    var message: String = "",
    var ansiblexes: MutableList<Ansiblex> = mutableListOf()
)

data class ResponseGatesUpdated(
    var message: String = "",
    var allianceId: Int? = null,
    var updated: Date? = null
)

data class ResponseRouteCalculate(
    var message: String = "",
    var route: List<EveRoute.Waypoint> = listOf()
)

data class ResponseRouteSet(
    var message: String = ""
)
