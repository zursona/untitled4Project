package hibernatePack;

import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;

/**
 * Created by zursona on 9/28/2015.
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"COUNTRIES_ID","ID_LANG"},name = "COUNTRY_DESC_UK1")},name="COUNTRY_DESC")
public class CountryDesc{
    @Id
    @GeneratedValue
    @Column(name="ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "COUNTRIES_ID")
    @ForeignKey(name = "COUNTRY_DESC_FK1")
    private Countries countriesId;

    @ManyToOne
    @JoinColumn(name = "ID_LANG")
    @ForeignKey(name = "COUNTRY_DESC_FK2")
    private Language idLang;

    @Column(name="COUNTRIES_DESC",length = 500,nullable = false)
    private String countriesDesc;

    public Countries getCountriesId() {
        return countriesId;
    }

    public void setCountriesId(Countries countriesId) {
        this.countriesId = countriesId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Language getIdLang() {
        return idLang;
    }

    public void setIdLang(Language idLang) {
        this.idLang = idLang;
    }

    public String getCountriesDesc() {
        return countriesDesc;
    }

    public void setCountriesDesc(String countriesDesc) {
        this.countriesDesc = countriesDesc;
    }
}
