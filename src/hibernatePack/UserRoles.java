package hibernatePack;

import javax.persistence.*;

/**
 * Created by zursona on 9/29/2015.
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "USER_ROLE",name = "USER_ROLES_UK1")},name="USER_ROLES")
public class UserRoles {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "USER_ROLE",length = 20,nullable = false)
    private String userRole;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
