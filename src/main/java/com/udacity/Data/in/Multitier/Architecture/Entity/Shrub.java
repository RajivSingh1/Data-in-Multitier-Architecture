package com.udacity.Data.in.Multitier.Architecture.Entity;

import javax.persistence.Entity;

@Entity
public class Shrub extends Plant{
    private int heightCm; //any reasonable unit of measurement is fine
    private int widthCm;
}
