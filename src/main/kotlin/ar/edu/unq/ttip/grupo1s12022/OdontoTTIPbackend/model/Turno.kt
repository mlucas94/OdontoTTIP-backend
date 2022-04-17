package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model

import java.time.LocalDateTime

class Turno {

    var id: Long? = null

    var dni: Int? = null

    var nombreCompleto: String? = null

    var fecha: LocalDateTime? = null

    var email: String? = null

    var telefono: String? = null

    fun horaFinTurno(): LocalDateTime {
        val horaFin: LocalDateTime = fecha!!.plusMinutes(60)
        return horaFin
    }

}