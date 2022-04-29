package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.dto

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Paciente
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Turno
import java.time.LocalDateTime

class TurnoDTO(idTurno: Long?, idPaciente: Long?, fecha: LocalDateTime?,
               inicioTurno: String) {

    var idTurno: Long? = idTurno

    var idPaciente: Long? = idPaciente

    var fecha: LocalDateTime? = fecha

    var inicioTurno: String = inicioTurno

    constructor() : this(null, null, null, "") {
    }

    fun fromTurno(turno:Turno): TurnoDTO {
        var paciente = turno.paciente!!

        return TurnoDTO(turno.id, paciente.id, turno.fecha,turno.horaInicio)
    }

    fun turnoFromDTO(): Turno {
        var turno: Turno = Turno()
        turno.paciente = null //falta metodo para recuperar paciente de la base de datos con el id
        turno.fecha = fecha
        turno.horaInicio = inicioTurno

        return turno
    }




}