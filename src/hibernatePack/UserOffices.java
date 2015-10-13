package hibernatePack;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.metamodel.relational.CheckConstraint;

import javax.persistence.*;

/**
 * Created by zursona on 10/13/2015.
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "OFFICE",name = "USER_OFFICES_UK1")}, name="USER_OFFICES")
@Check(constraints = "status in ('A','D','C')")
public class UserOffices {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "OFFICE",length = 50,nullable = false)
    private String office;

    @Column(name = "OFFICE_DESC",length = 500,nullable = false)
    private String officeDesc;

    @ManyToOne
    @JoinColumn(name = "CITY_ID")
    @ForeignKey(name = "USER_OFFICES_FK1")
    private Cities citiesId;

    @Column(name = "STATUS",length = 1,nullable = false)
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getOfficeDesc() {
        return officeDesc;
    }

    public void setOfficeDesc(String officeDesc) {
        this.officeDesc = officeDesc;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Cities getCitiesId() {
        return citiesId;
    }

    public void setCitiesId(Cities citiesId) {
        this.citiesId = citiesId;
    }
}
