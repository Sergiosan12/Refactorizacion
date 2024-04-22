package com.dam.refactor;

public class Main {

    /**
     * array of Strings and Strings finals
     */
    private static final String[] SCORES = {"Love", "Fifteen", "Thirty", "Forty"};
    private static final String[] ADVANTAGE_OR_WIN = {"Win for player2", "Advantage player2", "Deuce", "Advantage player1", "Win for player1"};
    private static final String DEUCE = "Deuce";
    private static final String ALL = "-All";
    private static final String INVALID_SCORE = "Invalid score";

    /**
     * @param pointsPlayer1 points of player 1
     * @param pointsPlayer2 points of player 2
     * @return the score of the game
     */
    public static String getScore(int pointsPlayer1, int pointsPlayer2) {
        final int MAX_SCORE = 4;

        if (pointsPlayer1 == pointsPlayer2) {
            return getScoreWhenEqual(pointsPlayer1);
        } else if (pointsPlayer1 >= MAX_SCORE || pointsPlayer2 >= MAX_SCORE) {
            return getScoreWhenMoreThanMax(pointsPlayer1, pointsPlayer2);
        } else {
            return getScoreWhenLessThanMax(pointsPlayer1) + "-" + getScoreWhenLessThanMax(pointsPlayer2);
        }
    }

    /**
     *
     * @param pointsPlayer
     * @return the score of the game if the score is equal
     */
    private static String getScoreWhenEqual(int pointsPlayer){
        if (pointsPlayer < SCORES.length) {
            return SCORES[pointsPlayer] + ALL;
        } else {
            return DEUCE;
        }
    }

    /**
     *
     * @param pointsPlayer1
     * @param pointsPlayer2
     * @return the score of the game if the score of both players is more than 4
     */
    private static String getScoreWhenMoreThanMax(int pointsPlayer1, int pointsPlayer2) {
        int pointsDiff = pointsPlayer1 - pointsPlayer2 + 2;
        if (pointsDiff >= 0 && pointsDiff < ADVANTAGE_OR_WIN.length) {
            return ADVANTAGE_OR_WIN[pointsDiff];
        } else {
            return INVALID_SCORE;
        }
    }

    /**
     *
     * @param pointsPlayer
     * @return the score of the player if the score is less than 4 and not equal
     */
    private static String getScoreWhenLessThanMax(int pointsPlayer) {
        if (pointsPlayer < SCORES.length) {
            return SCORES[pointsPlayer];
        } else {
            return INVALID_SCORE;
        }
    }
}