package com.sigma.dp.test;

import com.sigma.dp.SecondMain;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IDEA
 * User: Omega
 * Date: 16/8/13
 * Time: 20:53
 */
public class SecondMainTest {

    private SecondMain secondMain;

    @Before
    public void before(){
        secondMain = new SecondMain();
    }

    @Test
    public void test1(){
        Assert.assertEquals("test failed", "hello", secondMain.hello());
    }
}
