package Entity;

import javax.persistence.*;
import java.util.List;

@Entity

public class Medico extends Trabajador{
    @OneToMany(mappedBy = "medico")
    private List<Consulta> lconsultas;

    @ManyToMany
    @JoinTable(name = "sucesos_madico", joinColumns = @JoinColumn(name = "dni"))
    private List<Suceso> lsucesos;

    @OneToMany(mappedBy = "medico")
    private List<Enfermero> lenfermeros;

    public Medico() {
    }

    public Medico(String dni, String nss, String nombre, String direccion, String telefono) {
        super(dni, nss, nombre, direccion, telefono);
    }

}
