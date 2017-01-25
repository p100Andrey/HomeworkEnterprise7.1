package ua.i.giggss;

import javax.persistence.*;

/**
 * Created by Andrey on 11.01.2017.
 */
@Entity
@Table(name = "ingradienti_blyda", schema = "public", catalog = "Restaurant")
public class IngradientiBlydaEntity {
    private int idIngradientBlyda;
    private BlydoEntity blydoByIdBlyda;
    private IngradientEntity ingradientByIdIngradienta;

    @Id
    @Column(name = "idIngradientBlyda", nullable = false)
    public int getIdIngradientBlyda() {
        return idIngradientBlyda;
    }

    public void setIdIngradientBlyda(int idIngradientBlyda) {
        this.idIngradientBlyda = idIngradientBlyda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IngradientiBlydaEntity that = (IngradientiBlydaEntity) o;

        if (idIngradientBlyda != that.idIngradientBlyda) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idIngradientBlyda;
    }

    @ManyToOne
    @JoinColumn(name = "idBlyda", referencedColumnName = "idBlydo", nullable = false)
    public BlydoEntity getBlydoByIdBlyda() {
        return blydoByIdBlyda;
    }

    public void setBlydoByIdBlyda(BlydoEntity blydoByIdBlyda) {
        this.blydoByIdBlyda = blydoByIdBlyda;
    }

    @ManyToOne
    @JoinColumn(name = "idIngradienta", referencedColumnName = "idIngradient", nullable = false)
    public IngradientEntity getIngradientByIdIngradienta() {
        return ingradientByIdIngradienta;
    }

    public void setIngradientByIdIngradienta(IngradientEntity ingradientByIdIngradienta) {
        this.ingradientByIdIngradienta = ingradientByIdIngradienta;
    }
}
