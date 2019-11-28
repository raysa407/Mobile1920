package com.snake.logic;

import android.graphics.Point;
import android.util.Log;

public class Donut extends SpecialElement {
    private static final String TAG = GamePanel.class.getSimpleName();
    private static final int SCORE = 30;

    // maximum duration to display Donut in snake moves
    private static final int MAX_DURATION = 30;

    public Donut(Point fieldDimensions, Snake snake, int radius) {
        super(fieldDimensions, snake, radius, MAX_DURATION);

        type = GameElementType.Donut;

        Log.v(TAG, "Donut created");
    }
    }

