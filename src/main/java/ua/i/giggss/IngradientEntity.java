package ua.i.giggss;

import javax.persistence.*;

/**
 * Created by Andrey on 11.01.2017.
 */
@Entity
@Table(name = "ingradient", schema = "public", catalog = "Restaurant")
public class IngradientEntity {
    private int idIngradient;
    private String nazvanieIngradient;

    @Id
    @Column(name = "idIngradient", nullable = false)
    public int getIdIngradient() {
        return idIngradient;
    }

    public void setIdIngradient(int idIngradient) {
        this.idIngradient = idIngradient;
    }

    @Basic
    @Column(name = "nazvanieIngradient", nullable = false, length = -1)
    public String getNazvanieIngradient() {
        return nazvanieIngradient;
    }

    public void setNazvanieIngradient(String nazvanieIngradient) {
        this.nazvanieIngradient = nazvanieIngradient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IngradientEntity that = (IngradientEntity) o;

        if (idIngradient != that.idIngradient) return false;
        if (nazvanieIngradient != null ? !nazvanieIngradient.equals(that.nazvanieIngradient) : that.nazvanieIngradient != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idIngradient;
        result = 31 * result + (nazvanieIngradient != null ? nazvanieIngradient.hashCode() : 0);
        return result;
    }
}
