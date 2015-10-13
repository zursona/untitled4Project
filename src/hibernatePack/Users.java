package hibernatePack;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;

/**
 * Created by zursona on 9/25/2015.
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "USERNAME",name = "USERS_UK1")},name="USERS")
@Check(constraints = "status in ('A','D','C')")
public class Users {
    @Id @GeneratedValue
    @Column(name = "ID")

    private int id;

    @Column(name = "USERNAME",length = 50,nullable = false)
    private String username;

    @Column(name = "PERSONAL_ID",length = 50,nullable = false)
    private int personalId;


    @Column(name = "PERSONAL_INFO_ID")
    private int personalInfoId;

    @ManyToOne
    @JoinColumn(name = "USER_ROLE_ID")
    @ForeignKey(name = "USERS_FK1")
    private UserRoles userRoleId;

    @ManyToOne
    @JoinColumn(name = "OFFICE_ID")
    @ForeignKey(name = "USERS_FK2")
    private UserOffices office;

    @Column(name = "STATUS",length = 1,nullable = false)
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public UserRoles getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(UserRoles userRoleId) {
        this.userRoleId = userRoleId;
    }

    public int getPersonalInfoId() {
        return personalInfoId;
    }

    public void setPersonalInfoId(int personalInfoId) {
        this.personalInfoId = personalInfoId;
    }

    public UserOffices getOffice() {
        return office;
    }

    public void setOffice(UserOffices office) {
        this.office = office;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}