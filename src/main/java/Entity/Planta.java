package Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "consulta")
public class Planta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idPlanta")
    private int idPlanta;
    @OneToMany(mappedBy = "planta")
    private List<Consulta> lconsultas;

    @ManyToMany(mappedBy = "lplantas")
    private List<Enfermero> lenfermeros;
    @ManyToMany(mappedBy = "lplantass")
    private List<Limpiador> llimpiadores;

    /*@ManyToMany
    @JoinTable(name = "planta_limpiador",joinColumns =   @JoinColumn(name="idPlanta"),
            inverseJoinColumns = @JoinColumn(name="iddepartment"))
    private List<Department> ldepartments;*/


    public Planta() {
    }

    public Planta(int idPlanta) {
        this.idPlanta = idPlanta;
    }

    public int getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }
}
