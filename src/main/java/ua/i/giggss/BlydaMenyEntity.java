package ua.i.giggss;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Andrey on 11.01.2017.
 */
@Entity
@Table(name = "blyda_meny", schema = "public", catalog = "Restaurant")
public class BlydaMenyEntity {
    private int idBlydoMeny;

    @Id
    @Column(name = "idBlydoMeny", nullable = false)
    public int getIdBlydoMeny() {
        return idBlydoMeny;
    }

    public void setIdBlydoMeny(int idBlydoMeny) {
        this.idBlydoMeny = idBlydoMeny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlydaMenyEntity that = (BlydaMenyEntity) o;

        if (idBlydoMeny != that.idBlydoMeny) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idBlydoMeny;
    }
}
