package Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "sucesos")
public class Suceso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsuceso")
    private int id;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "intervencion")
    private Boolean intervencion;

    @ManyToMany(mappedBy = "lsucesos")
    private List<Medico> lmedicos;

    public Suceso() {
    }

    public Suceso(int id, String descripcion, LocalDate fecha, Boolean intervencion) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.intervencion = intervencion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Boolean getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(Boolean intervencion) {
        this.intervencion = intervencion;
    }
}
