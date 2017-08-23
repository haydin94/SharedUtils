package de.haydin.model.utils;

import de.haydin.model.unions.DtoCardComment;
import de.haydin.model.unions.DtoCardJokeTC;
import de.haydin.model.unions.DtoJokeView;
import de.haydin.model.unions.DtoUserView;
import de.services.exceptions.DatabaseException;
import de.services.exceptions.FailedToLoadException;
import java.util.ArrayList;

/**
 *
 * @author aydins
 */
public interface ViewFactoryIF {

    ArrayList<DtoCardJokeTC> createAllJokesView(String category, int start, int count) throws FailedToLoadException;

    ArrayList<DtoCardComment> createCommentCards(int jokeId, int start, int count) throws FailedToLoadException;

    DtoJokeView createJokeView(int jokeId, boolean justComments, int start, int count) throws FailedToLoadException;

    DtoUserView createUserView(int userId, boolean logged, int start, int count) throws FailedToLoadException;

}
