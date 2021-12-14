package Entity;

import javax.persistence.*;

@Entity
@Table(name = "consultas")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idSala")
    private int idSala;
    @ManyToOne
    @JoinColumn(name="dni")
    private Medico medico;
    @ManyToOne
    @JoinColumn(name = "idPlanta")
    private Planta planta;

    public Consulta() {
    }

    public Consulta(int idSala) {
        this.idSala = idSala;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }
}
