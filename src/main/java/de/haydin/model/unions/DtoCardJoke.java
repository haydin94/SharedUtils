package de.haydin.model.unions;

import de.haydin.model.entities.DataUser;
import de.haydin.model.entities.DataJoke;
import java.io.Serializable;

/**
 *
 * @author aydins
 */
// Wrapper Klasse!
public class DtoCardJoke implements Serializable{

    DataUser user;
    DataJoke joke;

    public DtoCardJoke(DataUser user, DataJoke joke) {
        this.user = user;
        this.joke = joke;
    }

    public DtoCardJoke(Object[] user, Object[] joke) {
        this.user = new DataUser(user);
        this.joke = new DataJoke(joke);
    }

    public DataUser getUser() {
        return user;
    }

    public void setUser(DataUser user) {
        this.user = user;
    }

    public DataJoke getJoke() {
        return joke;
    }

    public void setJoke(DataJoke joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "DTOCARDJOKE{ USER=" + user + ", JOKE=" + joke + '}';
    }
    
}
