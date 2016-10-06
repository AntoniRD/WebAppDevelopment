package Act7_InterficiesRefors;
import java.util.Date;

/**
 * Created by Budha on 5/10/16.
 */

public class Student {
    private int dni;
    private Date birthday;
    private String name;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
