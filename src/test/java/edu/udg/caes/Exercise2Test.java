package edu.udg.caes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise2Test {

    // Tests not implemented yet

    @Test
    public void testUnionEmptyVector() {
        Vector<Object> a = new Vector<Object>();
        Vector<Object> b = new Vector<Object>();
        Vector<Object> res = null;

        Vector unionVector = Exercise2.union(a, b);

        assertEquals(res, unionVector);

    }

    @Test
    public void testUnionNullVector() {
        Vector<Object> a = null;
        Vector<Object> b = null;

        Vector unionVector = Exercise2.union(a, b);

        assertNotNull(unionVector, "Vector Null");

    }

    @Test
    public void testUnionRepeatVector(){
        Vector<Object> a = new Vector<Object>();
        Vector<Object> b = new Vector<Object>();
        Vector<Object> res = new Vector<Object>();
        a.add("1");
        a.add("2");

        b.add("1");
        b.add("3");

        res.add("1");
        res.add("2");
        res.add("3");
        Vector unionVector = Exercise2.union(a, b);


        assertEquals(unionVector, res);
    }
}