package ua.i.giggss;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Andrey on 11.01.2017.
 */
@Entity
@Table(name = "prigotovlenie_blyuda", schema = "public", catalog = "Restaurant")
public class PrigotovlenieBlyudaEntity {
    private int idGotovoeBlydo;
    private int zakaz;
    private Date data;
    private BlydoEntity blydoByBlydo;

    @Id
    @Column(name = "idGotovoeBlydo", nullable = false)
    public int getIdGotovoeBlydo() {
        return idGotovoeBlydo;
    }

    public void setIdGotovoeBlydo(int idGotovoeBlydo) {
        this.idGotovoeBlydo = idGotovoeBlydo;
    }

    @Basic
    @Column(name = "zakaz", nullable = false)
    public int getZakaz() {
        return zakaz;
    }

    public void setZakaz(int zakaz) {
        this.zakaz = zakaz;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = false)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrigotovlenieBlyudaEntity that = (PrigotovlenieBlyudaEntity) o;

        if (idGotovoeBlydo != that.idGotovoeBlydo) return false;
        if (zakaz != that.zakaz) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGotovoeBlydo;
        result = 31 * result + zakaz;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "blydo", referencedColumnName = "idBlydo", nullable = false)
    public BlydoEntity getBlydoByBlydo() {
        return blydoByBlydo;
    }

    public void setBlydoByBlydo(BlydoEntity blydoByBlydo) {
        this.blydoByBlydo = blydoByBlydo;
    }
}
