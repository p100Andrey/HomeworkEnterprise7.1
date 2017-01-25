package ua.i.giggss;

import javax.persistence.*;

/**
 * Created by Andrey on 11.01.2017.
 */
@Entity
@Table(name = "blydo", schema = "public", catalog = "Restaurant")
public class BlydoEntity {
    private int idBlydo;
    private String nazvanie;
    private String kategoriya;
    private double stoimost;
    private double ves;

    @Id
    @Column(name = "idBlydo", nullable = false)
    public int getIdBlydo() {
        return idBlydo;
    }

    public void setIdBlydo(int idBlydo) {
        this.idBlydo = idBlydo;
    }

    @Basic
    @Column(name = "nazvanie", nullable = false, length = -1)
    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    @Basic
    @Column(name = "kategoriya", nullable = false, length = -1)
    public String getKategoriya() {
        return kategoriya;
    }

    public void setKategoriya(String kategoriya) {
        this.kategoriya = kategoriya;
    }

    @Basic
    @Column(name = "stoimost", nullable = false, precision = 0)
    public double getStoimost() {
        return stoimost;
    }

    public void setStoimost(double stoimost) {
        this.stoimost = stoimost;
    }

    @Basic
    @Column(name = "ves", nullable = false, precision = 0)
    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlydoEntity that = (BlydoEntity) o;

        if (idBlydo != that.idBlydo) return false;
        if (Double.compare(that.stoimost, stoimost) != 0) return false;
        if (Double.compare(that.ves, ves) != 0) return false;
        if (nazvanie != null ? !nazvanie.equals(that.nazvanie) : that.nazvanie != null) return false;
        if (kategoriya != null ? !kategoriya.equals(that.kategoriya) : that.kategoriya != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idBlydo;
        result = 31 * result + (nazvanie != null ? nazvanie.hashCode() : 0);
        result = 31 * result + (kategoriya != null ? kategoriya.hashCode() : 0);
        temp = Double.doubleToLongBits(stoimost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(ves);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
