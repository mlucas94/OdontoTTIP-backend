package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.service

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.dto.TurnoDTO
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Turno
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.persistence.TurnoPersistence
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.server.ResponseStatusException

@Service
class TurnoService {

    @Autowired
    lateinit var turnoRepository: TurnoPersistence


    @Transactional(readOnly = true)
    fun getTurno(id: Long): TurnoDTO {
        var turno = turnoRepository.findById(id).orElseThrow {
            ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontro el turno con el id $id")
        }
        return TurnoDTO().fromTurno(turno)
    }


    @Transactional(readOnly = true)
    fun getTurnos(): MutableIterable<Turno> =
        turnoRepository.findAll()

    @Transactional
    fun deleteTurno(id: Long) {
        turnoRepository.deleteById(id)
    }

    @Transactional
    fun saveTurno(turno: Turno): TurnoDTO {
        turno.validar()
        var result = TurnoDTO()
        var turnoGuardado = turnoRepository.save(turno)
        return result.fromTurno(turnoGuardado)
    }

}