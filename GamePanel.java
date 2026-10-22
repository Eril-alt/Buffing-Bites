/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.buffingbites;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * TEAM MEMBER: Yee
 *
 * PURPOSE:
 * This class contains the actual Snake gameplay screen.
 *
 * RESPONSIBILITIES:
 * 1. Draw the game board and snake.
 * 2. Handle snake movement.
 * 3. Read keyboard controls.
 * 4. Spawn regular food.
 * 5. Detect food, wall, and self-collisions.
 * 6. Increase the snake's length when it eats.
 *
 * IMPORTANT:
 * Keep the special-fruit effects in BuffManager.java.
 * Keep score calculations in ScoreManager.java.
 */
public class GamePanel extends JPanel implements ActionListener {

    // TODO: Coordinate with Ken on the final board dimensions.
    private final int TILE_SIZE = 20;
    private final int BOARD_COLUMNS = 30;
    private final int BOARD_ROWS = 20;

    // TODO: Choose the final starting position and snake length.
    private int[] snakeX = new int[BOARD_COLUMNS * BOARD_ROWS];
    private int[] snakeY = new int[BOARD_COLUMNS * BOARD_ROWS];
    private int snakeLength = 3;

    // TODO: Add variables for the regular food's grid position.
    private int foodX;
    private int foodY;

    // TODO: Track the snake's movement direction.
    // Suggested values: "UP", "DOWN", "LEFT", "RIGHT".
    private String direction = "RIGHT";
    private String nextDirection = "RIGHT";

    // Swing Timer controls the game's repeating update.
    private Timer gameTimer;

    // TODO: Track whether the game is running or over.
    private boolean gameRunning = false;

    public GamePanel() {
        setPreferredSize(new Dimension(
            BOARD_COLUMNS * TILE_SIZE,
            BOARD_ROWS * TILE_SIZE
        ));

        setBackground(Color.decode("#1A0B2E"));
        setFocusable(true);

        // TODO: Implement keyboard controls.
        setupKeyboardControls();

        // TODO: Initialize the snake's starting position.
        initializeSnake();

        // TODO: Place the first regular food item.
        spawnRegularFood();

        // TODO: Choose a suitable update interval.
        // Example: approximately 100 milliseconds per update.
        gameTimer = new Timer(100, this);
    }

    /*
     * TODO: Place the snake near the center of the board.
     * Set each segment's coordinates.
     * Make sure the initial snake fits inside the board.
     */
    private void initializeSnake() {
        // YOUR CODE HERE
    }

    /*
     * TODO: Use Swing key bindings or a KeyListener to detect
     * the arrow keys or WASD.
     *
     * IMPORTANT:
     * Prevent the snake from reversing directly into itself.
     * Example: if moving RIGHT, do not allow LEFT immediately.
     */
    private void setupKeyboardControls() {
        // YOUR CODE HERE
    }

    /*
     * TODO: Choose a random grid position for regular food.
     * Do not place food on any segment of the snake.
     */
    private void spawnRegularFood() {
        // YOUR CODE HERE
    }

    /*
     * TODO: Move the snake one tile in its current direction.
     * Shift the body segments so they follow the head.
     */
    private void moveSnake() {
        // YOUR CODE HERE
    }

    /*
     * TODO: Check whether the snake's head touches regular food.
     * If it does:
     * 1. Increase snakeLength.
     * 2. Ask ScoreManager to add the appropriate points.
     * 3. Spawn another regular food item.
     */
    private void checkRegularFoodCollision() {
        // YOUR CODE HERE
    }

    /*
     * TODO: Check whether the snake hits a wall or its own body.
     * If a collision occurs, stop the game and trigger game over.
     * Coordinate the game-over behavior with Estrada and Ken.
     */
    private void checkCollisions() {
        // YOUR CODE HERE
    }

    /*
     * TODO: Update the game state on each timer tick.
     * Suggested order:
     * 1. Move the snake.
     * 2. Check regular food.
     * 3. Check collisions.
     * 4. Repaint the screen.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // YOUR CODE HERE
        repaint();
    }

    /*
     * TODO: Draw the grid, snake, regular food, and any HUD elements.
     * Use the agreed BuffingBites color palette.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();

        // TODO: Enable antialiasing if desired.
        // TODO: Draw the board and its grid lines.
        // TODO: Draw the snake's body and head.
        // TODO: Draw regular food.
        // TODO: Draw score or status information if appropriate.

        g2.dispose();
    }

    /*
     * TODO: Start a new game.
     * Reset the snake, food, direction, and running state.
     * Start the timer and request keyboard focus.
     */
    public void startGame() {
        // YOUR CODE HERE
    }

    /*
     * TODO: Stop the timer when leaving the game or ending a round.
     */
    public void stopGame() {
        // YOUR CODE HERE
    }
}

