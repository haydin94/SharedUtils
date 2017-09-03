package de.haydin.service.utils;

public class Requests {

    public class ParamType {

        public final static String TYPE = "type";
        public final static String REQUEST = "request";

    }

    public class ParamValue {

        public static final String UPDATE = "update";
        public static final String SELECT = "select";

        public class ParamSelect {

            public final static String LOGIN = "login";
            public final static String CARD_USER = "card_user";
            public final static String CARD_JOKE = "card_joke";
            public final static String CARD_COMMENT = "card_comment";
            public final static String VIEW_ALLJOKES = "view_allJokes";
            public final static String VIEW_JOKEVIEW = "view_joke";
            public final static String VIEW_USERVIEW = "view_user";
            public final static String VIEW_LUSERVIEW = "view_luser";
            public final static String VIEW_FAV = "view_fav";
            public final static String VIEW_MYCOMMENTS = "view_myComments";
            public final static String VIEW_FOLLOWER = "view_follower";
            public final static String VIEW_FOLLOWS = "view_follows";
            public final static String SECTION_JOKETC = "section_jokeTC";
            public final static String SECTION_COMMENT = "section_comment";

            public final static String WITZ_BETWEEN = "witzBetween";
        }
        
        public class ParamUpdate{
            public final static String REGISTRY = "registry";
            public final static String CHANGEPROFIL = "changeProfil";
            public final static String DELETEPROFIL = "deleteProfil";
            public final static String WRITEJOKE = "writeJoke";
            public final static String DELETEJOKE = "deleteJoke";
            public final static String RATEJOKE = "rateJoke";
            public final static String WRITECOMMENT = "writeComment";
            public final static String DELETECOMMENT = "deleteComment";
            public final static String RATECOMMENT = "rateComment";
            public final static String MAKEFAVOURITE = "makeFavourite";
            public final static String REVERSEFAVOURITE = "reverseFavourite";
            public final static String ADDTOFAVOURITE = "addToFavourite";
            public final static String REMOVEFAVOURITE = "removeFavourite";
            
        }
    }
}
