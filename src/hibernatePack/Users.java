package hibernatePack;

import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;

/**
 * Created by zursona on 9/25/2015.
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "USERNAME",name = "USERS_UK1")},name="USERS")
public class Users {
    @Id @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "USERNAME",columnDefinition = "nvarchar(50)")
    private String username;

    @Column(name = "PERSONAL_ID",columnDefinition = "nvarchar(50)")
    private int personalId;


    @Column(name = "PERSONAL_INFO_ID")
    private int personalInfoId;

    @ManyToOne
    @JoinColumn(name = "USER_ROLE_ID")
    @ForeignKey(name = "USERS_FK1")
    private UserRoles userRoleId;

    private String OFFICE;
    private String STATUS;

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
}