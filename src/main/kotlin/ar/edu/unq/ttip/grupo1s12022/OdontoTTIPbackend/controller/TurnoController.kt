package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.controller

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.service.TurnoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["*"], methods = [RequestMethod.PUT, RequestMethod.GET])
class TurnoController {

    @Autowired private lateinit var turnoService: TurnoService

    @GetMapping("/api/turno/{id}")
    fun getTurno(@PathVariable id:Long) =
        turnoService.getTurno(id)

    @GetMapping("/api/turnos")
    fun getTurnos() = turnoService.getTurnos()

    @DeleteMapping("/api/turno/{id}")
    fun deleteTurno(@PathVariable id:Long) = turnoService.deleteTurno(id)

}