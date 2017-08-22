package de.haydin.model.unions;

import de.haydin.model.entities.DataUser;
import de.haydin.model.entities.DataJoke;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author aydins
 */
// Wrapper Klasse!
public class DtoJokeView implements Serializable {

    private DataUser userJoke;
    private DataJoke joke;
    private ArrayList<DtoCardComment> comments;
    
    public DtoJokeView() {
    }

    public DtoJokeView(DataUser user, DataJoke joke) {
        this.userJoke = user;
        this.joke = joke;
        comments = new ArrayList<>();
    }

    public DtoJokeView(Object[] user, Object[] joke) {
        this.userJoke = new DataUser(user, false);
        this.joke = new DataJoke(joke);
        comments = new ArrayList<>();
    }

    public DtoJokeView(DataUser user, DataJoke joke, ArrayList<DtoCardComment> comment) {
        this.userJoke = user;
        this.joke = joke;
        comment = new ArrayList<>();
    }

    public DtoJokeView(Object[] user, Object[] joke, ArrayList<Object[]> comment) {
        this.userJoke = new DataUser(user, false);
        this.joke = new DataJoke(joke);
        comment = new ArrayList<>();
    }


    public DataUser getUserJoke() {
        return userJoke;
    }

    public void setUserJoke(DataUser userJoke) {
        this.userJoke = userJoke;
    }

    public DataJoke getJoke() {
        return joke;
    }

    public void setJoke(DataJoke joke) {
        this.joke = joke;
    }

    public ArrayList<DtoCardComment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<DtoCardComment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        String comment = "";
        if (comments != null) {
            for (int i = 0; i < comments.size(); i++) {
                comment += "\nK" + i + ": " + comments.get(i).toString() + " | ";
            }
        }
        return "DTOJOKEVIEW{ JOKE=" + joke + ", USERJOKE=" + userJoke + ", COMMENTS=" + comment + '}';
    }

}
