package de.haydin.model.entities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author aydins
 */
public class DataJoke implements Serializable {

    int joke_id;
    String category;
    int user_id;
    String date;
    String joke;
    short rating;
    int numRating;
    int numComments;
    boolean active;
    short bewertungVon;

    public DataJoke() {
    }

    public DataJoke(int joke_id, String category, int user_id, String date, String joke, short rating, int numRating, int numComments, boolean active, short bewertungVon) {
        this.joke_id = joke_id;
        this.category = category;
        this.user_id = user_id;
        this.date = date;
        this.joke = joke;
        this.rating = rating;
        this.numRating = numRating;
        this.numComments = numComments;
        this.active = active;
        this.bewertungVon = bewertungVon;
    }

    
    public DataJoke(Object[] list) {
        this.joke_id = Integer.parseInt((String) list[0]);
        this.category = (String) list[1];
        this.user_id = Integer.parseInt((String) list[2]);
        this.date = (String) list[3];
        this.joke = (String) list[4];
        this.numRating = Integer.parseInt((String) list[5]);
        this.rating = Short.parseShort((String) list[6]);
        this.active = Boolean.parseBoolean((String) list[7]);
    }

    public int getJoke_id() {
        return joke_id;
    }

    public void setJoke_id(int joke_id) {
        this.joke_id = joke_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
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

    public int getNumComments() {
        return numComments;
    }

    public void setNumComments(int numComments) {
        this.numComments = numComments;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public short getBewertungVon() {
        return bewertungVon;
    }

    public void setBewertungVon(short bewertungVon) {
        this.bewertungVon = bewertungVon;
    }

    @Override
    public String toString() {
        return "DataWitz [joke_id=" + joke_id + ", category=" + category + ", user_id=" + user_id + 
                ", date=" + date + ", joke=" + joke + ", rating=" + rating + ", numRating=" + numRating + 
                ", numComments=" + numComments + ", active=" + active + ", bewertungVon=" + bewertungVon + "]";
    }
    
    

}
