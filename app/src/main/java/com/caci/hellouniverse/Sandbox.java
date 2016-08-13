package com.caci.hellouniverse;

import android.graphics.drawable.shapes.RectShape;

import java.util.List;

//refactor initialization to constructor
/**
 * Created by mabre on 8/11/2016.
 */
public class Sandbox extends RectShape{
    @Override
    public String toString() {
        return "Sandbox{" +
                "mGreetings=" + mGreetings +
                '}';
    }

    @Override
    public boolean hasAlpha() {
        return true;
    }

    public List<String> getGreetings() {
        return mGreetings;
    }

    public void setGreetings(List<String> greetings) {
        mGreetings = greetings;
    }

    public Sandbox() {
    }

    private List<String> mGreetings;

    class car{
        int speed = 100;
        int geear = 1;
        int drivetrain = 4;
        String direction = "north";
        String color = "red";
        String fuelType = "gas";
            }

    void ShiftGears (int NewGear) {

    }
}
