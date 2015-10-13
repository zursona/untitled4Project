package hibernatePack;

import javax.persistence.*;

/**
 * Created by zursona on 10/13/2015.
 */
@Entity
@Table(name = "CITIES")
public class Cities {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
