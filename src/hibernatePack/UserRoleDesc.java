package hibernatePack;

import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;

/**
 * Created by zursona on 9/29/2015.
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"USER_ROLE_ID","ID_LANG"},name = "USER_ROLE_DESC_UK1")},name="USER_ROLE_DESC")
public class UserRoleDesc {
    @Id
    @GeneratedValue
    @Column(name="ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "USER_ROLE_ID")
    @ForeignKey(name = "USER_ROLE_DESC_FK1")
    private UserRoles userRoleId;

    @ManyToOne
    @JoinColumn(name = "ID_LANG")
    @ForeignKey(name = "USER_ROLE_DESC_FK2")
    private Language idLang;

    @Column(name="USER_ROLE_DESC",columnDefinition = "nvarchar(100) not null")
    private String userRoleDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserRoles getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(UserRoles userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Language getIdLang() {
        return idLang;
    }

    public void setIdLang(Language idLang) {
        this.idLang = idLang;
    }

    public String getUserRoleDesc() {
        return userRoleDesc;
    }

    public void setUserRoleDesc(String userRoleDesc) {
        this.userRoleDesc = userRoleDesc;
    }
}
