package hibernatePack;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by zursona on 9/25/2015.
 */
@Entity
@Table (uniqueConstraints = {@UniqueConstraint(columnNames = {"USER_ID","ID_DOC_TYPE_ID"},name = "USER_PERSONAL_INFO_UK1")},name="USER_PERSONAL_INFO")
@Check(constraints = "sex in ('M','F')")
public class UserPersonalInfo {
    @Id @GeneratedValue
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    @ForeignKey(name = "USER_PERSONAL_INFO_FK1")
    private Users userId;

    @Column(name = "SEX",length = 1,nullable = false)
    private String sex;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTH_DATE",columnDefinition = "date")
    private Date birthDate;

    @ManyToOne
    @JoinColumn(name = "ID_DOC_TYPE_ID")
    @ForeignKey(name = "USER_PERSONAL_INFO_FK2")
    private IdDocType idDocTypeId;

    @Column(name = "ID_DOC_SER",length = 1,nullable = false)
    private String idDocSer;

    @Temporal(TemporalType.DATE)
    @Column(name = "ID_DOC_DATE",columnDefinition = "date")
    private Date idDocDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "ID_DOC_EXP_DATE",columnDefinition = "date")
    private Date idDocExpDate;

    @Column(name = "ID_DOC_NO",length = 50,nullable = false)
    private String idDocNo;

    @ManyToOne
    @JoinColumn(name = "COUNTRIES_ID")
    private Countries countriesId;

    @Type(type = "yes_no")
    @Column(name="IS_DEF",length = 1,nullable = false)
    private String isDef;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public IdDocType getIdDocTypeId() {
        return idDocTypeId;
    }

    public void setIdDocTypeId(IdDocType idDocTypeId) {
        this.idDocTypeId = idDocTypeId;
    }

    public String getIdDocSer() {
        return idDocSer;
    }

    public void setIdDocSer(String idDocSer) {
        this.idDocSer = idDocSer;
    }


    public String getIdDocNo() {
        return idDocNo;
    }

    public void setIdDocNo(String idDocNo) {
        this.idDocNo = idDocNo;
    }

    public Date getIdDocDate() {
        return idDocDate;
    }

    public void setIdDocDate(Date idDocDate) {
        this.idDocDate = idDocDate;
    }

    public Date getIdDocExpDate() {
        return idDocExpDate;
    }

    public void setIdDocExpDate(Date idDocExpDate) {
        this.idDocExpDate = idDocExpDate;
    }

    public Countries getCountriesId() {
        return countriesId;
    }

    public void setCountriesId(Countries countriesId) {
        this.countriesId = countriesId;
    }

    public String getIsDef() {
        return isDef;
    }

    public void setIsDef(String isDef) {
        this.isDef = isDef;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }
}
