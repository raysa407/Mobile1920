package com.snake.logic;

import android.graphics.Canvas;
import android.util.Log;
import android.view.SurfaceHolder;

// the game loop
public class MainThread extends Thread {
    private static final String TAG = MainThread.class.getSimpleName();

    // desired fps
    private final static int FPS = 50;

    public static int getFps() {
        return FPS;
    }

    // maximum number of frames to be skipped
    private final static int MAX_FRAME_SKIPS = 5;

    // the frame period
    private final static int FRAME_PERIOD = 1000 / FPS;

    // Surface holder that can access the physical surface
    private final SurfaceHolder surfaceHolder;

    // The actual view that handles inputs and draws to the surface
    private GamePanel gamePanel;

    // Flag to hold game state
    private static boolean running;

    public static void setRunning(boolean running) {
        MainThread.running = running;
    }

    public MainThread(SurfaceHolder surfaceHolder, GamePanel gamePanel) {
        super();
        this.surfaceHolder = surfaceHolder;
        this.gamePanel = gamePanel;
        running = true;
    }

    @Override
    public void run() {
        Log.d(TAG, "Starting game loop");
        Canvas canvas;

        // the time when the cycle begun
        long beginTime;

        // the time it took for the cycle to execute
        long timeDiff;

        // ms to sleep (< 0 if we're behind)
        int sleepTime;

        // number of frames being skipped
        int framesSkipped;

        while (running) {
            canvas = null;

            // try locking the canvas for exclusive pixel editing in the surface
            try {
                canvas = this.surfaceHolder.lockCanvas();

                synchronized (surfaceHolder) {

                    // update game state
                    this.gamePanel.update();

                    // render state to the screen: draws the canvas on the panel
                    this.gamePanel.render(canvas);
                }
            } finally {
                // in case of an exception the surface is not left in an inconsistent state
                if (canvas != null)
                    surfaceHolder.unlockCanvasAndPost(canvas);
            }
        }
    }
}
