package ar.edu.unq.ttip.grupo1s12022.OdontoTTIPbackend.model

import javax.persistence.*

@Entity
@Table(name="fecha")
class FechaDeTurno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(unique = true)
    var fecha: String? = null

    @ElementCollection // 1
    @JoinTable(name = "horarios")
    @JoinColumn(name = "id")// 2
    @Column(name = "horarioDisponible") // 3
    var horariosDisponible: List<String> = arrayListOf("10:00","10:30","11:00","11:30","12:00","12:30","14:00","15:00","16:00")

    fun getHorarios(): List<String> {
        return horariosDisponible
    }


}