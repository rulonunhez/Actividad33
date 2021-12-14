package Entity;

import javax.persistence.*;
import java.util.List;

@Entity

public class Enfermero extends Trabajador{
    private String turno;
    @ManyToOne
    @JoinColumn(name = "dni")
    private Medico medico;
    @ManyToMany
    @JoinTable(name = "Planta_enfermero",joinColumns =   @JoinColumn(name="dni"),
            inverseJoinColumns = @JoinColumn(name="idPlanta"))
    private List<Planta> lplantas;

    public Enfermero() {
    }

    public Enfermero(String turno) {
        this.turno = turno;
    }

    public Enfermero(String dni, String nss, String nombre, String direccion, String telefono, String turno) {
        super(dni, nss, nombre, direccion, telefono);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
