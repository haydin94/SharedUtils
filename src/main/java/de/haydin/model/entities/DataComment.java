package de.haydin.model.entities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author aydins
 */
public class DataComment implements Serializable {

    private static final long serialVersionUID = -3118924430852880273L;
    int com_id;
    int user_id;
    int joke_id;
    String date;
    String comment;
    short rating;
    int numRating;
    boolean active;

    public DataComment() {
    }

    public DataComment(int com_id, int user_id, int joke_id, String date, String comment, short rating, int numRating, boolean active) {
        this.com_id = com_id;
        this.user_id = user_id;
        this.joke_id = joke_id;
        this.date = date;
        this.comment = comment;
        this.rating = rating;
        this.numRating = numRating;
        this.active = active;
    }

    public DataComment(Object[] list) {
        this.com_id = Integer.parseInt((String) list[0]);
        this.user_id = Integer.parseInt((String) list[1]);
        this.joke_id = Integer.parseInt((String) list[2]);
        this.date = (String) list[3];
        this.comment = (String) list[4];
        this.rating = Short.parseShort((String) list[5]);
        this.active = Boolean.parseBoolean((String) list[6]);
    }

    public int getCom_id() {
        return com_id;
    }

    public void setCom_id(int com_id) {
        this.com_id = com_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getJoke_id() {
        return joke_id;
    }

    public void setJoke_id(int joke_id) {
        this.joke_id = joke_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date == null ? "" : date.toString();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public short getRating() {
        return rating;
    }

    public void setRating(short rating) {
        this.rating = rating;
    }

    public int getNumRating() {
        return numRating;
    }

    public void setNumRating(int numRating) {
        this.numRating = numRating;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "DataComment [com_id=" + com_id + ", user_id=" + user_id + ", joke_id=" + joke_id + 
                ", date=" + date + ", comment=" + comment + ", rating=" + rating + ", numRating=" + numRating + 
                ", active=" + active + "]";
    }

}
