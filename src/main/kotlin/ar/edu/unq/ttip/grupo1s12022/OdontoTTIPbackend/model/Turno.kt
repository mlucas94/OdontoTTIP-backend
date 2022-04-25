package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.dto.TurnoDTO
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.exceptions.TurnoException
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name="turno")
class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "paciente_id")
    var paciente: Paciente? = null

    @Column
    var fecha: LocalDateTime? = null

    fun validar() {
        if (paciente === null) {
            throw TurnoException("El turno debe pertenecer a un paciente registrado")
        }
        paciente!!.validar()
        if (fecha === null) {
            throw TurnoException("El turno necesita tener una fecha asignada")
        }

    }

    fun horaFinTurno(): LocalDateTime {
        val horaFin: LocalDateTime = fecha!!.plusMinutes(30)
        return horaFin
    }

}