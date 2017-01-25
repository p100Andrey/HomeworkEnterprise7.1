import org.hibernate.Session;
import ua.i.giggss.SotrudnikEntity;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {

//        Session session = HibernateSessionFactory.getSessionFactory().openSession();

//        session.beginTransaction();

        SotrudnikEntity sotrudnikEntity = new SotrudnikEntity();

        sotrudnikEntity.setIdSotrudnik(3);
        sotrudnikEntity.setFamiliya("Saharov");
        sotrudnikEntity.setImya("Ivan");
        sotrudnikEntity.setDaterojdeniya(new Date(1990-02-02));
        sotrudnikEntity.setTelefon(12347);
        sotrudnikEntity.setDoljnosty("barmen");
        sotrudnikEntity.setOklad(3000);

//        session.save(sotrudnikEntity);
//        session.getTransaction().commit();
//
//        session.close();
    }
}
