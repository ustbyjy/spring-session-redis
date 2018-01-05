package com.yanwang;

import org.junit.Test;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Administrator
 * Date: 2017/11/3
 * Time: 17:01
 */
public class CommonTest {

    @Test
    public void testDate() {
        Date date = new Date(1509701760000L);
        System.out.println(date);
    }

    @Test
    public void testDir() {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
    }
}
