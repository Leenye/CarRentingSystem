package com.imooc.ex2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RentedCarTest {
    RentedCar rentedCar;
    Map<String,Integer> carMap;

    @Before
    public void setUp() throws Exception {
        rentedCar = new RentedCar();
        carMap = new HashMap<String, Integer>();
        carMap.put("010",1);
        carMap.put("101",3);
        rentedCar.setCarMap(carMap);
    }

    @Test
    public void testGetTotalNum() throws Exception {
        assertThat(rentedCar.getTotalNum(), is(4));
    }

    @Test
    public void testGetCost() throws Exception {
        assertThat(rentedCar.getCost(),is(1600F));
    }

    @Test
    public void testGetRentedCars(){
        assertThat(rentedCar.getRentedCars().size(),is(2));
    }

    @After
    public void tearDown() throws Exception {

    }

}