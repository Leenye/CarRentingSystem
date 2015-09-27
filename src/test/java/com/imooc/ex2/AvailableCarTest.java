package com.imooc.ex2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AvailableCarTest {

    @Test
    public void testGetAvailableCars() throws Exception {
        assertThat(AvailableCar.getAvailableCars().size(),is(6));
    }
}