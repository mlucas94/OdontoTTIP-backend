package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.controller

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.service.PacienteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PacienteController {

    @Autowired
    lateinit var pacienteService: PacienteService

    @GetMapping("/api/paciente/{id}")
    fun getPaciente(@PathVariable id: Long) = pacienteService.getPaciente(id)
}