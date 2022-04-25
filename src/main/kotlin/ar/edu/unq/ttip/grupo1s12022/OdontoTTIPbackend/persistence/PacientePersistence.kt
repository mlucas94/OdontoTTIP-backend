package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.persistence

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Paciente
import org.springframework.data.repository.CrudRepository
import java.util.*

interface PacientePersistence: CrudRepository<Paciente, Long> {

    override fun findById(id:Long): Optional<Paciente>

    fun findByNombreStartingWith(nombre:String): List<Paciente>

}