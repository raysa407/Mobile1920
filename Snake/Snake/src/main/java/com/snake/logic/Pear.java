package com.snake.logic;

import android.graphics.Color;
import android.graphics.Point;
import android.util.Log;

public class Pear extends Fruit {
    private static final int SCORE = 10;

    public Pear(Point fieldDimensions, Snake snake, int radius) {
        super(fieldDimensions, snake, radius, SCORE, Color.GREEN);
        Log.v("Pear", "Pear created");
    }
}
