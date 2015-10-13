package hibernatePack;

import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;

/**
 * Created by zursona on 10/13/2015.
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"CITY_ID","ID_LANG"},name = "CITY_DESC_UK1")},name = "CITY_DESC")
public class City_desc {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "CITY_ID")
    @ForeignKey(name = "CITY_DESC_FK1")
    private Cities citiesId;

    @ManyToOne
    @JoinColumn(name = "ID_LANG")
    @ForeignKey(name = "CITY_DESC_FK2")
    private Language idLang;

    @Column(name ="CITY_DESC",length = 500,nullable = false)
    private String cityDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cities getCitiesId() {
        return citiesId;
    }

    public void setCitiesId(Cities citiesId) {
        this.citiesId = citiesId;
    }

    public Language getIdLang() {
        return idLang;
    }

    public void setIdLang(Language idLang) {
        this.idLang = idLang;
    }

    public String getCityDesc() {
        return cityDesc;
    }

    public void setCityDesc(String cityDesc) {
        this.cityDesc = cityDesc;
    }
}
