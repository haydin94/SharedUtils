package de.haydin.model.unions;

import de.haydin.model.entities.DataUser;
import de.haydin.model.entities.DataComment;
import java.io.Serializable;

/**
 *
 * @author aydins
 */
// Wrapper Klasse!
public class DtoCardComment implements Serializable {

    DataUser user;
    DataComment comment;

    public DtoCardComment() {
    }
    
    public DtoCardComment(DataUser user, DataComment komment) {
        this.user = user;
        this.comment = komment;
    }

    public DtoCardComment(Object[] user, Object[] comment) {
        this.user = new DataUser(user, false);
        this.comment = new DataComment(comment);
    }

    public DataUser getUser() {
        return user;
    }

    public void setUser(DataUser user) {
        this.user = user;
    }

    public DataComment getComment() {
        return comment;
    }

    public void setComment(DataComment comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "DTOCARDCOMMENT{ USER=" + user + ", COMMENT=" + comment + '}';
    }

    

}
