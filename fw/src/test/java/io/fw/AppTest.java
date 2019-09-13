package io.fw;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    /**
     * @return the suite of tests being tested
     */             @Test
        		void test() {
        		App a = new App();
        		 int Expeceted=9;
        		 int Actual =a.add(1,1);
        	        assertEquals(Expeceted,Actual,"hey you failed here");
//        	        int Array1[] = new int[10];
//        	        int Array2[] = new int[10];
//        	        assertArrayEquals(Array1,Array2);
//        	        ArrayList<Integer> x = null;
//        	        ArrayList<Integer> y = null;
//        	        assertIterableEquals(x,y);
        		}

    }

