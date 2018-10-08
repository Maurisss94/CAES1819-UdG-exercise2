package edu.udg.caes;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Exercise2 {

    /**
     * Set union operation
     *
     *  @param a first set, not null and not empty
     *  @param b second set, not null and not empty
     *  @return objects that are in either one of the two argument set, and no repeats elements
     */
    public static Set union (Set a, Set b)
    {
        if(a.isEmpty() || b.isEmpty()) {
            return null;
        }

        Set<Object> unionSet = new HashSet<>();
        unionSet.addAll(a);
        unionSet.addAll(b);

        return unionSet;
    }

}
