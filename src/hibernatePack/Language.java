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

    @Column(name="LANG",length = 2,nullable = false)
    private String lang;

    @Column(name="LANG_DESC",length = 500,nullable = false)
    private String langDesc;

    @Type(type = "yes_no")
    @Column(name="IS_DEF",length = 1,nullable = false)
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
