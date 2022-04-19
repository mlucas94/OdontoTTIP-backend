package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.dto

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Turno
import java.time.LocalDateTime

class TurnoDTO(idTurno: Long?, dni: Int?, nombre: String, fecha: LocalDateTime?,
               email: String, telefono: String, finTurno: LocalDateTime?) {

    var id: Long? = idTurno

    var dni: Int? = dni

    var nombre: String = nombre

    var email: String = email

    var telefono: String = telefono

    var fecha: LocalDateTime? = fecha

    var horaFinTurno: LocalDateTime? = finTurno

    constructor() : this(null, null, "", null, "", "", null) {
    }

    fun fromTurno(turno:Turno): TurnoDTO =
        TurnoDTO(turno.id, turno.dni, turno.nombre, turno.fecha,
            turno.email, turno.telefono, turno.horaFinTurno())

    fun turnoFromDTO(): Turno {
        var turno: Turno = Turno()
        turno.dni = dni
        turno.nombre = nombre
        turno.email = email
        turno.telefono = telefono
        turno.fecha = fecha

        return turno
    }




}