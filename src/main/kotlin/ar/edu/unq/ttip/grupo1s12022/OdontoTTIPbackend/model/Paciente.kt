package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model

import ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.exceptions.PacienteException
import javax.persistence.*

@Entity
@Table(name="paciente")
class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    @Column
    var dni: String = ""
    @Column
    var nombre: String = ""
    @Column
    var email: String = ""
    @Column
    var telefono: String = ""

    fun validar() {
        if (nombre.trim() == "") {
            throw PacienteException("Debe ingresar el nombre del paciente")
        }
        if (dni.trim() == "") {
            throw PacienteException("Debe ingresar el dni del paciente")
        }
        if (email.trim() == "" && telefono.trim() == "") {
            throw PacienteException("Se necesita por lo menos un dato de contacto del paciente")
        }
        if (!email.contains("@") && email.trim() != "") {
            throw PacienteException("El email ingresado no es valido")
        }
    }
}