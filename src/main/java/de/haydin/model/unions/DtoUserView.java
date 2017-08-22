package de.haydin.model.unions;

import de.haydin.model.entities.DataUser;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author aydins
 */
public class DtoUserView implements Serializable {
    
    DataUser user;
    ArrayList<DtoCardJokeTC> jokes;


    public DtoUserView() {
    }
    
    public DtoUserView(DataUser user, ArrayList<DtoCardJokeTC> jokes) {
        this.user = user;
        this.jokes = jokes;
    }

    public DataUser getUser() {
        return user;
    }

    public void setUser(DataUser user) {
        this.user = user;
    }

    public ArrayList<DtoCardJokeTC> getJokes() {
        return jokes;
    }

    public void setJokes(ArrayList<DtoCardJokeTC> jokes) {
        this.jokes = jokes;
    }
    
    public boolean isEmpty(){
        return user == null;
    }

    @Override
    public String toString() {
        return "DTOUSERVIEW{" + "USER=" + user + ", JOKES=" + jokes + '}';
    }
    
    

}
