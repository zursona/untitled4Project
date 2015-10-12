package hibernatePack;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.sql.Types;

/**
 * Created by zursona on 9/28/2015.
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "LANG",name = "LANGUAGE_UK1")}, name="LANGUAGE")
public class Language {
    @Id @GeneratedValue
    @Column(name="ID")
    private int id;

    @Column(name="LANG",columnDefinition = "nvarchar(2)")
    private String lang;

    @Column(name="LANG_DESC",columnDefinition = "nvarchar(500) not null")
    private String langDesc;

    @Type(type = "yes_no")
    @Column(name="IS_DEF",columnDefinition = "char(1) not null")
    private String isDef;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLangDesc() {
        return langDesc;
    }

    public void setLangDesc(String langDesc) {
        this.langDesc = langDesc;
    }

    public String getIsDef() {
        return isDef;
    }

    public void setIsDef(String isDef) {
        this.isDef = isDef;
    }
}
