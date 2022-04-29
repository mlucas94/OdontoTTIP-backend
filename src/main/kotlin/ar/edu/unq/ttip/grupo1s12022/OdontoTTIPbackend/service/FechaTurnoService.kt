package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.service

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.dto.TurnoDTO
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.FechaDeTurno
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model.Turno
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.persistence.FechaDeTurnoPersistence
import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.persistence.PacientePersistence
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class FechaTurnoService {

    @Autowired
    lateinit var fechaDeTurnoRepository: FechaDeTurnoPersistence

    @Transactional(readOnly = true)
    fun getFecha(fecha :String) = fechaDeTurnoRepository.findByFecha(fecha.replace("-","/"))

    @Transactional
    fun saveFechaTurno(fecha: FechaDeTurno) {
        fechaDeTurnoRepository.save(fecha)
    }

    @Transactional
    fun updateFecha(fecha: FechaDeTurno) {
        var fechaAntigua = fechaDeTurnoRepository.findByFecha(fecha.fecha!!)
        var fechaNueva = fechaAntigua
        fechaNueva.horariosDisponible = fecha.getHorarios()
        fechaDeTurnoRepository.save(fechaNueva)
    }

}