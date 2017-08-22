package de.haydin.model.entities;

import java.io.File;
import java.util.Date;

/**
 *
 * @author aydins
 */
public class DataLUser extends DataUser{
    Date birthday;
    short numFollows;
    String email;
    String password;

    public DataLUser() {
    }
    
    public DataLUser(Date birthday, short numFollows, String email, String password, int user_id, String name, int age, String gender, 
            String date, String description, String place, int favourite, int numFollower, boolean active, File img) {
        super(user_id, name, age, gender, date, description, place, favourite, numFollower, active, img);
        this.birthday = birthday;
        this.numFollows = numFollows;
        this.email = email;
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public short getNumFollows() {
        return numFollows;
    }

    public void setNumFollows(short numFollows) {
        this.numFollows = numFollows;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataLUser [(" + super.toString() + "), birthday=" + birthday + ", numFollows=" + numFollows + 
                ", email=" + email + ", password=" + password + "]";
    }
    
    
}
