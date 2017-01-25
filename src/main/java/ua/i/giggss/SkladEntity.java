package ua.i.giggss;

import javax.persistence.*;

/**
 * Created by Andrey on 11.01.2017.
 */
@Entity
@Table(name = "sklad", schema = "public", catalog = "Restaurant")
public class SkladEntity {
    private int ingradient;
    private int kolichestvo;
    private IngradientEntity ingradientByIngradient;

    @Id
    @Column(name = "ingradient", nullable = false)
    public int getIngradient() {
        return ingradient;
    }

    public void setIngradient(int ingradient) {
        this.ingradient = ingradient;
    }

    @Basic
    @Column(name = "kolichestvo", nullable = false)
    public int getKolichestvo() {
        return kolichestvo;
    }

    public void setKolichestvo(int kolichestvo) {
        this.kolichestvo = kolichestvo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SkladEntity that = (SkladEntity) o;

        if (ingradient != that.ingradient) return false;
        if (kolichestvo != that.kolichestvo) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ingradient;
        result = 31 * result + kolichestvo;
        return result;
    }

    @OneToOne
    @JoinColumn(name = "ingradient", referencedColumnName = "idIngradient", nullable = false)
    public IngradientEntity getIngradientByIngradient() {
        return ingradientByIngradient;
    }

    public void setIngradientByIngradient(IngradientEntity ingradientByIngradient) {
        this.ingradientByIngradient = ingradientByIngradient;
    }
}
