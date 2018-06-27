package com.greenfoxacademy.springstart.models;

import javax.persistence.Entity;
import java.util.Random;

@Entity
public class Hello {

    Random random = new Random();
    String value;
    int size;
    int[] color;

    public Hello(String value, int size, int[] color) {
        this.value = value;
        this.size = randomGenerator(7,1);
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getColor() {
        return color;
    }

    public void setColor(int[] color) {
        this.color = color;
    }

    public int randomGenerator(int max, int min) {

        int randomNumber = random.nextInt(max-min + 1) + min;
        return randomNumber;
    }
}
