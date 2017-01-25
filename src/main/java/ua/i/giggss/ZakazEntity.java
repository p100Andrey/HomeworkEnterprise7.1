package ua.i.giggss;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Andrey on 11.01.2017.
 */
@Entity
@Table(name = "zakaz", schema = "public", catalog = "Restaurant")
public class ZakazEntity {
    private int idZakaz;
    private int stolik;
    private Date data;
    private boolean zakazopen;
    private SotrudnikEntity sotrudnikByOficiant;

    @Id
    @Column(name = "idZakaz", nullable = false)
    public int getIdZakaz() {
        return idZakaz;
    }

    public void setIdZakaz(int idZakaz) {
        this.idZakaz = idZakaz;
    }

    @Basic
    @Column(name = "stolik", nullable = false)
    public int getStolik() {
        return stolik;
    }

    public void setStolik(int stolik) {
        this.stolik = stolik;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = false)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Basic
    @Column(name = "zakazopen", nullable = false)
    public boolean isZakazopen() {
        return zakazopen;
    }

    public void setZakazopen(boolean zakazopen) {
        this.zakazopen = zakazopen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZakazEntity that = (ZakazEntity) o;

        if (idZakaz != that.idZakaz) return false;
        if (stolik != that.stolik) return false;
        if (zakazopen != that.zakazopen) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idZakaz;
        result = 31 * result + stolik;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (zakazopen ? 1 : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "oficiant", referencedColumnName = "idSotrudnik", nullable = false)
    public SotrudnikEntity getSotrudnikByOficiant() {
        return sotrudnikByOficiant;
    }

    public void setSotrudnikByOficiant(SotrudnikEntity sotrudnikByOficiant) {
        this.sotrudnikByOficiant = sotrudnikByOficiant;
    }
}
