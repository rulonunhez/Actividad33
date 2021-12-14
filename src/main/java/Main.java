import Entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("Rama Diego");
        try {
            System.out.println("Cambios 5");
            SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            em.getTransaction().commit();
            em.close();
            emf.close();

            System.out.println("Cambios 1");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
