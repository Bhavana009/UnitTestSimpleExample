package com.ptrprograms.gradleproductflavors;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created by bhavana.s on 1/5/2016.
 */
public class MainActivityTest extends TestCase {
    MainActivityTestJacoco activity;

    public void setUp() throws Exception{
        super.setUp();
        activity=new MainActivityTestJacoco();
    }
    @Test
    public void testString(){
        String str=activity.simplstring();
        assertEquals("SampleUnitTest",str);
    }
    @Test
    public void testadd()
    {
        int d=activity.simplemul(10,3);
     assertEquals(30,d);
    }

}
