package de.haydin.model.unions;

import de.haydin.model.entities.DataComment;
import de.haydin.model.entities.DataUser;
import de.haydin.model.entities.DataJoke;
import java.io.Serializable;

/**
 *
 * @author aydins
 */
// Wrapper Klasse!
public class DtoCardJokeTC implements Serializable{

    private DataUser userJoke;
    private DataJoke joke;
    private DataUser userComment;
    private DataComment comment;

    public DtoCardJokeTC() {
    }
    
    public DtoCardJokeTC(DataUser userJoke, DataJoke joke, DataUser userComment, DataComment comment) {
        this.userJoke = userJoke;
        this.joke = joke;
        this.userComment = userComment;
        this.comment = comment;
    }

    public DtoCardJokeTC(Object[] userJoke, Object[] joke, Object[] userComment, Object[] comment) {
        this.userJoke = new DataUser(userJoke, false);
        this.joke = new DataJoke(joke);
        this.userComment = new DataUser(userComment, false);
        this.comment = new DataComment(comment);
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

    public DataUser getUserComment() {
        return userComment;
    }

    public void setUserComment(DataUser userComment) {
        this.userComment = userComment;
    }

    public DataComment getComment() {
        return comment;
    }

    public void setComment(DataComment comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "DTOCARDJOKETC{ " + "USERJOKE=" + userJoke + ", JOKE=" + joke + ", USERCOMMENT=" + userComment + ", COMMENT=" + comment + '}';
    }

    
}
