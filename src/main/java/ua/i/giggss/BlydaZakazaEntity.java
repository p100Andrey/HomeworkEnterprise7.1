package ua.i.giggss;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Andrey on 11.01.2017.
 */
@Entity
@Table(name = "blyda_zakaza", schema = "public", catalog = "Restaurant")
public class BlydaZakazaEntity {
    private int idBlydoZakaza;

    @Id
    @Column(name = "idBlydoZakaza", nullable = false)
    public int getIdBlydoZakaza() {
        return idBlydoZakaza;
    }

    public void setIdBlydoZakaza(int idBlydoZakaza) {
        this.idBlydoZakaza = idBlydoZakaza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlydaZakazaEntity that = (BlydaZakazaEntity) o;

        if (idBlydoZakaza != that.idBlydoZakaza) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idBlydoZakaza;
    }
}
