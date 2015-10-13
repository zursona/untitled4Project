package hibernatePack;

import javax.persistence.*;

/**
 * Created by zursona on 9/28/2015.
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "COUNTRY",name = "COUNTRIES_UK1")},name = "COUNTRIES")
public class Countries {
    @Id @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "COUNTRY",length = 2,nullable = false)
    private String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
