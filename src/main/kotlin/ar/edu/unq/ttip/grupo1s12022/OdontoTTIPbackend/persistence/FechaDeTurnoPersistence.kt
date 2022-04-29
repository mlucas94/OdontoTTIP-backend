package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.persistence

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.FechaDeTurno
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Paciente
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Turno
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface FechaDeTurnoPersistence : CrudRepository<FechaDeTurno, Long> {

    fun findByFecha(id:String): FechaDeTurno

}