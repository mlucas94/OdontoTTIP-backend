package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.service

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Paciente
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.persistence.PacientePersistence
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PacienteService {

    @Autowired
    lateinit var pacienteRepository: PacientePersistence

    @Transactional(readOnly = true)
    fun getPaciente(id :Long) = pacienteRepository.findById(id)

    @Transactional(readOnly = true)
    fun getPacientes() = pacienteRepository.findAll()
}