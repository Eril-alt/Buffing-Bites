/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.buffingbites;

import java.util.List;

/*
 * TEAM MEMBER: Tantay
 *
 * PURPOSE:
 * Handle persistent game data.
 *
 * RESPONSIBILITIES:
 * 1. Save completed game scores.
 * 2. Load saved scores for the High Scores screen.
 * 3. Keep score data available after the game closes.
 * 4. Handle file/database errors safely.
 *
 * IMPORTANT:
 * Confirm the instructor's required storage technology first.
 * Possible options include CSV, TXT, or a database.
 * Do not choose one until the requirement is confirmed.
 */
public class DataManager {

    /*
     * TODO: Implement this method after the storage method is agreed upon.
     *
     * Parameters:
     * playerName - the name associated with the score
     * score      - the final score for the completed game
     *
     * Return:
     * true if saving succeeds; false if it fails.
     */
    public boolean saveScore(String playerName, int score) {
        // YOUR CODE HERE
        return false;
    }

    /*
     * TODO: Load saved scores from the agreed storage system.
     *
     * Coordinate the return format with Ken before implementing
     * the High Scores screen.
     */
    public List<String> loadHighScores() {
        // YOUR CODE HERE
        return List.of();
    }

    /*
     * TODO: Decide how the application should handle missing,
     * empty, or unreadable score data.
     */
    public boolean isStorageAvailable() {
        // YOUR CODE HERE
        return false;
    }
}

