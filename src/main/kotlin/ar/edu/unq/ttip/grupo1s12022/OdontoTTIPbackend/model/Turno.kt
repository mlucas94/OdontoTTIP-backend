package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.dto.TurnoDTO
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.exceptions.TurnoException
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name="turnos")
class Turno {

    @Id
    @GeneratedValue
    var id: Long? = null

    @Column
    var dni: Int? = null

    @Column
    var nombre: String = ""

    @Column
    var fecha: LocalDateTime? = null

    @Column
    var email: String = ""

    @Column
    var telefono: String = ""

    fun validar() {
        if (nombre.trim() == "") {
            throw TurnoException("Debe ingresar el nombre del paciente")
        }
        if (dni === null) {
            throw TurnoException("Debe ingresar el dni del paciente")
        }
        if (fecha === null) {
            throw TurnoException("El turno necesita tener una fecha asignada")
        }
        if (email.trim() == "" && telefono.trim() == "") {
            throw TurnoException("Se necesita por lo menos un dato de contacto del paciente")
        }

    }

    fun horaFinTurno(): LocalDateTime {
        val horaFin: LocalDateTime = fecha!!.plusMinutes(30)
        return horaFin
    }

}