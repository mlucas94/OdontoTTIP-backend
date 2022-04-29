package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.controller

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.dto.TurnoDTO
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.FechaDeTurno
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Turno
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.service.FechaTurnoService
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.service.TurnoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["*"], methods = [RequestMethod.POST, RequestMethod.GET])
class FechaDeTurnoController {

    @Autowired
    private lateinit var fechaService: FechaTurnoService

    @GetMapping("/api/fecha/{id}")
    fun getFecha(@PathVariable id:String) =
        fechaService.getFecha(id)


    @PostMapping("/api/fecha")
    fun saveFecha(@RequestBody fecha: FechaDeTurno) = fechaService.saveFechaTurno(fecha)

    @PostMapping("/api/fechaUpdate")
    fun updateFecha(@RequestBody fecha: FechaDeTurno) = fechaService.updateFecha(fecha)

}
