package Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Limpiador extends Trabajador{
    private String turno;
    @ManyToMany
    @JoinTable(name = "Planta_limpiador",joinColumns =   @JoinColumn(name="dni"),
            inverseJoinColumns = @JoinColumn(name="idPlanta"))
    private List<Planta> lplantass;

    public Limpiador() {
    }

    public Limpiador(String turno) {
        this.turno = turno;
    }

    public Limpiador(String dni, String nss, String nombre, String direccion, String telefono, String turno) {
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
