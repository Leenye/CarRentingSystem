package com.imooc.ex2;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CarTest extends App {
    Car audiA4;
    Car yiweike;

    @Before
    public void setUp() throws Exception {
        audiA4 = new PassengerCar("00","audiA4",4,500);
        yiweike = new Truck("01","yiweike",20,1000);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetName() throws Exception {
        assertThat(audiA4.getName(), CoreMatchers.is("audiA4"));
    }

    @Test
    public void testGetRent() throws Exception {
        assertThat(yiweike.getRent(), is(1000F));
    }

    @Test
    public void testGetLicense() throws Exception {
        assertThat(yiweike.getCarLicense(), is("01"));
    }
}