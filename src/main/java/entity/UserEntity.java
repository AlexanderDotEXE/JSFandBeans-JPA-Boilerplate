package entity;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "test123")
public class UserEntity {
    @Id
    @Column(name = "NutzerID")
    private int nutzerId;
    @Basic
    @Column(name = "Vorname")
    private String vorname;
    @Basic
    @Column(name = "NachName")
    private String nachName;
    @Basic
    @Column(name = "Passwort")
    private String passwort;

    public int getNutzerId() {
        return nutzerId;
    }

    public void setNutzerId(int nutzerId) {
        this.nutzerId = nutzerId;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (nutzerId != that.nutzerId) return false;
        if (vorname != null ? !vorname.equals(that.vorname) : that.vorname != null) return false;
        if (nachName != null ? !nachName.equals(that.nachName) : that.nachName != null) return false;
        if (passwort != null ? !passwort.equals(that.passwort) : that.passwort != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nutzerId;
        result = 31 * result + (vorname != null ? vorname.hashCode() : 0);
        result = 31 * result + (nachName != null ? nachName.hashCode() : 0);
        result = 31 * result + (passwort != null ? passwort.hashCode() : 0);
        return result;
    }
}
