package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.dto

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Paciente
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Turno
import java.time.LocalDateTime

class TurnoDTO(idTurno: Long?, idPaciente: Long?, dni: String, nombre: String, fecha: LocalDateTime?,
               email: String, telefono: String, finTurno: LocalDateTime?) {

    var idTurno: Long? = idTurno

    var idPaciente: Long? = idPaciente

    var dni: String = dni

    var nombre: String = nombre

    var email: String = email

    var telefono: String = telefono

    var fecha: LocalDateTime? = fecha

    var horaFinTurno: LocalDateTime? = finTurno

    constructor() : this(null, null, "", "", null, "", "", null) {
    }

    fun fromTurno(turno:Turno): TurnoDTO {
        var paciente = turno.paciente!!

        return TurnoDTO(turno.id, paciente.id, paciente.dni, paciente.nombre, turno.fecha, paciente.email,
        paciente.telefono, turno.horaFinTurno())
    }

    fun turnoFromDTO(): Turno {
        var turno: Turno = Turno()
        turno.paciente = null //falta metodo para recuperar paciente de la base de datos con el id
        turno.fecha = fecha

        return turno
    }




}