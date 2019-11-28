package com.snake.logic;

import android.graphics.Color;
import android.graphics.Point;
import android.util.Log;

public class Banana extends Fruit {
    private static final int SCORE = 50;

    public Banana(Point fieldDimensions, Snake snake, int radius) {
        super(fieldDimensions, snake, radius, SCORE, Color.YELLOW);
        Log.v("Banana", "Banana created");
    }
}
