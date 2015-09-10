package com.kodjo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kodjobaah on 10/09/2015.
 */
public class TestFindStartOfArray {


    private FindStartOfArray findStartOfArray;

    @Before
    public void setup() {
        findStartOfArray = new FindStartOfArray();
    }

    @Test
    public void testForMatchAtEnd() {

        int first[] = {2,3,4,5};
        int second[] = {4,5};

        int result = findStartOfArray.findStart(first,second);
        assertEquals(2,result);
    }

    @Test
    public void testForMatchAtBegin() {

        int first[] = {2,3,4,5};
        int second[] = {2,3};

        int result = findStartOfArray.findStart(first,second);
        assertEquals(0,result);
    }

    @Test
    public void testForMatchAtInTheMiddle() {

        int first[] = {2,3,8,4,5,6,7};
        int second[] = {4,5};

        int result = findStartOfArray.findStart(first,second);
        assertEquals(3,result);
    }

    @Test
    public void testForMultiFirstNumberMatch() {

        int first[] = {2,4,8,4,5,6,7};
        int second[] = {4,5};

        int result = findStartOfArray.findStart(first,second);
        assertEquals(3,result);
    }



    @Test
    public void testForNoMatch() {

        int first[] = {2,4,8,4,5,6,7};
        int second[] = {10,11};

        int result = findStartOfArray.findStart(first,second);
        assertEquals(-1,result);
    }

    @Test
    public void testForFirstNumberMatchButRestDoesNot() {
        int first[] = {2,4,8,4,5,6,7};
        int second[] = {5,11};

        int result = findStartOfArray.findStart(first,second);
        assertEquals(-1,result);
    }

    @Test
    public void testForFirstNumberMatchAtEndOf() {
        int first[] = {2,4,8,4,5,6,7};
        int second[] = {7,11};

        int result = findStartOfArray.findStart(first,second);
        assertEquals(-1,result);
    }

    @Test
    public void testForMultipleNumberMatchAtEndOf() {
        int first[] = {2,4,8,4,5,6,7};
        int second[] = {6,7,11,12};

        int result = findStartOfArray.findStart(first,second);
        assertEquals(-1,result);
    }

    @Test
    public void testForMatchAtBeginMultipleNumberMatchAtEndOf() {
        int first[] = {2,6,4,8,4,5,6,7};
        int second[] = {6,7,11,12};

        int result = findStartOfArray.findStart(first,second);
        assertEquals(-1,result);
    }


}
