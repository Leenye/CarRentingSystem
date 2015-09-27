package com.imooc.ex2;

public abstract class Car {
    private String name;
    private float rent;

    public abstract String getName();

    public abstract float getRent();

    public abstract void setName(String name);

    public abstract void setRent(float rent);
}
