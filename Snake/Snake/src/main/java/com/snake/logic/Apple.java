package com.snake.logic;

import android.graphics.Color;
import android.graphics.Point;
import android.util.Log;

public class Apple extends Fruit {
    private static final int SCORE = 20;

    public Apple(Point fieldDimensions, Snake snake, int radius) {
        super(fieldDimensions, snake, radius, SCORE, Color.RED);
        Log.v("Apple", "Apple created");
    }
}
