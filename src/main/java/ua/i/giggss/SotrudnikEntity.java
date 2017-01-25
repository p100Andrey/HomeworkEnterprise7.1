package ua.i.giggss;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Andrey on 11.01.2017.
 */
@Entity
@Table(name = "sotrudnik", schema = "public", catalog = "Restaurant")
public class SotrudnikEntity {
    private int idSotrudnik;
    private String familiya;
    private String imya;
    private Date daterojdeniya;
    private int telefon;
    private String doljnosty;
    private int oklad;

    @Id
    @Column(name = "idSotrudnik", nullable = false)
    public int getIdSotrudnik() {
        return idSotrudnik;
    }

    public void setIdSotrudnik(int idSotrudnik) {
        this.idSotrudnik = idSotrudnik;
    }

    @Basic
    @Column(name = "familiya", nullable = false, length = -1)
    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    @Basic
    @Column(name = "imya", nullable = false, length = -1)
    public String getImya() {
        return imya;
    }

    public void setImya(String imya) {
        this.imya = imya;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "daterojdeniya", nullable = false)
    public Date getDaterojdeniya() {
        return daterojdeniya;
    }

    public void setDaterojdeniya(Date daterojdeniya) {
        this.daterojdeniya = daterojdeniya;
    }

    @Basic
    @Column(name = "telefon", nullable = false)
    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    @Basic
    @Column(name = "doljnosty", nullable = false, length = -1)
    public String getDoljnosty() {
        return doljnosty;
    }

    public void setDoljnosty(String doljnosty) {
        this.doljnosty = doljnosty;
    }

    @Basic
    @Column(name = "oklad", nullable = false)
    public int getOklad() {
        return oklad;
    }

    public void setOklad(int oklad) {
        this.oklad = oklad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SotrudnikEntity that = (SotrudnikEntity) o;

        if (idSotrudnik != that.idSotrudnik) return false;
        if (telefon != that.telefon) return false;
        if (oklad != that.oklad) return false;
        if (familiya != null ? !familiya.equals(that.familiya) : that.familiya != null) return false;
        if (imya != null ? !imya.equals(that.imya) : that.imya != null) return false;
        if (daterojdeniya != null ? !daterojdeniya.equals(that.daterojdeniya) : that.daterojdeniya != null)
            return false;
        if (doljnosty != null ? !doljnosty.equals(that.doljnosty) : that.doljnosty != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSotrudnik;
        result = 31 * result + (familiya != null ? familiya.hashCode() : 0);
        result = 31 * result + (imya != null ? imya.hashCode() : 0);
        result = 31 * result + (daterojdeniya != null ? daterojdeniya.hashCode() : 0);
        result = 31 * result + telefon;
        result = 31 * result + (doljnosty != null ? doljnosty.hashCode() : 0);
        result = 31 * result + oklad;
        return result;
    }
}
