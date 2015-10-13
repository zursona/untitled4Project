package hibernatePack;

import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;

/**
 * Created by zursona on 10/13/2015.
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"USER_OFFICES_ID","ID_LANG"},name = "OFFICE_ADDR_DESC_UK1")},name = "OFFICE_ADDR_DESC")
public class OfficeAddrDesc {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "USER_OFFICES_ID")
    @ForeignKey(name = "OFFICE_ADDR_DESC_FK1")
    private UserOffices userOfficesId;

    @ManyToOne
    @JoinColumn(name = "ID_LANG")
    @ForeignKey(name = "OFFICE_ADDR_DESC_FK2")
    private Language idLang;

    @Column(name ="OFFICE_ADDR_DESC",length = 500,nullable = false)
    private String officeAddrDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserOffices getUserOfficesId() {
        return userOfficesId;
    }

    public void setUserOfficesId(UserOffices userOfficesId) {
        this.userOfficesId = userOfficesId;
    }

    public Language getIdLang() {
        return idLang;
    }

    public void setIdLang(Language idLang) {
        this.idLang = idLang;
    }

    public String getOfficeAddrDesc() {
        return officeAddrDesc;
    }

    public void setOfficeAddrDesc(String officeAddrDesc) {
        this.officeAddrDesc = officeAddrDesc;
    }
}
