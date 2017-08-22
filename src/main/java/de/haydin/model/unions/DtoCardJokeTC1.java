package de.haydin.model.unions;

import java.io.Serializable;


/**
 *
 * @author aydins
 */
// Wrapper Klasse!
public class DtoCardJokeTC1 implements Serializable{

    DtoCardJoke joke;
    DtoCardComment comment;

    public DtoCardJokeTC1(DtoCardJoke joke, DtoCardComment comment) {
        this.joke = joke;
        this.comment = comment;
    }

    public DtoCardJokeTC1(Object[] joke, Object[] userJoke, Object[] comment, Object[] userComment) {
        this.joke = new DtoCardJoke(userJoke, joke);
        this.comment = new DtoCardComment(userComment, comment);
    }

    public DtoCardJoke getJoke() {
        return joke;
    }

    public void setJoke(DtoCardJoke joke) {
        this.joke = joke;
    }

    public DtoCardComment getComment() {
        return comment;
    }

    public void setComment(DtoCardComment comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "DtoCardJokeTC1{" + "joke=" + joke + ", comment=" + comment + '}';
    }

}