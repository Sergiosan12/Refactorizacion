package com.dam.refactor;

public class Main {

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
    //TODO: Refactor this method to use an Array instead of a switch
    private static String getScoreWhenEqual(int pointsPlayer){
            switch (pointsPlayer) {
                case 0:
                    return "Love-All";
                case 1:
                    return "Fifteen-All";
                case 2:
                    return "Thirty-All";
                case 3:
                    return  "Forty-All";
                default:
                    return "Deuce";

        }
    }

    /**
     *
     * @param pointsPlayer1
     * @param pointsPlayer2
     * @return the score of the game if the score of both players is more than 4
     */
    private static String getScoreWhenMoreThanMax(int pointsPlayer1, int pointsPlayer2) {
        int pointsDiff = pointsPlayer1 - pointsPlayer2;
        if (pointsDiff == 1) {
            return "Advantage player1";
        } else if (pointsDiff == -1) {
            return "Advantage player2";
        } else if (pointsDiff >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }


    /**
     *
     * @param pointsPlayer
     * @return the score of the player if the score is less than 4
     */
    private static String getScoreWhenLessThanMax(int pointsPlayer) {
            switch (pointsPlayer) {
                case 0:
                    return "Love";
                case 1:
                    return "Fifteen";
                case 2:
                    return "Thirty";
                default:
                    return "Forty";
            }
        }

}