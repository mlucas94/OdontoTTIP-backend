package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.persistence

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Turno
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TurnoPersistence: CrudRepository<Turno, Long> {

    override fun findById(id: Long): Optional<Turno>

    override fun deleteById(id: Long)

}