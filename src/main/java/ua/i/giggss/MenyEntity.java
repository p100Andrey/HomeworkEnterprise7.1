package ua.i.giggss;

import javax.persistence.*;

/**
 * Created by Andrey on 11.01.2017.
 */
@Entity
@Table(name = "meny", schema = "public", catalog = "Restaurant")
public class MenyEntity {
    private int idMeny;
    private String nazvaniemeny;

    @Id
    @Column(name = "idMeny", nullable = false)
    public int getIdMeny() {
        return idMeny;
    }

    public void setIdMeny(int idMeny) {
        this.idMeny = idMeny;
    }

    @Basic
    @Column(name = "nazvaniemeny", nullable = false, length = -1)
    public String getNazvaniemeny() {
        return nazvaniemeny;
    }

    public void setNazvaniemeny(String nazvaniemeny) {
        this.nazvaniemeny = nazvaniemeny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenyEntity that = (MenyEntity) o;

        if (idMeny != that.idMeny) return false;
        if (nazvaniemeny != null ? !nazvaniemeny.equals(that.nazvaniemeny) : that.nazvaniemeny != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMeny;
        result = 31 * result + (nazvaniemeny != null ? nazvaniemeny.hashCode() : 0);
        return result;
    }
}
