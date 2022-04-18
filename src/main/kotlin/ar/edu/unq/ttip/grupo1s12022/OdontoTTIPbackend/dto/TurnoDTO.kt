package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.dto

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Turno
import java.time.LocalDateTime

class TurnoDTO(idTurno: Long?, dniPaciente: Int?, nombrePaciente: String, fechaTurno: LocalDateTime?,
               emailPaciente: String, telefonoPaciente: String, finTurno: LocalDateTime?) {

    var id: Long? = idTurno

    var dni: Int? = dniPaciente

    var nombre: String = nombrePaciente

    var email: String = emailPaciente

    var telefono: String = telefonoPaciente

    var fecha: LocalDateTime? = fechaTurno

    var horaFinTurno: LocalDateTime? = finTurno

    constructor() : this(null, null, "", null, "", "", null) {
    }

    fun fromTurno(turno:Turno): TurnoDTO =
        TurnoDTO(turno.id, turno.dni, turno.nombre, turno.fecha,
            turno.email, turno.telefono, turno.horaFinTurno())

    fun turnoFromDTO(turnoDTO: TurnoDTO): Turno {
        var turno: Turno = Turno()
        turno.dni = turnoDTO.dni
        turno.nombre = turnoDTO.nombre
        turno.email = turnoDTO.email
        turno.telefono = turnoDTO.telefono
        turno.fecha = turnoDTO.fecha

        return turno
    }




}