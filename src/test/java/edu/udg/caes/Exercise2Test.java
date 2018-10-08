package edu.udg.caes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise2Test {

    // Tests not implemented yet

    @Test
    public void testUnionEmptySet() {
        Set<Object> a = new HashSet<>();
        Set<Object> b = new HashSet<>();
        Set<Object> res = null;

        Set unionSet = Exercise2.union(a, b);

        assertEquals(res, unionSet);

    }

    @Test
    public void testUnionNullSet() {
        Set<Object> a = null;
        Set<Object> b = null;

        assertThrows(NullPointerException.class, ()->Exercise2.union(a, b));

    }

    @Test
    public void testUnionRepeatSet(){
        Set<Object> a = new HashSet<>();
        Set<Object> b = new HashSet<>();
        Set<Object> res = new HashSet<>();
        a.add("1");
        a.add("2");

        b.add("1");
        b.add("3");

        res.add("1");
        res.add("2");
        res.add("3");
        Set unionSet = Exercise2.union(a, b);


        assertEquals(unionSet, res);
    }
}