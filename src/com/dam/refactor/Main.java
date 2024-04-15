package com.dam.refactor;

public class Main {
    /**
     * @param pointsPlayer1 points of player 1
     * @param pointsPlayer2 points of player 2
     * @return the score of the game
     */
    public static String getScore(int pointsPlayer1, int pointsPlayer2) {
        String score = "";
        final int MAX_SCORE=4;

        /*
        If the points of player 1 and player 2 are equal
        */
        if (pointsPlayer1 == pointsPlayer2) {
            switch (pointsPlayer1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        /*
        If the points of player 1 and player 2 are more or equal to 4
        */
        else if (pointsPlayer1 >=MAX_SCORE || pointsPlayer2 >=MAX_SCORE)
        {
            int pointsDiff = pointsPlayer1-pointsPlayer2;
            if (pointsDiff==1) score ="Advantage player1";
            else if (pointsDiff ==-1) score ="Advantage player2";
            else if (pointsDiff>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        /*
        If the points of player 1 and player 2 are less than 4 and different
        */
        else
        {

            for (int i=1; i<3; i++)
            {
                int auxScore=0;
                if (i==1) auxScore = pointsPlayer1;
                else { score+="-"; auxScore = pointsPlayer2;}
                switch(auxScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }

        }
    return score;
    }
}