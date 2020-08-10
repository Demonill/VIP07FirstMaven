package com.testing.class8;

import com.testing.class11.LoginSample;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionTestTest {

    RecursionTest rt=new RecursionTest();
    LoginSample ls=new LoginSample();

    @Test
    public void jiecheng() {
        assertEquals(RecursionTest.jiecheng(-1),120);
    }

    @Test
    public void phib() {
        assertEquals(377,rt.phib(15));
    }

    @Test
    public void phibArray() {
        assertEquals(64,rt.phibArray(10));
    }

    @Test
    public void login(){
        ls.login("Roy","123456");
        System.out.println(ls.getMsg());
    }
}