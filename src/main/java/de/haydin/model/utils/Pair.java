package de.haydin.model.utils;

import java.io.Serializable;

/**
 *
 * @author aydins
 * @param <L>
 * @param <R>
 */
public class Pair<L, R>  implements Serializable{

    private L l;
    private R r;

    public Pair(L l, R r) {
        this.l = l;
        this.r = r;
    }

    public L getL() {
        return l;
    }

    public R getR() {
        return r;
    }

    public void setL(L l) {
        this.l = l;
    }

    public void setR(R r) {
        this.r = r;
    }
}
