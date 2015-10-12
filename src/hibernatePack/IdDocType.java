package hibernatePack;

import javax.persistence.*;

/**
 * Created by zursona on 9/28/2015.
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "ID_DOC_TYPE",name = "ID_DOC_TYPE_UK1")},name="ID_DOC_TYPE")
public class IdDocType {
    @Id @GeneratedValue
    @Column(name="ID")
    private int id;

    @Column(name="ID_DOC_TYPE",columnDefinition = "nvarchar(10)")
    private String idDocType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdDocType() {
        return idDocType;
    }

    public void setIdDocType(String idDocType) {
        this.idDocType = idDocType;
    }
}
