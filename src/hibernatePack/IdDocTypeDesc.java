package hibernatePack;

import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"ID_DOC_TYPE_ID","ID_LANG"},name = "ID_DOC_TYPE_DESC_UK1")},name="ID_DOC_TYPE_DESC")
public class IdDocTypeDesc{
    @Id @GeneratedValue
    @Column(name="ID")
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_DOC_TYPE_ID")
    @ForeignKey(name = "ID_DOC_TYPE_DESC_FK1")
    private IdDocType idDocTypeId;

    @ManyToOne
    @JoinColumn(name = "ID_LANG")
    @ForeignKey(name = "ID_DOC_TYPE_DESC_FK2")
    private Language idLang;

    @Column(name="ID_DOC_DESC",length = 500,nullable = false)
    private String idDocDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IdDocType getIdDocTypeId() {
        return idDocTypeId;
    }

    public void setIdDocTypeId(IdDocType idDocTypeId) {
        this.idDocTypeId = idDocTypeId;
    }

    public Language getIdLang() {
        return idLang;
    }

    public void setIdLang(Language idLang) {
        this.idLang = idLang;
    }

    public String getIdDocDesc() {
        return idDocDesc;
    }

    public void setIdDocDesc(String idDocDesc) {
        this.idDocDesc = idDocDesc;
    }
}
