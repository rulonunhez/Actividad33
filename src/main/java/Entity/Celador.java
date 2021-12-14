package Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Celador extends Trabajador{
    private String turno;

    public Celador() {
    }

    public Celador(String turno) {
        this.turno = turno;
    }

    public Celador(String dni, String nss, String nombre, String direccion, String telefono, String turno) {
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
